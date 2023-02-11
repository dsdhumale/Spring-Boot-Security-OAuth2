package com.example.OAuth2;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableOAuth2Sso
public class OAuth2Application {

	@GetMapping("/")
	public String display(){
		return "Hii OAuth program";
	}

	@GetMapping("/console")
	public String message(Principal principal) {
		return "Hi "+principal.getName()+" welcome to SpringCloudOauth2ExampleApplication";
	}

	public static void main(String[] args) {
		System.out.println("Welcome in OAuth2 project");
		SpringApplication.run(OAuth2Application.class, args);
	}

}
