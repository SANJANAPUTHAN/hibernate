package manytomanyannotation;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import net.sf.ehcache.config.Configuration;

public class Client
{
	public static void main(String[] args)
	{
		SessionFactory factory=new AnnotationConfiguration().configure("hibernate.anno.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee emp=new Employee();
		emp.setEid(1001);
		emp.setEname("sanjana");
		emp.setSalary(40000);
		
		Address add1=new Address();
		add1.setAid(2100);
		add1.setStreet("kuniyamuthur");
		add1.setEmployee(emp);
		
		Address add2=new Address();
		add2.setAid(220);
		add2.setStreet("kovaipudur");
		add2.setEmployee(emp);
		
		Set set=new HashSet();
		set.add(add1);
		set.add(add2);
		
		emp.setAddresses(set);
		
		session.save(add1);
		session.save(add2);
		session.save(emp);
		
		tx.commit();
		
		
		
		
		
	
		
	}

}
