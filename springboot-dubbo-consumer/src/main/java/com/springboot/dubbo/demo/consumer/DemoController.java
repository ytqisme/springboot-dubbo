package com.springboot.dubbo.demo.consumer;

import com.springboot.dubbo.demo.api.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @DubboReference(version = "1.0.0",group = "demo",protocol = "dubbo",timeout = 100,methods = {@Method(name = "hello",timeout = 300)})
    private DemoService demoService;

    public DemoController(){
        System.out.println("--DemoController--");
    }

    @GetMapping("/hello/{msg}")
    public String hello(@PathVariable("msg") String msg) throws InterruptedException {
        System.out.println("Consumer:"+msg);
        return demoService.hello(msg);
    }
    @GetMapping("/test1/{msg}")
    public String test1(@PathVariable("msg") String msg){
        System.out.println("Consumer:"+msg);
        return demoService.test1(msg);
    }
}
