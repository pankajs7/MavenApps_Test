import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;


public class SynchronizedMapExample {
public static void main(String[] args) {
	ConcurrentHashMap map=new ConcurrentHashMap();
	map.put(10, "Pankaj");
	map.put(2, "Chandan");
	map.put(5, "Singh");
	map.put(20, "Indra");
	map.put(6, "Kumar");
	Enumeration enumer=map.elements();
	while(enumer.hasMoreElements()){
		System.out.println(enumer.nextElement());
	}
    	
}
}
