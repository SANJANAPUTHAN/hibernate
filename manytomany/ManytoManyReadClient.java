package manytomany;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import utility.HibernateUtility;

public class ManytoManyReadClient 
{
	public static void main(String[] args) 
	{
		Session session=HibernateUtility.getSession();
//		query1(session);
//		query2(session);
//		query3(session);
//		query4(session);
//		query5(session);
//		query6(session);
//		query7(session);
//		query8(session);
		query9(session);
		HibernateUtility.closeSession(null);
	}
	
	public static void query9(Session session) {
		//Query query=session.createQuery("");
		Query query=session.getNamedQuery("myquery");
		List<Employee> list=query.list();
		Iterator<Employee> iter=list.iterator();
		while(iter.hasNext()) 
		{
			Employee employee=iter.next();
			System.out.println(employee.getName());
			Set<Trainings> tset=employee.getTraining();
			for(Trainings t:tset)
			{
				System.out.println(t.getTname());
			}
		}
		
	}
	private static void query8(Session session)
	{
		Query q=session.createQuery("insert into BackupEmployee (eid,ename,emarks) select e.id,e.name,e.marks from Employee e");
		int createobjects=q.executeUpdate();
		System.out.println(createobjects);
		
	}

	private static void query7(Session session) 
	{
		Query query=session.createQuery("update Employee e set e.marks=e.marks+10");
		int number=query.executeUpdate();
		System.out.println("records updated : "+number);
	}

	private static void query6(Session session) 
	{
		Query query=session.createQuery("select e.name,t.tname from Employee e left join e.training t with t.tname=:c");
		query.setParameter("c", "web");
		List<Object[]> list=query.list();
		Iterator<Object[]> iter=list.iterator();
		while(iter.hasNext())
		{
			Object obj[]=iter.next();
			System.out.println(obj[0]+" "+obj[1]);
		}
	}

	private static void query5(Session session)
	{
		Query query5=session.createQuery("select e.name,t.tname from Employee e join e.training t with t.tname=:c");
		query5.setParameter("c", "web");
		List<Object[]> list=query5.list();
		Iterator<Object[]> iter=list.iterator();
		while(iter.hasNext())
		{
			Object obj[]=iter.next();
			System.out.println(obj[0]+" "+obj[1]);
		}
	}

	private static void query4(Session session) 
	{
		
		Query query4=session.createQuery("select e.name,t.tname from Employee e,Trainings t where t.tname=:c");
		query4.setParameter("c", "web");
		List<Object[]> list=query4.list();
		Iterator<Object[]> iter=list.iterator();
		while(iter.hasNext())
		{
			Object obj[]=iter.next();
			System.out.println(obj[0]+" "+obj[1]);
		}
		
		
	}
	public static void query1(Session session)
	{
		Query query=session.createQuery("from Employee");
		List<Employee> list=query.list();
		Iterator<Employee> iter=list.iterator();
		while(iter.hasNext()) 
		{
			Employee employee=iter.next();
			System.out.println(employee.getName());
			Set<Trainings> tset=employee.getTraining();
			for(Trainings t:tset)
			{
				System.out.println(t.getTname());
			}
		}
	}
	
	public static void query2(Session session)
	{
		Query query2=session.createQuery("select e.name from Employee e");
		List<String> list2=query2.list();
		Iterator<String> iter2=list2.iterator();
		while(iter2.hasNext())
		{
			System.out.println(iter2.next());
		}		
	}
	
	public static void query3(Session session)
	{
		Query query3=session.createQuery("select e.name,e.marks from Employee e");
		List<Object[]> list3=query3.list();
		Iterator<Object[]> iter3=list3.iterator();
		while(iter3.hasNext())
		{
			Object o[]=iter3.next();
			for(Object obj:o)
			{
				System.out.println(obj.toString());
			}
		}		
	}

}
