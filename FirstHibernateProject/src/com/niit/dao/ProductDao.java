package com.niit.dao;
import java.util.List;
import com.Product;

public interface ProductDao 
{


		public void insertProduct(Product product);
		public void deleteProduct(String productId);
		public void update(Product p);
		
	}



