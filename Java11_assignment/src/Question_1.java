public class Question_1 {
@FunctionalInterface
interface simpleinterest
{
	int operations(int p,int t,int r);
}
	public static void main(String[] args) {
		var p=20097;
		var t=2.8;
		var r=5;
		System.out.println("The simple interest is:"+(p*t*r)/100);

	}

}
 