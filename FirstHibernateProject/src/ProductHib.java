
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class ProductHib
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
			
			com.Product product=new com.Product();
			
			product.setProductId("P1001");
			product.setProductName("Honor 9N");
			product.setPrice(10500);
			
			session.save(product);
			
            com.Product p1=new com.Product();
			
			p1.setProductId("P1002");
			p1.setProductName("samsung");
			p1.setPrice(12500);
			
			session.save(p1);
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