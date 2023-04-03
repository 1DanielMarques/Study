package br.com.gubee.transaction.proxy;

import br.com.gubee.transaction.annotation.Transaction;
import br.com.gubee.transaction.model.User;
import br.com.gubee.transaction.service.UserService;
import br.com.gubee.transaction.service.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.UUID;

public class DynamicProxyUserService implements UserService {
    static class DynamicProxy implements InvocationHandler {

        private Object object;

        public DynamicProxy(Object object) {
            this.object = object;
        }

        public static Object createProxy(Object object) {
            return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                    object.getClass().getInterfaces(),
                    new DynamicProxy(object));
        }


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (method.isAnnotationPresent(Transaction.class)) {
                System.out.println("Dynamic Proxy");
                System.out.println("Iniciando execução do método " + method.getName());
                try {
                    User result = (User) method.invoke(this.object, args);
                    System.out.println("Finalizando execução do método " + method.getName() + " com sucesso");
                    return result;
                } catch (Exception e) {
                    System.out.println("Finalizando execução do método " + method.getName() + " com erro");
                    return null;
                }
            }
            return method.invoke(this.object, args);
        }
    }

    private UserService proxy = (UserService) DynamicProxy.createProxy(new UserServiceImpl());

    @Override
    public User create(User user) {
        return proxy.create(user);
    }

    @Override
    public User findById(UUID id) {
        return proxy.findById(id);
    }

    @Override
    public User updateById(UUID id, User userToUpdate) {
        return proxy.updateById(id,userToUpdate);
    }

    @Override
    public void deleteById(UUID id) {
        proxy.deleteById(id);
    }
}
