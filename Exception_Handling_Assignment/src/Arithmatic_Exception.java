import java.util.Scanner;

public class Arithmatic_Exception {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  Number 1");
		int num = scanner.nextInt();
		System.out.println("Enter Number 2");
		int den = scanner.nextInt();
		try {
			int c=num/den;
			System.out.println("The output of divison is "+c);
		}
		catch(ArithmeticException e){
			System.out.println("We can't divide value with zero");
			
		}

	}

}

 
