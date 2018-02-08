package com.socialcoding.learn.jpa.model;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	@Autowired
	CustomerRepository repository;
	

	@RequestMapping("/add")
	//to-do : produces...json/xml
	//post
	public String addCustomer(@RequestParam("fname") String fName,@RequestParam("lname") String lastName){
		repository.save(new Customer(fName, lastName));
		return "Done";
	}
	
	
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") long id){
		String result = "";
		result = repository.findOne(id).toString();
		return result;
	}
	
	@RequestMapping("/findbylastname")
	public String fetchDataByLastName(@RequestParam("lastname") String lastName){
		String result = "";
		
		for(Customer cust: repository.findByLastName(lastName)){
			result += cust.toString() + "<br>"; 
		}
		
//		// For Stream, need @Transactional
//        System.out.println("\n4.findByLastName(@Param(\"LastName\") String email)...");
//        try (Stream<Customer> stream = repository.findByEmailReturnStream("333@yahoo.com")) {
//            stream.forEach(x -> System.out.println(x));
//        }
		
		return result;
	}
	
	@RequestMapping("/findall")
	public String findAll(){
		String result = "";
		
		for(Customer cust : repository.findAll()){
			result += cust.toString() + "<br>";
		}
		
		
		return result;
	}

}
