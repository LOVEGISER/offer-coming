package com.offer.oop.polymorphism;

public class Teacher extends People {
    private String group;
    @Override
    public void eat() {

       // super.eat();
        System.out.println("i am Teacher ");
    }

}
