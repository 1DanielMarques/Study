package br.com.gubee.transaction.factory;

import br.com.gubee.transaction.enums.FactoryType;
import br.com.gubee.transaction.service.UserService;

public interface ServiceFactory {

    UserService createUserService();

    static ServiceFactory getFactory(FactoryType type) {
        return type.getFactory();
    }


}
