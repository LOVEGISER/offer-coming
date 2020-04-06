package com.offer.input;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferWriterDemo {
  public static void main(String[] args)throws Exception {
      //1:定义一个FileWriter
      String path = "/Users/wangleigis163.com/Documents/alex/dev/code/private/offer-coming/input-output/src/main/resources/File-Test.txt";
      FileWriter  writer = new FileWriter(path);
      //2:定义一个BufferWriter
      BufferedWriter bufferedWriter = new BufferedWriter(writer);
      //3:向BufferWriter写入数据
      bufferedWriter.write("write by str");
    //  bufferedWriter.write("write by byte".toCharArray());
      //4: 关闭BufferWriter
      bufferedWriter.close();
      writer.close();
      //5:关闭FileWriter
  }
}
