package inheritance;

import org.hibernate.Session;

import utility.HibernateUtility;

public class InheritanceClient
{
	public static void main(String[] args)
	{
		Session session=HibernateUtility.getSession();
		
		ShoeFactory shoefactory=new ShoeFactory();
		shoefactory.setName("parent shoe factory....");
		
		BataShoeFactory bsf=new BataShoeFactory();
		bsf.setName("parent shoe factroy bata");
		bsf.setBataname("bata shoe production");
		
		LakhaniShoeFactory lsf=new LakhaniShoeFactory();
		lsf.setName("parent shoe factory lakhani");
		lsf.setLakhaniname("Lakhani shoe production");
		
		session.save(shoefactory);
		session.save(bsf);
		session.save(lsf);
		
		
		session.beginTransaction().commit();
	}

}
