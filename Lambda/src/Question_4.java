import java.util.ArrayList;

public class Question_4 {

	public static void main(String[] args) {
		 ArrayList<String> a=new ArrayList<>();
		 a.add("Venkatesh");
		 a.add("Naresh");
		 a.add(" hello");
		 a.add("Hemanth");
		 a.add("Guldu");
		 a.add("Dinga");
		 a.add("vivek");
		 a.add("game");
		 System.out.println("Before Removing:"+a);
		 a.removeIf(name->(name.length()%2==0));
		 System.out.println("after removing:"+a);

	}

}
