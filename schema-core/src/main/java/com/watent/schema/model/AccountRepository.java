package com.watent.schema.model;

import com.watent.schema.account.Account;

import java.util.List;

public interface AccountRepository {

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

    /**
     * 主键查找
     *
     * @param id ID
     */
    Account findOne(Long id);

    /**
     * 通过昵称查找
     *
     * @param nickName 昵称
     */
    List<Account> findByNickName(String nickName);
}
