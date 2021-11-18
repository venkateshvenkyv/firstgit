
/*
import java.util.ArrayList;

public class  Question_6 {

	public static void main(String[] args) {
		 
		ArrayList<String> uppercase=new ArrayList<>();
		uppercase.add("bitcoin");
		uppercase.add("stockmarket");
		uppercase.add("coinmaster");
		uppercase.add("master");
		System.out.println("contents of the list: "+uppercase);
		uppercase.replaceAll(new Lambda6());
		System.out.println("contents of the list after replace : "+uppercase);
	}

}
*/

import java.util.Arrays;
import java.util.List;
public class  Question_6 {

	public static void main(String[] args) {
		 
		String arr[]= {"bit coin","stock market","coin master","master"};
		List<String> arrayList=Arrays.asList(arr);
		arrayList.replaceAll(e->e.toUpperCase());
		System.out.println(arrayList);
		
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
/*
class MyOperator implements UnaryOperator<String> {
	@Override
	public String apply(String t) {
		return t.toUpperCase();
	}
}

public class  Question_6 {
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("Pranab");
		li.add("Debasish");
		li.add("Pratik");
		li.add("Rakesh");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Elements in list are:");
		System.out.println(li);
		System.out.println("----------------------------------------------------------------");
		System.out.println(" ");
		li.replaceAll(new MyOperator());
		System.out.println("----------------------------------------------------------------");
		System.out.println("Elements in list after replacing with upper case letters are:");
		System.out.println(li);
		System.out.println("----------------------------------------------------------------");
	}

}
*/