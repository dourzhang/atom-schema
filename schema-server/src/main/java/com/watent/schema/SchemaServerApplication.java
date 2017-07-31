package com.watent.schema;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.watent.schema.infrastructure")
public class SchemaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchemaServerApplication.class, args);
    }
}
