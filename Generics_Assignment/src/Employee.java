
public class Employee { 
	String name;
	int id;
	double sal;
	String department;
	public Employee(String name, int id, double sal, String department) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + ", department=" + department + "]";
	}

}
