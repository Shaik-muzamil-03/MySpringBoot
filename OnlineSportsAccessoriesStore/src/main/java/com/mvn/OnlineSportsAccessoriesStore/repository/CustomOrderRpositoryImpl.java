package com.mvn.OnlineSportsAccessoriesStore.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.mvn.OnlineSportsAccessoriesStore.entity.Orders;

public class CustomOrderRpositoryImpl implements CustomOrderRepository{
	
	@Autowired
	EntityManager jpa;

	@SuppressWarnings("deprecation")
	@Override
	public List<Orders>  getPreviousOrders() {
		Session spring = jpa.unwrap(Session.class);
		String query = "from Orders o where o.status =:enteredName";
		
		Query<Orders> q = spring.createQuery(query);
		String str = "previous";
		q.setParameter("enterdName",str);
		List<Orders> orders = q.getResultList();
		return orders;
	}

	@Override
	public List<Orders> getCurrentOrders() {
		Session spring = jpa.unwrap(Session.class);
		String query = "from Orders o where o.status =:enteredName";
		Query<Orders> q = spring.createQuery(query);
		String str = "current";
		q.setParameter("enterdName",str);
		List<Orders> ordersLS = q.getResultList();
		return ordersLS;
	}
	

}
