package com.offer.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
  public static void main(String[] args) {
      //1：引入连接池Jar包（alibaba-druid）
      //2: 使用连接池，通过配置连接池属性，建立连接池，配置druid监控
      //3: 定义数据结构
      //4: 定义查询
      //5: 执行查询，查看结构
      SpringApplication.run(Application.class,args);
  }
}
