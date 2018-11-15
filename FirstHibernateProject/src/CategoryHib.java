
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class CategoryHib
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
			
			com.Category category=new com.Category();
			
			category.setCategoryId(001);
			category.setCategoryName("Mobiles");
			category.setCategoryDesc("Mobiles are good");
			
			session.save(category);
			
            
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