
			

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class CustomerHib
{
	public static void main(String arg[])
	{
		try
		{
			Configuration config=new Configuration();
			
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			com.Customer customer=new com.Customer();
			
			customer.setUserId("DTEJA001");
			customer.setPassword("dteja");
			customer.setUserName("Aakriti");
			customer.setUserAddr("Jp Nagar");
			
			session.save(customer);
			
            
			transaction.commit();
			
			session.close();
			
			
			
			System.out.println("Object is Saved");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured:"+e);
		}
		
	}
}
			
			
			
		