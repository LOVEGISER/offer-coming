package com.offer.exception.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Student extends People {

    private String grade;//所在年级：高一、高二、高三
    private String className;//班级名称：一班、二班、三班
    Logger logger = LoggerFactory.getLogger(Student.class);
    private void learn(){
        logger.info(" my job is learning");

    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
