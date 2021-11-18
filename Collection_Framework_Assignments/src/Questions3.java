import java.util.Scanner;
import java.util.TreeSet;
 

public class Questions3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for ID:");
		System.out.println("Enter 2 for Name:");
		System.out.println("Enter 3 for Department:");
		System.out.println("Enter 4 for Salary:");
		int input=sc.nextInt();
		TreeSet<Employee> emp=null;
		switch(input)
		{
			case 1: emp=new TreeSet<>(new Id());
					break;
			case 2: emp=new TreeSet<>(new Name());
					break;
			case 3:	emp=new TreeSet<>(new Dept());
					break;
			case 4: emp=new TreeSet<>(new Sal());
					break;
			default:System.out.println("Invalid Option");
		}
		emp.add(new Employee(10,"MK","IT",5220));
		emp.add(new Employee(11,"HK","CS",3565));
		emp.add(new Employee(12,"Dk","EE",6582));
		emp.add(new Employee(13,"BK","ME",4896));
		emp.add(new Employee(14,"CK","CE",2568));
		emp.add(new Employee(16,"Dk","TE",8692));
		emp.add(new Employee(15,"KK","CS",7826));
		emp.add(new Employee(19,"Lk","IT",2698));
		emp.add(new Employee(17,"MK","IT",2576));
		emp.add(new Employee(18,"GK","IT",5000));
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}
	}

}
 
