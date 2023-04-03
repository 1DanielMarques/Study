package br.com.gubee.transaction.service;

import br.com.gubee.transaction.annotation.Transaction;
import br.com.gubee.transaction.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;

public class UserServiceImpl implements UserService {

    private Map<UUID, User> repository = new HashMap<>();

    @Override
    @Transaction
    public User create(User user) {
        user.setId(UUID.randomUUID());
        repository.put(user.getId(), user);
        return findById(user.getId());
    }

    @Override
    public User findById(UUID id) {
        var user = repository.get(id);
        if (user != null) return user;
        throw new NoSuchElementException();
    }

    @Override
    @Transaction
    public User updateById(UUID id, User userToUpdate) {
        findById(id);
        userToUpdate.setId(id);
        repository.put(userToUpdate.getId(), userToUpdate);
        return findById(id);
    }

    @Override
    @Transaction
    public void deleteById(UUID id) {
        findById(id);
        repository.remove(id);
    }
}
