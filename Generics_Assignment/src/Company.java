import java.util.HashSet;

public class Company {

	public static void main(String[] args) {
		 HashSet<Employee> h=new HashSet<Employee>();
		 h.add(new Employee ("venkatesh",1234,25000,"Employer"));
		 h.add(new Employee ("Vivek",1254,35000,"Developer"));
		 h.add(new Employee ("Hemanth",162,40000,"Hacker"));
		 Company.printHashSet(h);
	}

	private static void printHashSet(HashSet<Employee> h) {
		 for(Employee temp:h) {
			 System.out.println(temp);
		 }
		
	}

}

 