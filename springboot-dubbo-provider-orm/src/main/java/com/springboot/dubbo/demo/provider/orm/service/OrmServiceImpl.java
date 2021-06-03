package com.springboot.dubbo.demo.provider.orm.service;

import com.springboot.dubbo.demo.api.OrmService;
import com.springboot.dubbo.demo.provider.orm.dao.AtmLogMapper;
import com.springboot.dubbo.demo.provider.orm.entity.AtmLog;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

@DubboService(version = "1.0.0")
public class OrmServiceImpl implements OrmService {

    @Autowired
    private AtmLogMapper atmLogMapper;
    @Override
    public Map getAtmlog(String cardNo) {
        Map<String, Object> map = new HashMap<>();
        AtmLog atmLog = atmLogMapper.selectLogByCardNo(cardNo);
        System.out.println("---------------"+atmLog.toString());
        map.put("atmLog",atmLog);
        return map;
    }
}
