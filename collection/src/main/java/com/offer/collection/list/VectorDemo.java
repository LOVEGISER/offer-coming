package com.offer.collection.list;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {
  public static void main(String[] args) {
    //

      // 1:如何定义一个Vector
     Vector vector = new Vector();

      // 2:向Vector添加元素
      vector.add("item-1");
      vector.add("item-2");
      System.out.println(vector);
      // 3:遍历Vector中的元素
      for (int i = 0;i<vector.size();i++)
      {
          System.out.println(vector.get(i));
      }

      // 5:Vector元素修改:
      vector.set(0,"new-item-1");
      System.out.println(vector);

      // 6:Vector数据删除
      vector.remove(0);
      System.out.println(vector);
  }
}
