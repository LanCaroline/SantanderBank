package com.santander.bank.santanderbank.domain.repository;

import com.santander.bank.santanderbank.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    boolean existsByAccountNumber(String accountNumber);

}
