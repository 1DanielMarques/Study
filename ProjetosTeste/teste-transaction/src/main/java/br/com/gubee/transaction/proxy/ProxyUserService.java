package br.com.gubee.transaction.proxy;

import br.com.gubee.transaction.model.User;
import br.com.gubee.transaction.service.UserService;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class ProxyUserService implements UserService {

    private UserService userService;

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User findById(UUID id) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }

    @Override
    public User updateById(UUID id, User newUser) {
        return null;
    }
}
