/*
@FunctionalInterface
 
 interface ArithmeticOperation{
	 int operations(int a,int b);
 }
 public class Question_1 {
 public static void main(String[] args) {
	 ArithmeticOperation addition = new  ArithmeticOperation() {

		@Override
		public int operations(int a, int b) {
			 
			return (a+b);
		}
		 
			 };
			 System.out.println("addition" +addition.operations  (38, 50));
}
}
 */

 
 
 
 
  interface Arithmetic{
		int operations(int a,int b);
	}
	public class Question_1 {
		public static void main(String[] args) {
			//addition operation
			Arithmetic addition = (a,b)->(a+b);
			System.out.println("Addition = "+addition.operations(10, 20));
			
			//subtraction operation
			Arithmetic subtraction = (a , b)->(a - b);
			System.out.println("Subtraction = "+subtraction.operations(30, 20));
			
			//multiplication operation
			Arithmetic multiplication = ( a, b)->(a * b);
			System.out.println("multiplication = "+multiplication.operations(10, 20));
			
			//division operation
			Arithmetic division = (a,  b)-> (a / b);
			System.out.println("division = "+division.operations(10, 2));
			}
	}
 
 