package com.watent.schema.protocol;

import com.watent.schema.account.Account;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

import java.util.List;

/**
 * AccountManager Client
 * <p>
 * Created by Atom on 2017/7/17.
 */
@FeignClient(name = "schema-server/account")
public interface AccountManagerClient extends BaseClient<Account> {

    /**
     * 通过名字查找
     *
     * @return Pojo
     */
    @RequestLine("GET /nickName/{name}")
    List<Account> findByNickName(@Param("name") String name);

}
