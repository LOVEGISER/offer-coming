package com.offer.exception.polymorphism.byclass;

public abstract  class People {
    private String name;//张三
    private int age;//40
    public  abstract void doJob();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
