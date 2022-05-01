package com.mvn.OnlineSportsAccessoriesStore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvn.OnlineSportsAccessoriesStore.entity.Orders;
import com.mvn.OnlineSportsAccessoriesStore.service.OrdersService;

@RestController
@RequestMapping("/orders")
public class OrdersRestController {
	
	@Autowired
	OrdersService ordersService;
	
	
	@GetMapping("/previousOrders")
	public List<Orders> getThePreviousOrders(){
		List<Orders> orders = ordersService.getAllPreviousOrders();
		return orders;
		
	}
	@GetMapping("/currentOrders")
	public List<Orders> getTheCurrentOrders(){
		List<Orders> orders = ordersService.getAllCurrentOrders();
		return orders;
		
	}

}
