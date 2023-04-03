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
        try {
            Method method = service.getClass().getDeclaredMethod("create", User.class);
            if (method.isAnnotationPresent(Transaction.class)) {
                System.out.println("Pattern Proxy");
                System.out.println("Iniciando execução do método " + method.getName());
                try {
                    User result = (User) method.invoke(this.service, user);
                    System.out.println("Finalizando execução do método " + method.getName() + " com sucesso");
                    return result;
                } catch (Exception e) {
                    System.out.println("Finalizando execução do método " + method.getName() + " com erro");
                    return null;
                }
            }
            return (User) method.invoke(this.service, user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User findById(UUID id) {
        try {
            Method method = service.getClass().getDeclaredMethod("findById", UUID.class);
            if (method.isAnnotationPresent(Transaction.class)) {
                System.out.println("Pattern Proxy");
                System.out.println("Iniciando execução do método " + method.getName());
                try {
                    User result = (User) method.invoke(this.service, id);
                    System.out.println("Finalizando execução do método " + method.getName() + " com sucesso");
                    return result;
                } catch (Exception e) {
                    System.out.println("Finalizando execução do método " + method.getName() + " com erro");
                    return null;
                }
            }
            return (User) method.invoke(this.service, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User updateById(UUID id, User userToUpdate) {
        try {
            Method method = service.getClass().getDeclaredMethod("updateById", UUID.class, User.class);
            if (method.isAnnotationPresent(Transaction.class)) {
                System.out.println("Pattern Proxy");
                System.out.println("Iniciando execução do método " + method.getName());
                try {
                    User result = (User) method.invoke(this.service, id, userToUpdate);
                    System.out.println("Finalizando execução do método " + method.getName() + " com sucesso");
                    return result;
                } catch (Exception e) {
                    System.out.println("Finalizando execução do método " + method.getName() + " com erro");
                    return null;
                }
            }
            return (User) method.invoke(this.service, id, userToUpdate);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteById(UUID id) {
        try {
            Method method = service.getClass().getDeclaredMethod("deleteById", UUID.class);
            if (method.isAnnotationPresent(Transaction.class)) {
                System.out.println("Pattern Proxy");
                System.out.println("Iniciando execução do método " + method.getName());
                try {
                    User result = (User) method.invoke(this.service, id);
                    System.out.println("Finalizando execução do método " + method.getName() + " com sucesso");
                } catch (Exception e) {
                    System.out.println("Finalizando execução do método " + method.getName() + " com erro");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
