package com.offer.collection.map;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
  public static void main(String[] args) {
      //1:HashMap的初始化
      HashMap map = new HashMap();
      //2:想HashMap中添加一条数据
      String key = "key-01";
      String value = "value-01";
      map.put(key,value);

      System.out.println(JSON.toJSON(map));
      //3:获取HashMap中的一个数据
      Object value1 = map.get(key);
      System.out.println(JSON.toJSON(value1));
      //4:修改HashMap中的一个数据
      String value2 = "value-02";
      map.put(key,value2);
      System.out.println(JSON.toJSON(map));
      //5：删除HashMap中的一个数据
      map.remove(key);
      System.out.println(JSON.toJSON(map));//map is empty
      //6:遍历HashMap
      map.put(key,value);
      Set<Map.Entry> entrySet = map.entrySet();
       Iterator it = entrySet.iterator();
       while (it.hasNext()){
           Map.Entry entry =   (Map.Entry) it.next();
           System.out.println(entry.getKey());
       }
  }
}
