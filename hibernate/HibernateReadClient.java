package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateReadClient 
{
	public static void main(String[] args)
	{
		
		Configuration config=new Configuration();
		
		SessionFactory sessionfactory=config.configure().buildSessionFactory();
		
		Session session=sessionfactory.openSession();
		
		BookDTO book=(BookDTO) session.load(BookDTO.class, Integer.valueOf(1));
		//session.load(BookDTO.class, Integer.valueOf(1));
		
		System.out.println(book.toString());
		Comment comment=book.getComment();
		System.out.println(comment.getMessage());
	}

}
