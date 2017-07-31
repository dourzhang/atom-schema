package com.watent.schema.service;

import com.watent.schema.account.Account;

public interface AccountService {

    /**
     * 新增
     *
     * @param account 账户
     */
    Long save(Account account);

    /**
     * 删除
     *
     * @param id ID
     */
    void delete(Long id);
}
