package com.mvn.OnlineSportsAccessoriesStore.dto;

import java.util.Objects;

public class UserResponseDTO {
	private String username;
	private long debitCarNo;
	private int totalPurchase;
	private String name;
	private long mobileNo;
	private String email;
	public UserResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserResponseDTO(String username, long debitCarNo, int totalPurchase, String name, long mobileNo, String email) {
		super();
		this.username = username;
		this.debitCarNo = debitCarNo;
		this.totalPurchase = totalPurchase;
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getDebitCarNo() {
		return debitCarNo;
	}
	public void setDebitCarNo(long debitCarNo) {
		this.debitCarNo = debitCarNo;
	}
	public int getTotalPurchase() {
		return totalPurchase;
	}
	public void setTotalPurchase(int totalPurchase) {
		this.totalPurchase = totalPurchase;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(debitCarNo, email, mobileNo, name, totalPurchase, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserResponseDTO other = (UserResponseDTO) obj;
		return debitCarNo == other.debitCarNo && Objects.equals(email, other.email) && mobileNo == other.mobileNo
				&& Objects.equals(name, other.name) && totalPurchase == other.totalPurchase
				&& username == other.username;
	}
	@Override
	public String toString() {
		return "UserResponseDTO [username=" + username + ", debitCarNo=" + debitCarNo + ", totalPurchase="
				+ totalPurchase + ", name=" + name + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}
	
	
	

}
