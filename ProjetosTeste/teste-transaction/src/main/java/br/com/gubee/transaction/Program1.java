package br.com.gubee.transaction;

import br.com.gubee.transaction.model.User;
import br.com.gubee.transaction.persistence.InMemoryUserRepository;
import br.com.gubee.transaction.proxy.DynamicProxy;
import br.com.gubee.transaction.service.UserService;
import br.com.gubee.transaction.service.UserServiceImpl;

public class Program1 {

    static UserService service = new UserServiceImpl(new InMemoryUserRepository());

    public static void main(String[] args) {
        var user = new User(null, "Daniel", 19);
        var proxy = (UserService) DynamicProxy.createProxy(service);
        user = proxy.createUser(user);
        



    }
}
