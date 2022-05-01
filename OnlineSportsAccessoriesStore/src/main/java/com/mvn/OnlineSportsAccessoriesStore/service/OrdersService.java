package com.mvn.OnlineSportsAccessoriesStore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mvn.OnlineSportsAccessoriesStore.entity.Orders;

@Service
public interface OrdersService {
	public List<Orders> getAllPreviousOrders();
	public List<Orders> getAllCurrentOrders();

}
