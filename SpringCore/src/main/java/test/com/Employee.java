package test.com;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String city;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void disp()
	{
		System.out.println("ID :"+id + "Name : "+name  + "Salary :" +salary+ "City :"+city+ "");
	}

}
