package br.com.gubee.transaction;

import br.com.gubee.transaction.enums.FactoryType;
import br.com.gubee.transaction.factory.DynamicProxyFactory;
import br.com.gubee.transaction.factory.PatternProxyFactory;
import br.com.gubee.transaction.factory.ServiceFactory;
import br.com.gubee.transaction.factory.UserServiceFactory;
import br.com.gubee.transaction.model.User;

public class Program {

    public static void main(String[] args) {
        var user = new User(null, "Daniel", 19);
        var service = createFactory(FactoryType.PATTERN).createUserService();
        var createdUser = service.create(user);

        var foundUser = service.findById(createdUser.getId());

        var userToUpdate = new User(null, "Joao", 22);
        service.updateById(foundUser.getId(), userToUpdate);

        service.deleteById(foundUser.getId());

    }


    static ServiceFactory createFactory(FactoryType type) {
        return switch (type) {
            case PATTERN -> new PatternProxyFactory();
            case DYNAMIC -> new DynamicProxyFactory();
            case DEFAULT -> new UserServiceFactory();
        };
    }
}
