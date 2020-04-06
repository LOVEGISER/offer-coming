package com.offer.collection.map;

import com.alibaba.fastjson.JSON;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args){
        //1:定义一个ConcurrentHashMap
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        //2：添加一条数据到ConcurrentHashMap
        String key = "key-1";
        String value = "Value-1";
        concurrentHashMap.put(key,value);
        System.out.println(JSON.toJSON(concurrentHashMap));
        String newValue = "new-value-1";
        concurrentHashMap.put(key,newValue);
        System.out.println(JSON.toJSON(concurrentHashMap));
        concurrentHashMap.remove(key);
        System.out.println(JSON.toJSON(concurrentHashMap));

        concurrentHashMap.put(key,newValue);
        Set<Map.Entry> entrySet = concurrentHashMap.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry entry =   (Map.Entry) it.next();
            System.out.println(JSON.toJSONString(entry));
        }

    }



}
