package com.offer.collection.list;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListDemo {
  public static void main(String[] args) {
    //
    // 1:如何定义一个LinkedList
    LinkedList linkedList = new LinkedList();

    // 2:向LinkedList添加元素
    linkedList.add("item1");
    System.out.println(linkedList);
    linkedList.addFirst("item-0");
    linkedList.addLast("item-last");
    System.out.println(linkedList);

    // 3:遍历LinkedList中的元素
    for (int i=0 ;i <linkedList.size();i++){
        System.out.println(linkedList.get(i));
    }
      System.out.println(linkedList.getFirst());
      System.out.println(linkedList.getLast());
    // 5:LinkedList元素修改
      linkedList.set(0,"new-item");
      System.out.println(linkedList);
    // 6:LinkedList数据删除
      linkedList.remove(0);
      linkedList.removeLast();
      linkedList.removeFirst();
      System.out.println(linkedList);
    // 7: 取出LinkedList第一步元素和最后一个元素
      linkedList.addLast("item");
      System.out.println(linkedList.getLast());
      System.out.println(linkedList.getFirst());

  }
}
