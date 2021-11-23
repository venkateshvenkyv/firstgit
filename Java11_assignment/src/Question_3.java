
import java.util.ArrayList;
import java.util.List;

public class Question_3{

	public static void main(String[] args) {
		String a="A quick brown fox jumps over the lazy dog";
		a.lines().forEach(System.out::println);
		ArrayList<String> list=new ArrayList<>();
		list.add("A");
		list.add("quick");
		list.add("brown");
		list.add("fox");
		list.add("jumps");
		list.add("over");
		list.add("the");
		list.add("lazy");
		list.add("dog");
		System.out.println(list);
		String [] s=list.stream().toArray(size ->new String [size]);
		System.out.println(s);

	}

}
 