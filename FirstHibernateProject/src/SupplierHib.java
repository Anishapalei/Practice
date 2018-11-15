
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class SupplierHib
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
			
			com.Supplier supplier=new com.Supplier();
			
			supplier.setSupplierId("S1001");
			supplier.setSupplierName("Anisha");
			supplier.setSupplierAddr("Jayanagar");
			
			session.save(supplier);
			
          
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
