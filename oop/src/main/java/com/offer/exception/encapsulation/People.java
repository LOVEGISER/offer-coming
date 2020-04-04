package com.offer.exception.encapsulation;

public class People {

    public String name;//可公开
    protected  double weight;//包可见
    //修改属性的可见性   --private 限定只能在当前类内访问
    private  String password;//不能公开

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //成员方法
    public void eat(){
        System.out.println("我吃东西了");
    }
    public void run(){
        System.out.println("我跑了");
    }
}
