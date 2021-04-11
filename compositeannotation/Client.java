package compositeannotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Client 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new AnnotationConfiguration().configure("hibernate.anno.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Compkey compkey=new Compkey();
		compkey.setInv_id(101);
		compkey.setItem_id(1);
		
		Invoice invoice=new Invoice();
		invoice.setCompkey(compkey);
		invoice.setDetails("complan");
		
		session.save(invoice);
		transaction.commit();
		session.close();
		
	}

}
