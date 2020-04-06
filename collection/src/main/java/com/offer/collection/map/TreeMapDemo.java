package com.offer.collection.map;

import com.alibaba.fastjson.JSON;
import com.offer.collection.set.Student;

import java.util.TreeMap;

public class TreeMapDemo {
  public static void main(String[] args) {
       //定义
      TreeMap treeMap = new TreeMap();
      treeMap.put("k-01","v-01");
      treeMap.put("k-00","v-00");
      System.out.println(JSON.toJSONString(treeMap));
      //自定义类型的排序

      TreeMap treeMap1 = new TreeMap();
      Student student = new Student("zs",20);
      Student student2 = new Student("ls",19);

      treeMap1.put("key-01",student);
      treeMap1.put("key-00",student2);
      System.out.println(JSON.toJSONString(treeMap1));

  }
}
