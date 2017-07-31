package com.watent.schema.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public Map<String, Object> hello(@RequestParam(value = "name",defaultValue = "word") String name) {

        Map<String, Object> map = new HashMap<>();

        map.put("result", "success");
        map.put("code", 200);
        map.put("data", name+" test");

        return map;
    }

}
