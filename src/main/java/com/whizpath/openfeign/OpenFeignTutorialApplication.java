package com.whizpath.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeignTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenFeignTutorialApplication.class, args);
	}

}

//    * def responseStatus = 400
	//		* def response = {content : "Bad Request"}