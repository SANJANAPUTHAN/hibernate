package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateClient 
{
	public static void main(String[] args)
	{
		BookDTO bookdto=new BookDTO(1, "java" , "james" , 200);
		
		Comment comment=new Comment();
		comment.setMessage("this is comment...");
		bookdto.setComment(comment);
		
		Configuration config=new Configuration();
		
		SessionFactory sessionfactory=config.configure().buildSessionFactory();
		
		Session session=sessionfactory.openSession();
		
		//session.save(bookdto);
		//session.saveOrUpdate(bookdto);
		session.persist(bookdto);
		session.beginTransaction().commit();
	}
}
