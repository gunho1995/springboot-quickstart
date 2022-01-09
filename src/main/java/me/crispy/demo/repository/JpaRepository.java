package me.crispy.demo.repository;

import me.crispy.demo.domain.Account;

import java.util.List;
import java.util.Optional;

public class JpaRepository implements AccountRepository{
    // TO BE IMPLEMENTED AFTER UNIT TEST DESIGN
    @Override
    public Account save(Account account) {
        return null;
    }

    @Override
    public Optional<Account> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Account> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Account> findAll() {
        return null;
    }
}
