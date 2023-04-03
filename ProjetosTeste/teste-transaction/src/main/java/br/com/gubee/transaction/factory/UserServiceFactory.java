package br.com.gubee.transaction.factory;

import br.com.gubee.transaction.service.UserService;
import br.com.gubee.transaction.service.UserServiceImpl;

public class UserServiceFactory implements ServiceFactory {
    @Override
    public UserService createUserService() {
        return new UserServiceImpl();
    }
}
