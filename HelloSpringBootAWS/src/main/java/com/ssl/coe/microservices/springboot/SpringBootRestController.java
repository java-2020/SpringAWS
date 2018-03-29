package com.ssl.coe.microservices.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SpringBootRestController {

	@RequestMapping(value="/hello",method=RequestMethod.GET,produces = { "application/json", "application/xml" })
	@ResponseBody
	@ResponseStatus(HttpStatus.NOT_FOUND)
	//@ResponseStatus(value="HttpStatus.NOT_FOUND",reason"This customer is not found in the system")
	public ResponseEntity<String> addCustomer(@RequestParam("fname") String fName){
		System.out.println("name:"+fName);
		String s= "welcome "+fName;
		return new ResponseEntity<String>(s,HttpStatus.OK);
	}
	
}
