package com.springboot.dubbo.demo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ConsumerApp
 *
 */
@EnableDubboConfig
@SpringBootApplication
public class ConsumerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerApp.class,args);
    }
}
