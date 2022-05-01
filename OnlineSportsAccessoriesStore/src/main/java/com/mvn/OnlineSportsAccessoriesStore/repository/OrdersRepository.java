package com.mvn.OnlineSportsAccessoriesStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvn.OnlineSportsAccessoriesStore.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>,CustomOrderRepository{
	

}
