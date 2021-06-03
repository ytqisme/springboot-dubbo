package com.springboot.dubbo.demo.provider.orm.service;

import com.springboot.dubbo.demo.api.TestService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class TestServiceImpl implements TestService {
    @Override
    public String test(String msg) {
        return "TestService test="+msg;
    }

    @Override
    public String test2(String msg) {
        return "TestService test2="+msg;
    }
}
