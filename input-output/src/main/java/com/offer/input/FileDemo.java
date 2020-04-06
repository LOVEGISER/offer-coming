package com.offer.input;

import java.io.File;

public class FileDemo {
  public static void main(String[] args) {
       //创建一个文件路径
      String path = "/Users/wangleigis163.com/Documents/alex/dev/code/private/offer-coming/input-output/src/main/resources/";
      String fileName = "File-Test.txt";
      File file = new File(path,fileName);
//      System.out.println(file.isFile());//true
//      System.out.println(file.isDirectory());//false
//
//      System.out.println(file.canRead());//false
//      System.out.println(file.canWrite());//false
//      System.out.println(file.canExecute());//false

      System.out.println(file.getAbsolutePath());//获取文件绝对路径
      System.out.println(file.getParent());//获取文件相对路径

      System.out.println(file.length());//获取文件的大小
      System.out.println(file.lastModified());//获取文件的最后修改时间

  }
}
