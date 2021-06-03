package com.springboot.dubbo.demo.provider.orm;

import com.springboot.dubbo.demo.api.OrmService;
import com.springboot.dubbo.demo.api.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class SpringbootDubboProviderOrmApplicationTests {

    @Autowired
    private OrmService ormService;
    @Autowired
    private TestService testService;

        @Test
    void getAtmlog() {
        Map atmlog = ormService.getAtmlog("6226123412341234");
        System.out.println(atmlog);
    }

    @Test
    void test() {
        String test = testService.test("6226123412341234");
        System.out.println(test);
    }

    @Test
    void test2() {
        Map<String, Object> map = new HashMap<>();
        map.put("a",1);
        map.put("b",null);
        map.remove("");
        map.forEach((k, v) -> {

        });
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            iterator.remove();
        }
        Stream<Map.Entry<String, Object>> stream = map.entrySet().stream().filter(e -> (e.getValue() != null));
//        stream.forEach(e->{
//            String key = e.getKey();
//            Object value = e.getValue();
//            System.out.println(key+"  "+value);
//        });
        Map<String, Object> map1 = stream.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(map1);
    }

}
