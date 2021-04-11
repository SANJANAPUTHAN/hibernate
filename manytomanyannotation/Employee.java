package manytomanyannotation;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity(name="employee")
@Table(name="employeeannotationtable")
public class Employee 
{
	@Id
	private int eid;
	
	@Column(name="name",nullable=false)
	private String ename;
	
	@Column(name="salary",nullable=false)
	private int salary;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY,mappedBy = "employee")
	public Set<Address> addresses=new HashSet<Address>(0);
	
	@ManyToMany(cascade={CascadeType.ALL},fetch=FetchType.EAGER)
	@JoinTable(name="Employee_has_Training")
	public Set<Training> trainings=new HashSet<Training>(0);
	
	public void setTrainings(Set<Training> trainings) {
		this.trainings = trainings;
	}
	
	public Set<Training> getTrainings()
	{
		return trainings;
	}
	

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}	
}
