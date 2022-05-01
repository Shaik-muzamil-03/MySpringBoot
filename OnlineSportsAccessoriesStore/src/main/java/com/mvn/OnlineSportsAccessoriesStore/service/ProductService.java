package com.mvn.OnlineSportsAccessoriesStore.service;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mvn.OnlineSportsAccessoriesStore.entity.Discounts;
import com.mvn.OnlineSportsAccessoriesStore.entity.Product;

@Service
public interface ProductService {
	public Product searchProd(int Id);
	public List<Product> filterByCostLtoH();
	public List<Product> filterByCostHtoL();
	
	
	
	public boolean insertProduct(Product p);
	
	
public boolean updateDetails(String name,int cost);
	
	
	

	public Product getProduct(int id);
	public String getProduct(String prodName);
	public List<Discounts> getDiscountCoupons();

	
	public List<Product> getProductById(int id);
    public List<Product> getProductDetails(String prodName);


}
