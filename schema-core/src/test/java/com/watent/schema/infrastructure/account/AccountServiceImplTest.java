package com.watent.schema.infrastructure.account;

import com.watent.schema.account.Account;
import com.watent.schema.infrastructure.BaseTest;
import com.watent.schema.service.AccountService;
import org.junit.Test;

import javax.annotation.Resource;

public class AccountServiceImplTest extends BaseTest {

    @Resource
    private AccountService accountService;

    @Test
    public void save() throws Exception {

        Account account = new Account();
        account.setNickName("service test");
        account.setUsername("hello");
        account.setPassword("123456");

        accountService.save(account);
    }

    @Test
    public void delete() throws Exception {
    }

}