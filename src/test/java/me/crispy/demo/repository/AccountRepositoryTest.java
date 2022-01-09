package me.crispy.demo.repository;

import me.crispy.demo.domain.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AccountRepositoryTest {

    @Test
    @DisplayName("Mockito 사용하여 객체 생성 테스트")
    void testSaveWithMock() {
        Account account = Mockito.mock(Account.class);
        account.setName("crispy");
        account.setAge(20);

        AccountRepository accountRepository = Mockito.mock(AccountRepository.class);

        assertNotNull(accountRepository);
    }

    @Test
    void findById() {
    }

    @Test
    void findByName() {
    }

    @Test
    void findAll() {
    }
}