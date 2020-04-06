package com.offer.collection;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author alex
 * @create 2019-08-17
 **/
@SpringBootApplication
public class ServiceApp  {

	public static Logger logger = LoggerFactory.getLogger(ServiceApp.class);

	public static void main(String[] args) {
		SpringApplication.run(ServiceApp.class, args);


	}


}
