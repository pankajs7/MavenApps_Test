import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class IteratingHashMap {
public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(10, "Pankaj");
	map.put(2, "Indra");
	map.put(4, "Sudha");
	map.put(1, "Gopi");
	map.put(18, "Gopi");
	
	for(Map.Entry entry : map.entrySet()  )
	{
		System.out.println("Key : "+entry.getKey() +" Value : "+entry.getValue());
	}
	/*Set set=map.keySet();
	Iterator itr=set.iterator();
	while(itr.hasNext()){
		Integer integer=(Integer)itr.next();
		System.out.print("Key:Value "+integer);
		System.out.println(" "+map.get(integer));
		
	}*/
}
}
