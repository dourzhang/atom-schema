package com.watent.schema.controller;

import com.watent.schema.account.Account;
import com.watent.schema.protocol.AccountManagerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountManagerClient accountManagerClient;

    @GetMapping("/{id}")
    public Map<String, Object> findOne(@PathVariable("id") Long id) {

        Map<String, Object> map = new HashMap<>();

        Account account = accountManagerClient.findOne(id);
        map.put("result", "success");
        map.put("code", 200);
        map.put("data", account);

        return map;
    }

}
