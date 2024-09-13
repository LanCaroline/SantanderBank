package com.santander.bank.santanderbank.service;

import com.santander.bank.santanderbank.domain.model.User;


public interface UserService {

        User findById(Long id);
        User createUser(User userToCreate);

}
