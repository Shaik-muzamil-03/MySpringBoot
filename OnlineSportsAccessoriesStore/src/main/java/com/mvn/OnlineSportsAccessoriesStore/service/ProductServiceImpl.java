package com.mvn.OnlineSportsAccessoriesStore.service;




import java.util.ArrayList;
import java.util.Collection;

import java.text.Normalizer.Form;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mvn.OnlineSportsAccessoriesStore.entity.Discounts;
import com.mvn.OnlineSportsAccessoriesStore.entity.Product;
import com.mvn.OnlineSportsAccessoriesStore.repository.*;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	
	
	@Override
	public Product searchProd(int Id) {
		Product obj1 =   productRepository.findById(Id).get();
		return obj1;
	
	}
	@Override
	public List<Product> filterByCostLtoH(){
		List<Product> ls =   productRepository.findAll();
		Collections.sort(ls, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				
				return o1.getCost()-o2.getCost();
			}
		});
		return ls;
	
	}
	public List<Product> filterByCostHtoL(){
		List<Product> ls =  productRepository.findAll();
		Collections.sort(ls, Collections.reverseOrder(new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				
				return o1.getCost()-o2.getCost();
			}
		}));
	
		return ls;
	}
	
	@SuppressWarnings("null")
	@Override
	public List<Discounts> getDiscountCoupons() {
		Collection<Product> product =   productRepository.findAll();
		List<Discounts> discounts = new ArrayList();
		for(final Product prod:product) {
			discounts.add(prod.getDiscount());
		}
		return discounts;
		
		
		
		
	}
	@Override
	public boolean insertProduct(Product p) {
		Product savedObject =   productRepository.save(p);
		
		return savedObject!=null?true:false;
	}




	

	
	
	
	
	
	@Override
	public List<Product> getProductById(int id) {
		// TODO Auto-generated method stub
		List<Product> ps=ProdRep.findAll();
		return ps;
	}


	@Override
	public List<Product> getProductDetails(String prodName)
	{

		List<Product> name =  ProdRep.findAll();

		
		
		return null;
	}
	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getProduct(String prodName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean updateDetails(String name, int cost) {
		// TODO Auto-generated method stub
		return false;
	}
	
	


}
