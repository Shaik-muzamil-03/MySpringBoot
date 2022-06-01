package com.mvn.OnlineSportsAccessoriesStore.entity;

import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class UserDetails {
	private String Name;
	private String houseAddress;
	private String city;
	private long mobileNumber;
	private String email;
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(String name, String houseAddress, String city, long mobileNumber, String email) {
		super();
		Name = name;
		this.houseAddress = houseAddress;
		this.city = city;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getHouseAddress() {
		return houseAddress;
	}
	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Name, city, email, houseAddress, mobileNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDetails other = (UserDetails) obj;
		return Objects.equals(Name, other.Name) && Objects.equals(city, other.city)
				&& Objects.equals(email, other.email) && Objects.equals(houseAddress, other.houseAddress)
				&& mobileNumber == other.mobileNumber;
	}
	@Override
	public String toString() {
		return "UserDetails [Name=" + Name + ", houseAddress=" + houseAddress + ", city=" + city + ", mobileNumber="
				+ mobileNumber + ", email=" + email + "]";
	}
	
}
