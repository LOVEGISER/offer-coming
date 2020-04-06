package com.offer.collection.set;

public class Student implements  Comparable<Student>{
    private String name;
    private int age;

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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        int diff = this.age - o.age;
        if (diff>0){
            return -1;
        }else{
            return  1;
        }

    }
}
