package com.offer.oop.inheritance;

public class Student  extends People{


    private String number;//学号


    public void gotoClass(){
        System.out.println("my number is :"+number+" ; my job is learn");
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
