package com.watent.schema.provider.account;

import com.watent.schema.account.Account;
import com.watent.schema.model.AccountRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountManagerImpl {

    @Resource
    private AccountRepository accountRepository;

    @PostMapping("/save")
    Long save(Account account) {
        return accountRepository.save(account);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") Long id) {
        accountRepository.delete(id);
    }

    @GetMapping("/{id}")
    Account findOne(@PathVariable("id") Long id) {
        return accountRepository.findOne(id);
    }

    @GetMapping("/nickName/{nickName}")
    List<Account> findByNickName(@PathVariable("nickName") String nickName) {
        return accountRepository.findByNickName(nickName);
    }

}
