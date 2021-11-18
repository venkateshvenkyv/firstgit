import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		Long l1=Long.valueOf(763452716);
		Long l2=Long.valueOf(859567352);
		Long l3=Long.valueOf(986272535);
		
		contact c1= new contact(l1,"venkatesh","name",Gender.Male);
		contact c2= new contact(l2,"shruthi","name",Gender.Female);
		contact c3= new contact(l3,"chava","name",Gender.Male);
		
		TreeMap<Long,contact> Tm=new TreeMap<Long,contact>();
		Tm.put(l1, c1);
		Tm.put(l2, c2);
		Tm.put(l3, c3);
		
		System.out.println("Keys:");
		for(Map.Entry<Long, contact>entry:Tm.entrySet()) {
			System.out.println(entry.getKey());
		}
		
		System.out.println("==================================");
		
		
		System.out.println("Values:");
		for(Map.Entry<Long, contact>entry:Tm.entrySet()) {
			System.out.println(entry.getValue());
		}
		
		System.out.println("==================================");
		
		System.out.println("Keys:Value");
		for(Map.Entry<Long, contact>entry:Tm.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		

	}

}
 