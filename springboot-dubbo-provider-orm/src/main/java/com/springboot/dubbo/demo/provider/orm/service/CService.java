package com.springboot.dubbo.demo.provider.orm.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CService {
    public CService(){
        System.out.println("C");
    }
}
