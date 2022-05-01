package com.mvn.OnlineSportsAccessoriesStore.util;

import com.mvn.OnlineSportsAccessoriesStore.dto.UserResponseDTO;
import com.mvn.OnlineSportsAccessoriesStore.entity.User;

public class UserToUserDTOConversion {
	public static UserResponseDTO doDTOUserConversion(User u) {
		UserResponseDTO dtoForUser = new UserResponseDTO();
		dtoForUser.setUsername(u. getUsername());
		dtoForUser.setDebitCarNo(u.getDebitCardNo());
		dtoForUser.setName(u.getUserDeatils().getName());
		dtoForUser.setTotalPurchase(u.getTotalPurchase());
		dtoForUser.setEmail(u.getUserDeatils().getEmail());
		dtoForUser.setMobileNo(u.getUserDeatils().getMobileNumber());
		
		return dtoForUser;
	}
}
