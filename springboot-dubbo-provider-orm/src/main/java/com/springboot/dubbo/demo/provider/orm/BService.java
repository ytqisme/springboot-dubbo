package com.springboot.dubbo.demo.provider.orm;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class BService {
    public BService(){
        System.out.println("B");
    }
}
