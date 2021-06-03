package com.springboot.dubbo.demo.provider.orm.dao;

import com.springboot.dubbo.demo.provider.orm.entity.AtmLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface AtmLogMapper {
    @Select("select * from tb_atm_log where card_no=#{cardNo}")
    @ResultMap("BaseResultMap")
    AtmLog selectLogByCardNo(@Param("cardNo") String cardNo);

}
