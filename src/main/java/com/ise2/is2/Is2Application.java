package com.ise2.is2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Is2Application extends SpringBootServletInitializer {

	public static void main(String[] args){
		SpringApplication.run(Is2Application.class, args);
	}

	 @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Is2Application.class);
    }

}
