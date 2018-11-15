package com.niit.impl.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Product;
import com.niit.dao.ProductDao;

public class ProductImplDao implements ProductDao 
{
	
		SessionFactory sessionfactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
	
		public void insertProduct(Product product)
		{
			Session session=sessionfactory.openSession();
			session.beginTransaction();
			session.save(product);
			session.getTransaction().commit();
			session.close();
			
			
		}


		public void deleteProduct(String productId)
		{
			Session session=sessionfactory.openSession();
			session.beginTransaction();
			Product product=(Product)session.get(Product.class,productId);
			session.delete(product);
			session.getTransaction().commit();
			session.close();
		}


		public void update(Product p)
		{
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();
		session.close();
			
		}


	}