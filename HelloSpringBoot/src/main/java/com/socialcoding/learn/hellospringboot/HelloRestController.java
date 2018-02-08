package com.socialcoding.learn.hellospringboot;
 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloRestController {
 
	
//	@RequestMapping(method = RequestMethod.POST)
//	ResponseEntity<?> add(@PathVariable String userId, @RequestBody Bookmark input) {
//		this.validateUser(userId);

  public String addEntry(@PathVariable String name) {
	  
	  System.out.println("your name s is:"+name);
    return "Hello. All your base are belong to us."+name;
  }
  


}