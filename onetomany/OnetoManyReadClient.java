package onetomany;

import org.hibernate.Session;

import utility.HibernateUtility;

public class OnetoManyReadClient 
{
	public static void main(String[] args)
	{
		Session session=HibernateUtility.getSession();
		Employee employee=(Employee)session.get(Employee.class, Integer.valueOf(1));
		
		System.out.println(employee.getName());
		
		HibernateUtility.closeSession(null);
	}

}
