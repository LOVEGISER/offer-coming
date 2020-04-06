package com.offer.oop.inheritance;

public class Test {
  public static void main(String[] args) {
    //
      People p = new Student();

      p.setName("zhangsan");
      p.setAge(20);
      System.out.println(p.toString());
      p.eat();
      ((Student) p).setNumber("321");
      System.out.println(((Student) p).getNumber());
     ((Student) p).gotoClass();



  }
}
