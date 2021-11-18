/*import java.util.HashMap;

public class RandomValues <k,v>{
	public static void main(String[] args) { 
		HashMap<Integer,Double> hm=new HashMap<>();
		hm.put(1, 1.0);
		hm.put(2, 190.0);
		hm.put(3, 154.0);
		hm.put(4, 16.0);
		hm.put(5, 14.0);
		hm.put(6, 14.0);
		hm.put(7, 14.0);
		hm.put(8, 12.0);
		hm.put(9, 13.0);
		hm.put(10, 122.0);
		hm.put(11, 1.20);
		hm.put(12, 10.0);
		System.out.println(hm);
		
	}

}*/
 
import java.util.HashMap;
import java.util.Random;
public class RandomValues {
	    public static void main(String[] args)
	    {
	        HashMap<Integer,Double> store=new HashMap<Integer,Double>();
	        Random r=new Random();
	        int max=45;
	        double range=8.76;
	        double min=7;
	        for (int i = 0; i < 10; i++)
	        {
	            int x=(int)(r.nextInt(max));
	            double y=range+r.nextDouble()-min;
	            store.put(x,y);
	            System.out.println(x+" "+y);
	        }
	        System.out.println(" ");
	        System.out.println(store);
	    }
	
}