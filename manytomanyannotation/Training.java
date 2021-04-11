package manytomanyannotation;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="trainings")
public class Training
{
	@Id
	private int tid;
	
	@Column(name="tname",nullable=false)
	public String tname;
	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public void setEmployee(Collection<Employee> employee) {
		this.employee = employee;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	
	@ManyToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
	@JoinTable(name="Employee_has_Training")
	public Collection<Employee> employee;
	
	
	public void getEmployee()
	{
		
	}

}
