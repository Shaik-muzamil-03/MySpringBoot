package com.mvn.OnlineSportsAccessoriesStore.dto;

	import java.util.Objects;

	public class AccountResponseDTOAdmin {
		private String productName ;
		private String userName;
		private int productId;
		public AccountResponseDTOAdmin() {
			super();
			// TODO Auto-generated constructor stub
		}
		public AccountResponseDTOAdmin(String productName, String userName, int productId) {
			super();
			productName = productName;
			userName = userName;
			productId = productId;
		}
		
		
		
		
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + productId;
			result = prime * result + ((productName == null) ? 0 : productName.hashCode());
			result = prime * result + ((userName == null) ? 0 : userName.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AccountResponseDTOAdmin other = (AccountResponseDTOAdmin) obj;
			if (productId != other.productId)
				return false;
			if (productName == null) {
				if (other.productName != null)
					return false;
			} else if (!productName.equals(other.productName))
				return false;
			if (userName == null) {
				if (other.userName != null)
					return false;
			} else if (!userName.equals(other.userName))
				return false;
			return true;
		}
		
		

	}


