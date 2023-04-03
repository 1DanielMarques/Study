package br.com.gubee.transaction.factory;

import br.com.gubee.transaction.service.UserService;

public interface ServiceFactory {

    UserService createUserService();


}
