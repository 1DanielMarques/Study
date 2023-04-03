package br.com.gubee.transaction.factory;

import br.com.gubee.transaction.proxy.DynamicProxyUserService;
import br.com.gubee.transaction.service.UserService;

public class DynamicProxyFactory implements ServiceFactory {
    @Override
    public UserService createUserService() {
        return new DynamicProxyUserService();
    }
}
