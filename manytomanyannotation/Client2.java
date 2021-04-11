package manytomanyannotation;


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Client2 {
	public static void main(String[] args)throws Exception {
		
		SessionFactory factory = new AnnotationConfiguration().	configure("hibernate.anno.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee emp=new Employee();
		emp.setEid(210);
		emp.setEname("sanjana");
		emp.setSalary(30000);		


		
		Set<Employee> set=new HashSet();
		set.add(emp);
		
		Training t1=new Training();
		t1.setTid(1001);
		t1.setTname("java");
		//t1.setEmployee(set);
		
		Training t2=new Training();
		t2.setTid(1002);
		t2.setTname("web");
		//t2.setEmployee(set);
		
		Set<Training> set1=new HashSet();
		set1.add(t1);
		set1.add(t2);		
		emp.setTrainings(set1);
		
		session.saveOrUpdate(emp);
		session.save(t1);
		session.save(t2);
		
		tx.commit();
		
		 //emp=(Employee)session.get(Employee.class,new Integer(100));
	
	}
}
