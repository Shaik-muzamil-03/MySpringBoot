package com.mvn.OnlineSportsAccessoriesStore.entity;

import java.time.LocalDateTime;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.UpdateTimestamp;


@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	private String status;
	@UpdateTimestamp
	private LocalDateTime orderTime;
	private int bill;
	private String billStatus;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	User obj;
	
	@ManyToMany
	private Set<Product> obj1;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int orderId, String status, LocalDateTime orderTime, int bill, String billStatus, User obj,
			Set<Product> obj1) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.orderTime = orderTime;
		this.bill = bill;
		this.billStatus = billStatus;
		this.obj = obj;
		this.obj1 = obj1;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public User getObj() {
		return obj;
	}

	public void setObj(User obj) {
		this.obj = obj;
	}

	public Set<Product> getObj1() {
		return obj1;
	}

	public void setObj1(Set<Product> obj1) {
		this.obj1 = obj1;
	}

	
	
	

}
