package com.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.OrderDetailsEntity;
import com.demo.model.Customer;
import com.demo.service.OrderService;

@RestController
public class OrderDetailsController {
	
	@Autowired
	OrderService orderService;
	@GetMapping("/getorder")
	public @ResponseBody OrderDetailsEntity createOrder(@RequestBody Customer cust) {
		
		return orderService.getAllOrder(cust);
		
		
	}
		
		
	}


