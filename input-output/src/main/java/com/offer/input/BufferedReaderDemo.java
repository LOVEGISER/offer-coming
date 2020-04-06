package com.offer.input;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderDemo {
  public static void main(String[] args) throws Exception{
    //
      String path = "/Users/wangleigis163.com/Desktop/Java输入和输出-08BufferedReader.mov";
     //1:创建FileReader
      FileReader fileReader = new FileReader(path);
      //2:基于FileReader创建BufferedReader
      BufferedReader bufferedReader = new BufferedReader(fileReader);
       //3：定义一个strLine 表示BufferedReader读取的结果
      String strLine = "";
      while ( (strLine=bufferedReader.readLine()) !=null  ){

          System.out.println(strLine);
      }

      //4:关闭fileReader
      fileReader.close();
      //5：关闭bufferedReader
      bufferedReader.close();




  }
}
