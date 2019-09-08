package com.mayuri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ProfileController {
	
	@Autowired
	ProfileService profileService;
	
	
	@RequestMapping(value = "/profile", method = RequestMethod.POST, consumes="application/json")
	ResponseEntity<Customer> save(@RequestBody Customer customer){
		Customer customerRes = profileService.save(customer);
		return ResponseEntity.ok().body(customerRes);
		
	}
	
		
	
}
