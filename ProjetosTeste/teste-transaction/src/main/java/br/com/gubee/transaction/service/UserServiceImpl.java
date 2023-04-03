package br.com.gubee.transaction.service;

import br.com.gubee.transaction.model.User;
import br.com.gubee.transaction.persistence.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public User createUser(User user) {
        return repository.create(user);
    }

    public User findById(UUID id) {
        return repository.findById(id);
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

    public User updateById(UUID id, User newUser) {
        return repository.updateById(id, newUser);
    }

}
