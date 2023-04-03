package br.com.gubee.transaction.persistence;

import br.com.gubee.transaction.model.User;

import java.util.UUID;

public interface UserRepository {

    User create(User user);

    User findById(UUID id);

    void deleteById(UUID id);

    User updateById(UUID id, User newUser);

}
