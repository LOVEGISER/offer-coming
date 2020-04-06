package com.offer.collection.set;


import com.alibaba.fastjson.JSON;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSetDemo {
  public static void main(String[] args) {
      //定义
      LinkedHashSet linkedHashSet = new LinkedHashSet();
      linkedHashSet.add("1");
      System.out.println("add done:"+ JSON.toJSONString(linkedHashSet));
      linkedHashSet.remove("1");
      System.out.println("remove done:"+ JSON.toJSONString(linkedHashSet));
      linkedHashSet.contains("1");
      System.out.println("contains :"+ linkedHashSet.contains("1"));

      linkedHashSet.add("2");
      linkedHashSet.add("3");
      System.out.println("size :"+ linkedHashSet.size());
     Iterator it = linkedHashSet.iterator();
     while (it.hasNext()){
         System.out.println("data :"+ it.next());
     }



  }
}
