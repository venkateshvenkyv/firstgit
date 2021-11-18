
public class Ques_4_Logic {
	public static void main(String[] args) {
		Pair<String,String> p=new Pair<>("Venkatesh","1231");
		System.out.println(p.toString());
		p.setKey("Hello");
		p.setValue("1243");
		System.out.println(p.toString());
		
		/*Pair<String ,java.util.Date> p1 = new Pair<>("Today is",(new java.util.Date())));
		System.out.println(p1.toString());*/
}
}

/*
import java.util.*;
public class Ques_4_Logic{
      public static void main(String[] args) {
		
    	  
    	  pair<String, String> myobj=new pair<String, String>("1","Hello");
          System.out.println(" { "+myobj.getKey()+" = "+myobj.getValue()+" } ");
          
          Date objc=new Date();
          pair<String, java.util.Date> object=new pair<String,java.util.Date> ("1",objc);
          System.out.println(" { "+object.getKey()+" = "+object.getValue()+" } ");
	}
}


class pair<K,V>
{
	private K key;
	private V value;
	public pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}*/
