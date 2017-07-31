package com.watent.schema.infrastructure.account.mapper;

import com.watent.schema.account.Account;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;

import java.util.List;

public interface AccountMapper {

    /**
     * 新增
     *
     * @param account 账户
     */
    @Insert("insert into account (nick_name , username ,  password , created_at , updated_at) values ( #{account.nickName} , #{account.username}  ,#{account.password} , now() , now() ) ")
    @SelectKey(before = false, keyProperty = "account.id", resultType = Long.class, statementType = StatementType.STATEMENT, statement = "SELECT LAST_INSERT_ID() AS id")
    Long insert(@Param("account") Account account);

    /**
     * 更新
     *
     * @param account 账户
     */
    @Update("update account set nick_name = #{account.nickName} , password = #{account.password} , update_at = now where id = #{account.id}")
    void update(@Param("account") Account account);

    /**
     * 删除
     *
     * @param id ID
     */
    @Delete("delete from account where id = #{id}")
    void delete(@Param("id") Long id);

    /**
     * 主键查找
     *
     * @param id ID
     */
    @Select("select * from account where id = #{id}")
    @ResultMap("AccountResultMap")
    Account selectOne(@Param("id") Long id);

    /**
     * 通过昵称查找
     *
     * @param nickName 昵称
     */
    @Select("select * from account where nick_name = #{nickName}")
    @ResultMap("AccountResultMap")
    List<Account> selectByNickName(@Param("nickName") String nickName);

}
