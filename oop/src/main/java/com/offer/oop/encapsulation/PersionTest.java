package com.offer.oop.encapsulation;

public class PersionTest {
  public static void main(String[] args) {
      //
      People people = new People();
      people.name = "zhangsan";
      people.weight = "100";
      people.setPassword("123");



      String weight = people.weight;
      String name = people.name;
      String password = people.getPassword();

      people.eat();
      people.sleep();


  }
}
