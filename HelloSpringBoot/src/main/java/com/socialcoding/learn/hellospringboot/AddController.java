package com.socialcoding.learn.hellospringboot;

import java.awt.PageAttributes.MediaType;

import javax.print.attribute.standard.Media;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
	
//	@RequestMapping(value="/{num1}/{num2}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value="/{num1}/{num2}",method=RequestMethod.GET)
			
	public String add(@PathVariable int num1,@PathVariable int num2){
		return Integer.toString(num1+num2);
	}

}
