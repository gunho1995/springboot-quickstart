package me.crispy.demo.repository;

import me.crispy.demo.domain.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    Account save(Account account);
    Optional<Account> findById(Long id);
    Optional<Account> findByName(String name);
    List<Account> findAll();
}
