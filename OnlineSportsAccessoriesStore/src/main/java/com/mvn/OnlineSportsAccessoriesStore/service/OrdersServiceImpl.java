package com.mvn.OnlineSportsAccessoriesStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvn.OnlineSportsAccessoriesStore.entity.Orders;
import com.mvn.OnlineSportsAccessoriesStore.repository.OrdersRepository;
@Service
public class OrdersServiceImpl implements OrdersService{
	
	@Autowired
	OrdersRepository ordersRepository;

	@Override
	public List<Orders> getAllPreviousOrders() {
		List<Orders> ordersList= ordersRepository.getPreviousOrders();
		 return ordersList;
	}

	@Override
	public List<Orders> getAllCurrentOrders() {
		List<Orders> ordersList= ordersRepository.getCurrentOrders();
			 return ordersList;
	}

}
