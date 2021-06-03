package com.springboot.dubbo.demo.consumer;

import com.alibaba.fastjson.JSON;
import com.springboot.dubbo.demo.api.DemoService;
import com.springboot.dubbo.demo.api.OrmService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @DubboReference(version = "1.0.0",group = "demo",protocol = "dubbo",timeout = 10000,methods = {@Method(name = "hello",timeout = 300)})
    private DemoService demoService;
    @DubboReference(version = "1.0.0")
    private OrmService ormService;

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
        System.out.println("Consumer1:"+msg);
        return demoService.test1(msg);
    }

    @GetMapping("/test2/{cardNo}")
    public String test2(@PathVariable("cardNo") String cardNo){
        System.out.println("Consumer2:"+cardNo);
        return JSON.toJSONString(ormService.getAtmlog(cardNo));
    }
}
