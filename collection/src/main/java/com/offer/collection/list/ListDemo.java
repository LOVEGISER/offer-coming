package com.offer.collection.list;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {

    // 1:如何定义一个ArrayList
    ArrayList arraylist = new ArrayList();
    // 2:向ArrayList添加元素
    arraylist.add("item1");
    // arraylist.add(0,"time0");
    System.out.println(JSON.toJSONString(arraylist));
    ArrayList arraylist2 = new ArrayList();
    arraylist2.add("item2");
    arraylist2.add("item3");
    System.out.println(JSON.toJSONString(arraylist2));
    arraylist.addAll(arraylist2);
    System.out.println(JSON.toJSONString(arraylist));

    // 3:遍历ArrayList中的元素
    /*  for (int i = 0 ;i<arraylist.size();i++){
              System.out.println("index:"+i+"data:"+arraylist.get(i));
          }
          //4:查询ArrayList中某个元素
          System.out.println("the first data:"+arraylist.get(0));
    */
    for (int i = 0; i < arraylist.size(); i++) {
      if ("item2".equals(arraylist.get(i))) {
        System.out.println("index:" + i + "data:" + arraylist.get(i));
        break;
      }
    }

    // 5:ArrayList元素修改:如果数组中存在需要修改数据的情况，
    // 建议使用LinkList，不要使用ArrayList
    arraylist.set(0, "new-item1");
    System.out.println(arraylist);
    // 6:ArrayList数据删除
    arraylist.remove(0);
    System.out.println(arraylist);
  }
}
