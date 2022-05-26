package com.mvn.OnlineSportsAccessoriesStore.web;


import java.util.Collection;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mvn.OnlineSportsAccessoriesStore.entity.Discounts;
import com.mvn.OnlineSportsAccessoriesStore.entity.Product;
import com.mvn.OnlineSportsAccessoriesStore.exceptions.InvalidUserException;
import com.mvn.OnlineSportsAccessoriesStore.service.ProductService;

@RestController
@RequestMapping("/store")
@CrossOrigin(origins= {"http://localhost:8080","http://localhost:4200"},allowedHeaders="*")
public class ProductRestController {
	
	
	@Autowired
	ProductService productService;
	
	@GetMapping("user/{product}")
	public Product getProduct(@PathVariable int product,HttpServletRequest req) throws InvalidUserException{
		HttpSession session = req.getSession(false);
		if(session!=null) {
		String role = (String)session.getAttribute("role");
		if(role.equalsIgnoreCase("User")) {
		Product obj = productService.searchProd(product);
		return obj;
		}
		else {
			String username = (String)session.getAttribute("username");
			String password = (String)session.getAttribute("password");
			throw new InvalidUserException(username,password);
		}
		}
		else {
			throw new InvalidUserException("none","none");
		}
		
	}
	
	@GetMapping("user/ProductLtoH")
	public List<Product> ProductHtoL(HttpServletRequest req) throws InvalidUserException{
		HttpSession session = req.getSession(false);
		if(session!=null) {
		String role = (String)session.getAttribute("role");
		if(role.equalsIgnoreCase("User")) {
		List<Product> list = productService.filterByCostLtoH();
		return list;
		}
		else {
			String username = (String)session.getAttribute("username");
			String password = (String)session.getAttribute("password");
			throw new InvalidUserException(username,password);
		}
		}
		else {
			throw new InvalidUserException("none","none");
		}
		

	}
	@GetMapping("user/ProductHtoL")
	public List<Product> ProductLtoH(HttpServletRequest req) throws InvalidUserException{
		HttpSession session = req.getSession(false);
		if(session!=null) {
		String role = (String)session.getAttribute("role");
		if(role.equalsIgnoreCase("User")) {
		List<Product> list2 = productService.filterByCostHtoL();
		return list2;
		}
		else
		{
			String username = (String)session.getAttribute("username");
			String password = (String)session.getAttribute("password");
			throw new InvalidUserException(username,password);
		}
		}
		else {
			throw new InvalidUserException("none","none");
		}
		
	}
	@GetMapping("/user/viewCoupons")
	public List<Discounts> getAllCoupons(HttpServletRequest req)throws InvalidUserException{
		HttpSession session = req.getSession(false);
		if(session!=null) {
		String role = (String)session.getAttribute("role");
		if(role.equalsIgnoreCase("User")) { 
			List<Discounts> discounts = productService.getDiscountCoupons();
			return discounts;
		}
		else {
		
		String username = (String)session.getAttribute("username");
		String password = (String)session.getAttribute("password");
		throw new InvalidUserException(username,password);
		}
		}
		else
		{
			throw new InvalidUserException("none","none");
		}
	
		
		
	}
	@PostMapping("/product") 
	public String saveProductFromWeb(@RequestBody Product t)
	{
		boolean status = productService.insertProduct(t);
		return status == true?"Product Saved ":"Failed to save";
	}
		
	@PutMapping("/product/update")
	public String updated(@RequestParam String name,@RequestParam int cost) {
		String msg = "Test updated";
		boolean result = productService.updateDetails(name, cost);
		return msg;
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productService.getAllProduct();
	}

	
	
	@GetMapping("/product/{pid}")
	public Product getTheProduct(@PathVariable int pid){
			return productService.getProduct(pid);
		
		
	}
	/*@GetMapping("/product/{Name}")
	public int getProductDetails(@PathVariable String Name) {
		// check the pincode in the database
		int result = ProdSer.getAll(Name);
		if(result == 0) {
			return 0;
			
		}
		return result;
	}*/


	
	/*@GetMapping("/product/{id}")
	public List<Product> getTheProduct(@PathVariable int id){
			return ProdSer.getProductById(id);
		
		
	}*/
	
	
}
