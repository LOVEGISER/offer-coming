package com.offer.collection.queue;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueDemo {

    public static void main(String[] args){
        LinkedBlockingQueue queue = new LinkedBlockingQueue();

    new Thread(
            new Runnable() {
              @Override
              public void run() {
                try {
                  for (int i = 0; i < 1000; i++) {
                    queue.add(i);
                    System.out.println("add data from queue" + i);
                    Thread.sleep(1000);
                  }
                } catch (Exception e) {
                  e.printStackTrace();
                }
              }
            })
        .start();


        new Thread(new Runnable() {
            @Override public void run() {
                try{
                    while (true){
                        Object o = queue.take();
                        System.out.println("get data from queue"+o);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }}).start();

    }



}
