package com.watent.schema.infrastructure.account;

import com.watent.schema.account.Account;
import com.watent.schema.infrastructure.BaseTest;
import com.watent.schema.model.AccountRepository;
import org.junit.Test;

import javax.annotation.Resource;

public class AccountRepositoryImplTest extends BaseTest {

    @Resource
    private AccountRepository accountRepository;

    @Test
    public void save() throws Exception {

        Account account = new Account();
        account.setNickName("repository test");
        account.setUsername("hello");
        account.setPassword("123456");

        accountRepository.save(account);
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void findOne() throws Exception {
    }

    @Test
    public void findByNickName() throws Exception {
    }

}