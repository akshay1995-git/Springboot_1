package com.practice;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
  

@SpringBootApplication(scanBasePackages = "com.practice")
public class SpringBootExample{

	public static void main(String[] args) { 
		System.out.print("Akshay READY to go");
	        SpringApplication.run(SpringBootExample.class, args); 
	        System.out.print("Akshay READY to go...");
	}
	


}
