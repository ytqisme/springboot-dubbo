package com.springboot.dubbo.demo.provider.orm;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.springboot.dubbo.demo.provider.orm.dao")
@EnableDubbo
@SpringBootApplication
public class SpringbootDubboProviderOrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboProviderOrmApplication.class, args);
    }

}
