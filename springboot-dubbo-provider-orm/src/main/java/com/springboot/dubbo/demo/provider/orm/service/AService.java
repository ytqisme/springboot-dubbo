package com.springboot.dubbo.demo.provider.orm.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class AService {
    public AService(){
        System.out.println("A");
    }
}
