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
        var method = getMethod("create", User.class);
        return (User) executeMethod(method, user);
    }

    @Override
    public User findById(UUID id) {
        var method = getMethod("findById", UUID.class);
        return (User) executeMethod(method, id);
    }

    @Override
    public User updateById(UUID id, User userToUpdate) {
        var method = getMethod("updateById", UUID.class, User.class);
        return (User) executeMethod(method, id, userToUpdate);
    }

    @Override
    public void deleteById(UUID id) {
        var method = getMethod("deleteById", UUID.class);
        executeMethod(method, id);
    }


    private Object executeMethod(Method method, Object... parameters) {
        if (method.isAnnotationPresent(Transaction.class)) {
            System.out.println("Pattern Proxy");
            System.out.println("Iniciando execução do método " + method.getName());
            try {
                var result = method.invoke(this.service, parameters);
                System.out.println("Finalizando execução do método " + method.getName() + " com sucesso");
                return result;
            } catch (Exception e) {
                System.out.println("Finalizando execução do método " + method.getName() + " com erro");
                return null;
            }
        }
        try {
            return method.invoke(this.service, parameters);
        } catch (Exception e) {
            return null;
        }
    }

    private Method getMethod(String methodName, Class... parametersType) {
        try {
            return this.service.getClass().getDeclaredMethod(methodName, parametersType);
        } catch (Exception e) {
            throw new RuntimeException("Invalid method");
        }
    }
}
