package com.offer.input;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedByteBufferTest {
  public static void main(String[] args) throws Exception{
      //1:定义文件流
      String path = "/Users/wangleigis163.com/Documents/alex/dev/code/private/offer-coming/input-output/src/main/resources/File-Test.txt";
      RandomAccessFile raf = new RandomAccessFile(path,"rw");
      //2:获取FileChannel
      FileChannel fc = raf.getChannel();
      //3:定义MappedByteBuffer
      int start = 0;
      int len = 1024;
      //3.1 Map的过程其实就是磁盘文件到内存数的映射过程，FileChannel经过Map应用程序可以像内存一样使用该文件
      MappedByteBuffer mbb = fc.map(FileChannel.MapMode.PRIVATE,start,len);
      //4:MappedByteBuffer数据的输入
      mbb.put("1234567".getBytes());
      mbb.put("09878".getBytes());

      int readLength = 2;

      byte[]  a = new byte[readLength];

      System.out.println((char)mbb.get(3));


  //    System.out.println((char)mbb.get(a,1,2));

//      //5:MappedByteBuffer数据的读取
//      for (int i =start ;i<len;i++){
//          System.out.println((char)mbb.get(i));
//      }

  }
}
