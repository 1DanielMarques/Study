package br.com.gubee.transaction.enums;

import br.com.gubee.transaction.factory.DynamicProxyFactory;
import br.com.gubee.transaction.factory.PatternProxyFactory;
import br.com.gubee.transaction.factory.ServiceFactory;
import br.com.gubee.transaction.factory.UserServiceFactory;

public enum FactoryType {

    DEFAULT(new UserServiceFactory()),
    PATTERN(new PatternProxyFactory()),
    DYNAMIC(new DynamicProxyFactory());

    private ServiceFactory factory;

    FactoryType(ServiceFactory factory) {
        this.factory = factory;
    }

    public ServiceFactory getFactory() {
        return this.factory;
    }
}
