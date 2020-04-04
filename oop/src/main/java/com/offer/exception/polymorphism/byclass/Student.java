package com.offer.exception.polymorphism.byclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Student extends People{
    Logger logger = LoggerFactory.getLogger(Student.class);
    @Override
    public void doJob() {
        logger.info("my job is learning ");


    }
}
