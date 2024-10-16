package com.santander.bank.santanderbank.service;

import com.santander.bank.santanderbank.domain.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

public interface UserService {

        User findById(Long id);
        User createUser(User userToCreate);

}
