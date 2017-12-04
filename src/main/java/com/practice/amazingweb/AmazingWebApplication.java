package com.practice.amazingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmazingWebApplication {

	public static void main(String[] args) 
        {
	  System.out.println("Hello ,World Changed from diff src");
	  SpringApplication.run(AmazingWebApplication.class, args);
	}
}
