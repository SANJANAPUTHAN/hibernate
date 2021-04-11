package manytomany;

import java.time.LocalDate;
import java.util.Set;

public class Trainings 
{
	public Trainings() {
		// TODO Auto-generated constructor stub
	}
	
	private int tid;
	private String tname;
	private LocalDate tdate;
	private Set<Employee> employee;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public LocalDate getTdate() {
		return tdate;
	}
	public void setTdate(LocalDate tdate) {
		this.tdate = tdate;
	}
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	public Trainings(int tid, String tname, LocalDate tdate, Set<Employee> employee) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tdate = tdate;
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Trainings [tid=" + tid + ", tname=" + tname + ", tdate=" + tdate + ", employee=" + employee + "]";
	}
	
	
	
	

}
