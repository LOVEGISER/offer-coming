package com.offer.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.offer.mybatis.repository")
public class Application {

  public static void main(String[] args) {
    // 1:引入Mybatis Jar包，加入@MapperScan("com.offer.mybatis.repository")
    // 2:配置mysql数据库和Mybatis的配置
    // mybatis.mapper-locations=classpath:mapper/*Mapper.xml
    // mybatis.type-aliases-package=com.offer.mybatis.bean
    // 3:定义Mapping，定义SQL语句
    // 4:定义Repository/dao
    // 5:定义Service层
    // 6:定义控制器
    // 7:查询数据库，查看查询结果

    SpringApplication.run(Application.class, args);
  }
}
