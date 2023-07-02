package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurentController {
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/getAllRestaurents")
	public List<Restaurent> getRestaurents() {
		List<Restaurent> result = new ArrayList<>();
		result.add(new Restaurent(123,"rest 1", "res1@gmail.com",
				"12335","address 1", "dine in, buffet"));
		result.add(new Restaurent(456,"rest 2", "res2@gmail.com",
				"456456","address 2", "dine in, buffet"));
		result.add(new Restaurent(789,"rest 3", "res3@gmail.com",
				"79789","address 3", "soups and momos"));
		result.add(new Restaurent(101112,"rest 4", "res4@gmail.com",
				"101112","address 5", "ham and cheese burger"));
		
		return  result;
	}
	
	

}
