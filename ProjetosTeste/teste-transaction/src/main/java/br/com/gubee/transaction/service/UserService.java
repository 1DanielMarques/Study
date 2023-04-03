package br.com.gubee.transaction.service;

import br.com.gubee.transaction.annotation.Transaction;
import br.com.gubee.transaction.model.User;

import java.util.UUID;

public interface UserService {

    @Transaction
    User createUser(User user);

    User findById(UUID id);

    @Transaction
    void deleteById(UUID id);

    @Transaction
    User updateById(UUID id, User newUser);

}
