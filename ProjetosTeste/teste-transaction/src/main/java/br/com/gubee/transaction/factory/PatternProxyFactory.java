package br.com.gubee.transaction.factory;

import br.com.gubee.transaction.proxy.ProxyUserService;
import br.com.gubee.transaction.service.UserService;
import br.com.gubee.transaction.service.UserServiceImpl;

public class PatternProxyFactory implements ServiceFactory {
    @Override
    public UserService createUserService() {
        return new ProxyUserService(new UserServiceImpl());
    }
}
