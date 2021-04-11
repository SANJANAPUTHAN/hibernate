package annotation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeTable")
public class Employee
{
	@Id
	private int id;
	
	@Column(name="name",nullable=false)
	private String name;
	
	@Column(name="joiningdate",nullable=false)
	private LocalDate joiningdate;
	
	@Column(name="joiningtime",nullable=false)
	private LocalTime joiningtime;
	
	@Column(name="joiningdatetime",nullable=false)
	private LocalDateTime joiningdatetime;
	
	@Column(name="salary",nullable=false)
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(LocalDate joiningdate) {
		this.joiningdate = joiningdate;
	}

	public LocalTime getJoiningtime() {
		return joiningtime;
	}

	public void setJoiningtime(LocalTime joiningtime) {
		this.joiningtime = joiningtime;
	}

	public LocalDateTime getJoiningdatetime() {
		return joiningdatetime;
	}

	public void setJoiningdatetime(LocalDateTime joiningdatetime) {
		this.joiningdatetime = joiningdatetime;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((joiningdate == null) ? 0 : joiningdate.hashCode());
		result = prime * result + ((joiningdatetime == null) ? 0 : joiningdatetime.hashCode());
		result = prime * result + ((joiningtime == null) ? 0 : joiningtime.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (joiningdate == null) {
			if (other.joiningdate != null)
				return false;
		} else if (!joiningdate.equals(other.joiningdate))
			return false;
		if (joiningdatetime == null) {
			if (other.joiningdatetime != null)
				return false;
		} else if (!joiningdatetime.equals(other.joiningdatetime))
			return false;
		if (joiningtime == null) {
			if (other.joiningtime != null)
				return false;
		} else if (!joiningtime.equals(other.joiningtime))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", joiningdate=" + joiningdate + ", joiningtime=" + joiningtime
				+ ", joiningdatetime=" + joiningdatetime + ", salary=" + salary + "]";
	}
	
	
	
	
}
