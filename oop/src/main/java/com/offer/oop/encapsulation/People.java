package com.offer.oop.encapsulation;

public class People {

    public String name;//公开可见
    protected String weight;//限定只能在当前类中范围
    private String password;//不能公开，属于需要封装的属性

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void eat(){
        System.out.println("i am eat");
    }
    public void sleep(){
        System.out.println("i am sleep" );
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
