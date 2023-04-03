package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		callApiAndPrintResponse();
	}

	public static void callApiAndPrintResponse() {
		RestTemplate restTemplate = new RestTemplate();
		String apiUrl = "https://taaskserver.herokuapp.com/api/user/getAllUsers";
		String response = restTemplate.getForObject(apiUrl, String.class);
		System.out.println("--------------------------------\n\n\n");
		System.out.println("\n\n\n\nI am printing the data fetched now\n\n\n");
		System.out.println(response);
		System.out.println("--------------------------------\n\n\n");
	}

}
