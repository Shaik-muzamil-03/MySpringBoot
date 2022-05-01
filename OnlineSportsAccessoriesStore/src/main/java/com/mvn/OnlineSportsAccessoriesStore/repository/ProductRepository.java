package com.mvn.OnlineSportsAccessoriesStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvn.OnlineSportsAccessoriesStore.entity.Product;

@Repository

public interface ProductRepository  extends JpaRepository<Product, Integer>{


	

}
