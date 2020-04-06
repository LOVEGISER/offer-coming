package com.offer.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamDemo {
  public static void main(String[] args) {
    //
      FileInputStream fileInputStream = null;
      try {
      String path =
          "/Users/wangleigis163.com/Documents/alex/dev/code/private/offer-coming/input-output/src/main/resources/";
      String fileName = "File-Test.txt";
      File file = new File(path, fileName);
      //1：从外部文件读取数据到Java中
       fileInputStream = new FileInputStream(file);
      byte[] bytes = new byte[1024];
      //定义文件数据的大小
        int n = 0;
        while ((n = fileInputStream.read(bytes)) !=-1){
            String s = new String(bytes,0,n);
            System.out.println(s);
            System.out.println("n:"+n);
        }
    } catch (Exception e) {
      e.printStackTrace();
    }
    finally{
          try{
              fileInputStream.close();//输入文件流的关闭
          }catch (Exception e){
              e.printStackTrace();
          }
    }
  }
}
