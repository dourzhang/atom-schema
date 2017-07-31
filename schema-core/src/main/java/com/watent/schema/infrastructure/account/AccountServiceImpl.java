package com.watent.schema.infrastructure.account;

import com.watent.schema.account.Account;
import com.watent.schema.model.AccountRepository;
import com.watent.schema.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountRepository accountRepository;

    @Override
    public Long save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void delete(Long id) {
        accountRepository.delete(id);
    }
}
