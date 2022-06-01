package com.mvn.OnlineSportsAccessoriesStore.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.UpdateTimestamp;


@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="orders_id1",insertable = false,updatable = false)
	private int orderId;
	private String status;
	@UpdateTimestamp
	private LocalDateTime orderTime;
	private int bill;
	private String billStatus;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	
	
	
	
	

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}






	public Orders(int orderId, String status, LocalDateTime orderTime, int bill, String billStatus, User user) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.orderTime = orderTime;
		this.bill = bill;
		this.billStatus = billStatus;
		this.user = user;
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






	public User getUser() {
		return user;
	}






	public void setUser(User user) {
		this.user = user;
	}






	@Override
	public int hashCode() {
		return Objects.hash(bill, billStatus, orderId, orderTime, status, user);
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		return bill == other.bill && Objects.equals(billStatus, other.billStatus) && orderId == other.orderId
				&& Objects.equals(orderTime, other.orderTime) && Objects.equals(status, other.status)
				&& Objects.equals(user, other.user);
	}






	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", status=" + status + ", orderTime=" + orderTime + ", bill=" + bill
				+ ", billStatus=" + billStatus + ", user=" + user + "]";
	}



	



	

}
