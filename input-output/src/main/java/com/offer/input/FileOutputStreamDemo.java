package com.offer.input;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
  public static void main(String[] args) throws Exception{
    //


      String path = "/Users/wangleigis163.com/Documents/alex/dev/code/private/offer-coming/input-output/src/main/resources/";
      String fileName = "File-Test.txt";
      File file = new File(path,fileName);//1:定义file
      //2:定义fileOutputStream
      FileOutputStream fileOutputStream = new FileOutputStream(file,false);
      //3:数据写入到FileOutputStream
      fileOutputStream.write("hello FileOutputStream new ".getBytes());
      //4:关闭FileOutputStream
      fileOutputStream.close();

  }
}
