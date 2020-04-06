package com.offer.collection.set;

import com.alibaba.fastjson.JSON;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
      //1：如何定义一个TreeSet
      TreeSet set1 = new TreeSet();
      set1.add("2");
      set1.add("1");
      //如果没后排序则打印结果为：2、1 ；如果有排序，则打印1、2
      System.out.println(set1);
      boolean exits = set1.contains("3");
      System.out.println(exits);
     Iterator it1 =  set1.iterator();
     while (it1.hasNext()){
         System.out.println(it1.next());
     }


      TreeSet<Student> setStudent = new TreeSet<Student>();

      Student s1 = new Student("zs",20);
      Student s2 = new Student("ls",19);
      setStudent.add(s1);
      setStudent.add(s2);
      System.out.println(JSON.toJSONString(setStudent));

  }
}
