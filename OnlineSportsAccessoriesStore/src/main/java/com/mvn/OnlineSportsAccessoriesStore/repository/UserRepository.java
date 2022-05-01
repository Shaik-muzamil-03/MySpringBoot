package com.mvn.OnlineSportsAccessoriesStore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvn.OnlineSportsAccessoriesStore.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>,CustomUserRepository{
	
}














