package com.demo.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.entity.OrderDetailsEntity;
import com.demo.model.Customer;
import com.demo.model.OrderItem;
import com.demo.repository.OrderDetailsRepo;

@Service
public class OrderServImpl  implements OrderService{

	@Autowired
	private OrderDetailsRepo orderDetailsRepo;
	
	public OrderDetailsEntity getAllOrder(Customer cust) {
		
		RestTemplate restTemplate = new RestTemplate();
	    final String baseUrl = "http://localhost:5454/createitem/getorder/"+cust.getProductCode();
	   
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	 
	    OrderItem result = restTemplate.getForObject(baseUrl, OrderItem.class);
	    OrderDetailsEntity saveCustomerDetails = saveCustomerDetails(cust, result);
		return saveCustomerDetails;
	}
	
	private OrderDetailsEntity saveCustomerDetails( Customer cust, OrderItem ordeitm) {
		
		OrderDetailsEntity  entity = new OrderDetailsEntity();
		entity.setCustomerName(cust.getCustomerName());
		entity.setShipping_address(cust.getShipping_address());
		entity.setOrderDate(cust.getOrderDate());
		entity.setProductCode(ordeitm.getProductCode());
		entity.setProductName(ordeitm.getProductName());
		
		orderDetailsRepo.save(entity);
		return entity;
		
		
	}

}
