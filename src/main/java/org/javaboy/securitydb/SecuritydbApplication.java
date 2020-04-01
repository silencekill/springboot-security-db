package org.javaboy.securitydb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.javaboy.securitydb.mapper")
public class SecuritydbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecuritydbApplication.class, args);
    }

}
