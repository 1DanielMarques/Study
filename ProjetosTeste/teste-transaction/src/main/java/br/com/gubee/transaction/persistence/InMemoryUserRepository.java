package br.com.gubee.transaction.persistence;

import br.com.gubee.transaction.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;

public class InMemoryUserRepository implements UserRepository {

    private final Map<UUID, User> repository = new HashMap<>();

    @Override
    public User create(User user) {
        user.setId(UUID.randomUUID());
        repository.put(user.getId(), user);
        return findById(user.getId());
    }

    @Override
    public User findById(UUID id) {
        var user = repository.get(id);
        if (user != null) {
            return user;
        }
        throw new NoSuchElementException();
    }

    @Override
    public void deleteById(UUID id) {
        var user = findById(id);
        repository.remove(user.getId());
    }

    @Override
    public User updateById(UUID id, User newUser) {
        findById(id);
        newUser.setId(id);
        repository.put(id, newUser);
        return findById(id);
    }
}
