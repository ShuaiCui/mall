package com.cui.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.cui.mall.mbg.mapper","com.macro.mall.tiny.dao"})
public class MyBatisConfig {
}
