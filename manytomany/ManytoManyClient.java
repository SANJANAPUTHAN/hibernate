package manytomany;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import utility.HibernateUtility;

public class ManytoManyClient
{
	public static void main(String[] args)
	{
		Trainings training=new Trainings();
		training.setTname("java");
		training.setTdate(LocalDate.now().plusDays(10));
		
		Trainings training2=new Trainings();
		training2.setTname("web");
		training2.setTdate(LocalDate.now().plusDays(5));
		
		Set<Trainings> set=new HashSet<Trainings>();
		//Set<Employee> set1=new HashSet<Employee>();
		
		set.add(training);
		set.add(training2);
		
		Employee employee=new Employee();
		employee.setName("sanjana");
		employee.setTraining(set);
		
		Employee employee2=new Employee();
		employee2.setName("sanja");
		employee2.setMarks(90);

		//set1.add(employee2);
		Session session=HibernateUtility.getSession();
		
		session.save(employee);
		session.save(employee2);
		session.save(training);
		session.save(training2);
		
		HibernateUtility.closeSession(null);
		
		
	}

}
