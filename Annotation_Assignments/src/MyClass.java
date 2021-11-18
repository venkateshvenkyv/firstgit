
public class MyClass {
	@Execute(sequence=2)
	public void myMethod1() {
		 System.out.println("From method1");	
	}
	@Execute(sequence=1)
	public void myMethod2() {
		 System.out.println("From method2");	
	}
	@Execute(sequence=3)
	public void myMethod3() {
		 System.out.println("From method3");	
	}
	 
}
