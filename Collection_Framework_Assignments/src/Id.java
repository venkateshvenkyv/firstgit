import java.util.Comparator;

class Id implements Comparator<Employee> {
	
	public int compare(Employee E1, Employee E2) {
		if(E1.getId()>E2.getId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class Name implements Comparator<Employee>{
	@Override
	public int compare(Employee E3, Employee E4) {
		
		return E3.getName().compareTo(E4.getName());
	}
}
class Dept implements Comparator<Employee>{
	@Override
	public int compare(Employee E1, Employee E2) {
		return E1.getDepartment().compareTo(E2.getDepartment());
	}
}
class Sal implements Comparator<Employee>{
	@Override
	public int compare(Employee E1, Employee E2) {
		if(E1.getSalary()>E2.getSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
 