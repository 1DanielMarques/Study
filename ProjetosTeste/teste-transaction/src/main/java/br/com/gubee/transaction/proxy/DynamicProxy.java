package br.com.gubee.transaction.proxy;

import br.com.gubee.transaction.annotation.Transaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

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
        Object result;
        if (method.isAnnotationPresent(Transaction.class)) {
            System.out.println("Iniciando execução do método " + method.getName());
            try{
                result = method.invoke(this.object, args);
                System.out.println("Finalizando execução do método " + method.getName() + " com sucesso");
                return result;
            }catch (Exception e){
                System.out.println("Finalizando execução do método " + method.getName() + " com erro");
                return null;
            }
        }
        result = method.invoke(this.object, args);
        return result;
    }
}
