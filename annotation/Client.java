package annotation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Client
{
	public static void main(String[] args)
	{
		SessionFactory factory = new AnnotationConfiguration().configure("hibernate.anno.cfg.xml").buildSessionFactory();
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			Employee employee1 = new Employee();
			employee1.setId(200);
			employee1.setName("sanjana");
			
			employee1.setJoiningdate(LocalDate.now());
			employee1.setJoiningtime(LocalTime.now());
			employee1.setJoiningdatetime(LocalDateTime.now());
			employee1.setSalary(100000);
			
			session.save(employee1);	
			
			
			tx.commit();
		//	
			session.close();
		
	}

}
