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
        return (User) executeMethod(() -> {
                    try {
                        Method method = this.service.getClass().getDeclaredMethod("create", User.class);
                        return method;
                    } catch (Exception e) {
                        throw new RuntimeException("Invalid method");
                    }
                }
                , user);
    }

    @Override
    public User findById(UUID id) {
        return (User) executeMethod(() -> {
            try {
                Method method = this.service.getClass().getDeclaredMethod("findById", UUID.class);
                return method;
            } catch (Exception e) {
                throw new RuntimeException("Invalid method");
            }
        }, id);
    }

    @Override
    public User updateById(UUID id, User userToUpdate) {
        return (User) executeMethod(() -> {
            try {
                Method method = this.service.getClass().getDeclaredMethod("updateById", UUID.class, User.class);
                return method;
            } catch (Exception e) {
                throw new RuntimeException("Invalid method");
            }
        }, id, userToUpdate);
    }

    @Override
    public void deleteById(UUID id) {
        executeMethod(() -> {
            try {
                Method method = this.service.getClass().getDeclaredMethod("deleteById", UUID.class);
                return method;
            } catch (Exception e) {
                throw new RuntimeException("Invalid Method");
            }
        }, id);
    }

    private Object executeMethod(MyInterface myInterface, Object... parameters) {
        var method = myInterface.getMethod();
        try {
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
            return method.invoke(this.service, parameters);
        } catch (Exception e) {
            throw new RuntimeException("Invalid method");
        }
    }
}

interface MyInterface {
    Method getMethod();
}
