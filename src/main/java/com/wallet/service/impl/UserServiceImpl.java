package com.wallet.service.impl;

import com.wallet.entity.User;
import com.wallet.repository.UserRepository;
import com.wallet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


/**
 * Camada de regra de negócio e de conexão com o banco de dados
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public User save(User u) {
        return repository.save(u);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return repository.findByEmailEquals(email);
    }
}
