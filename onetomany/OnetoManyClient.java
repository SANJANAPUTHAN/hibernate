package onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import utility.HibernateUtility;

public class OnetoManyClient 
{
	public static void main(String[] args)
	{
		Session session=HibernateUtility.getSession();
		
		Employee employee=new Employee();
		employee.setName("sanjana");
		employee.setSalary(30000);
		
		Address address=new Address();
		address.setAid(21);
		address.setCity("coimbatore");
		address.setStreet("kuniyamuthur");
		address.setEmployee(employee);
		
		Address address2=new Address();
		address2.setAid(31);
		address2.setCity("coimbatore");
		address2.setStreet("kovaipudur");
		address2.setEmployee(employee);
		
		Set<Address> set=new HashSet();
		
		set.add(address);
		set.add(address2);
		
		employee.setAddress(set);
		
		session.save(employee);
		session.save(address);
		session.save(address2);
		
		HibernateUtility.closeSession(null);
		
		
	}

}
