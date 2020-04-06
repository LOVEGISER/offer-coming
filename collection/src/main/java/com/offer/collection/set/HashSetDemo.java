package com.offer.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
  public static void main(String[] args) {
      //1:定义一个HashSet
      HashSet set = new HashSet();
      //2:向set中添加一个元素
      set.add("data1");
      set.add("data2");
      System.out.println(set);
      //遍历set中的元素
      Iterator iterator = set.iterator();
      while (iterator.hasNext()) {
          System.out.println(iterator.next());
      }

      boolean exits = set.contains("data11");
      System.out.println(exits);
      set.remove("data11");
      System.out.println(set);







  }
}
