package manytomany;

import java.util.Set;

public class Employee 
{
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	private int id;
	private String name;
	private int marks;
	private Set<Trainings> training;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Set<Trainings> getTraining() {
		return training;
	}
	public void setTraining(Set<Trainings> training) {
		this.training = training;
	}
	public Employee(int id, String name, int marks, Set<Trainings> training) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.training = training;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", marks=" + marks + ", training=" + training + "]";
	}
	
	

}
