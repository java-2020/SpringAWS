package com.ssl.coe.microservices.springboot;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application extends SpringBootServletInitializer{

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
	
		public static void main(String[] args) {
			System.out.println("Application...Step1");
			SpringApplication.run(Application.class);
			System.out.println("Application...Step2");
		}
	

		@Bean
		  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		    return args -> 
		    {
		 
		      log.debug("Let's inspect the beans provided by Spring Boot->");
		      log.debug("Susant....");
		      String[] beanNames = ctx.getBeanDefinitionNames();
		      Arrays.sort(beanNames);
		      for (String beanName : beanNames) {
		        log.debug(beanName);
		      }
		 
		    };
		  }

}