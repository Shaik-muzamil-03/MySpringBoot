package com.mvn.OnlineSportsAccessoriesStore.repository;

import java.util.List;

import com.mvn.OnlineSportsAccessoriesStore.entity.Orders;

public interface CustomOrderRepository {
	public List<Orders> getPreviousOrders();
	public List<Orders> getCurrentOrders();
	

}
