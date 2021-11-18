import java.util.HashSet;

public class Question2{

	public static void main(String[] args)
	{
		product p1=new product("Balloon");
		product p2=new product("Laptop");
		product p3=new product("Connector");
		product p4=new product("hello");
		product p5=new product("shops");
		product p6=new product("Restaurants");
		product p7=new product("haii");
		product p8=new product("Stump");
		
		HashSet<product> h= new HashSet<product>();
		h.add(p1);
		h.add(p2);
		h.add(p3);
		h.add(p4);
		h.add(p5);
		h.add(p6);
		h.add(p7);
		h.add(p8);
		h.add(p4);
		
		System.out.println(h);
		
	}

}


 
