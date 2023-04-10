package br.com.gubee.transaction.proxy;

import br.com.gubee.transaction.annotation.Transaction;
import br.com.gubee.transaction.model.User;
import br.com.gubee.transaction.service.UserService;
import lombok.RequiredArgsConstructor;

import java.lang.reflect.Method;
import java.util.UUID;

@RequiredArgsConstructor
public class ProxyUserService implements UserService {

    private final UserService service;


    @Override
    public User create(User user) {
        return (User) executeMethod(getMethod("create", User.class), () -> new Object[]{user});
    }

    @Override
    public User findById(UUID id) {
        return (User) executeMethod(getMethod("findById", UUID.class), () -> new Object[]{id});
    }

    @Override
    public User updateById(UUID id, User userToUpdate) {
        return (User) executeMethod(getMethod("updateById", UUID.class, User.class), () -> new Object[]{id, userToUpdate});
    }

    @Override
    public void deleteById(UUID id) {
        executeMethod(getMethod("deleteById", UUID.class), () -> new Object[]{id});
    }


    private Method getMethod(String methodName, Class... parameters) {
        try {
            var method = this.service.getClass().getDeclaredMethod(methodName, parameters);
            return method;
        } catch (Exception e) {
            throw new RuntimeException("Invalid method");
        }
    }


    private Object executeMethod(Method method, MyInterface myInterface) {
        var parameters = myInterface.get();
        var finishMessage = "Finalizando execução do método " + method.getName() + " com ";
        if (method.isAnnotationPresent(Transaction.class)) {
            System.out.println("Pattern Proxy");
            System.out.println("Iniciando execução do método " + method.getName());
            try {
                var result = method.invoke(this.service, parameters);
                System.out.println(finishMessage + " sucesso");
                return result;
            } catch (Exception e) {
                System.out.println(finishMessage + " erro");
                return null;
            }
        }

        try {
            return method.invoke(this.service, parameters);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}

interface MyInterface {
    Object[] get();
}
