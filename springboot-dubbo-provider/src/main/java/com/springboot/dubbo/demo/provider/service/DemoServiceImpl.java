package com.springboot.dubbo.demo.provider.service;

import com.springboot.dubbo.demo.api.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(group = "demo",version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String hello(String msg) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Provider:"+msg);
        return "Pro recved ===="+msg;
    }

    @Override
    public String test1(String msg) {
        System.out.println("Pro DemoService test1 recved:"+msg);
        return "Pro DemoService test1 recved ===="+msg;
    }
}
