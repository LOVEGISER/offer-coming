package com.offer.exception.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Teacher extends People{
    private String subject;//科目：数学老师、语文老师...
    private  String group;//年级组：高三年级组、高二年级组...
    Logger logger = LoggerFactory.getLogger(Teacher.class);
    private void teach(){
        logger.info(" my job is teaching");

   }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


}
