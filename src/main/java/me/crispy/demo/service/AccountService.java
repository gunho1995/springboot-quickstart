package me.crispy.demo.service;

import me.crispy.demo.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountService {
    @Autowired
    JpaRepository jpaRepository;

    public JpaRepository getJpaRepository() {
        return jpaRepository;
    }
}
