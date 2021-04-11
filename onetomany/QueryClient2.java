package onetomany;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import utility.HibernateUtility;

public class QueryClient2
{
	public static void main(String[] args)
	{
		Session session=HibernateUtility.getSession();
		//query1(session);
		//query2(session);
		//query3(session);
		query4(session);
		HibernateUtility.closeSession(null);
		
	}
	private static void query2(Session session) 
	{
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.addOrder(Order.asc("name"));
		List<Employee> list=criteria.list();
		for(Employee employee:list)
		{
			System.out.println(employee.getName());
		}
	}
	public static void query1(Session session)
	{
		Criteria criteria=session.createCriteria(Employee.class);
		List<Employee> list=criteria.list();
		for(Employee employee:list)
		{
			System.out.println(employee.getName());
		}
	}
	private static void query3(Session session) 
	{
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Property.forName("name").eq("sanjana"));
		Employee employee=(Employee)criteria.uniqueResult();
		System.out.println(employee.getName());
	}
	private static void query4(Session session) 
	{
		Criteria criteria=session.createCriteria(Address.class);
		criteria.add(Restrictions.eq("Employee.name","sanjana"));
		List<Address> list=criteria.list();
		for(Address t:list)
		{
			System.out.println(t.getCity());
		}
	}
}
