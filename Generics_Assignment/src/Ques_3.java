
public class Ques_3 {

	public static void main(String[] args) {
		Integer[] arr = {50,38,83,05};
		int p=2;
		int q=3;
		
		Exchange1<Integer> x = new Exchange1<>(arr);
		Integer[] arr2 = x.getArr();
		System.out.println("Swapping at index "+p+ " and "+q);
		System.out.println("--------------before swap-----------");
		x.printElements(arr);
		x.swap(arr,p,q);
		System.out.println("--------------after swap-----------");
		x.printElements(arr);
		

		
	}
}

 