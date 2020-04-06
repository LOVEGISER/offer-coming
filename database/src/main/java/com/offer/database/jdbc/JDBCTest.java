package com.offer.database.jdbc;

import com.alibaba.fastjson.JSON;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//JDBC使用
public class JDBCTest {
  public static void main(String[] args) {

    try{
      //1:引入mysql-connector-java jar包

      //2:在程序中加载JDBC驱动包
      Class.forName("com.mysql.jdbc.Driver");
      //3:获取一个数据库连接池
      String url = "jdbc:mysql://127.0.0.1:3306/test";
      String user= "root";
      String password = "root";
      Connection connection = DriverManager.getConnection(url,user,password);
      //4：基于连接池实现数据库的增删改查
      String insertSQL = "INSERT INTO test.`user` (id,email,name) VALUES ('1','alex@163.com','alex')";
      String updateSQL = "UPDATE  test.`user`  SET name = 'alex.update.java' WHERE id='1'";

      String selectSQL = "SELECT * FROM test.`user` u";
      String deleteSql = "DELETE FROM test.`user`  WHERE id = '1'";
      PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
      preparedStatement.execute();//执行insert、update、delete
      //执行select语句，需要返回查询结果和列表
      //ResultSet resultSet =preparedStatement.executeQuery();
      //4.1 处理返回的数据
   /*   while (resultSet.next()){
        System.out.println("id:"+resultSet.getString("id"));
        System.out.println("email"+resultSet.getString("email"));
        System.out.println("name:"+resultSet.getString("name"));
      }
    */
      //5:关闭资源
      preparedStatement.close();
      connection.close();
    }catch (Exception e){
      e.printStackTrace();
    }
  }
}
