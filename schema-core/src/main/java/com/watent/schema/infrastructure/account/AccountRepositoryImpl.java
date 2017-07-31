package com.watent.schema.infrastructure.account;

import com.watent.schema.account.Account;
import com.watent.schema.infrastructure.account.mapper.AccountMapper;
import com.watent.schema.model.AccountRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class AccountRepositoryImpl implements AccountRepository {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public Long save(Account account) {

        if (null == account.getId()) {
            accountMapper.insert(account);
        } else {
            accountMapper.update(account);
        }
        return account.getId();
    }

    @Override
    public void delete(Long id) {
        accountMapper.delete(id);
    }

    @Override
    public Account findOne(Long id) {
        return accountMapper.selectOne(id);
    }

    @Override
    public List<Account> findByNickName(String nickName) {
        return accountMapper.selectByNickName(nickName);
    }
}
