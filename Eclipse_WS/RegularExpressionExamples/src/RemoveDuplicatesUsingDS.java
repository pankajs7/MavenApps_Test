import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class RemoveDuplicatesUsingDS {
public static void main(String[] args) {
	/*String string="Hare Ram Hare Ram Ram Hare";
	String[] strArr=string.split(" ");
	int length=strArr.length;
	for(int count=0;count<length;count++){
		
	}*/
	
	Map map=new HashMap();
	map.put(10, "Pankaj");
	map.put(2, "Kumar");
	map.put(5, "Singh");
	Set set=map.entrySet();
	Iterator iterator=set.iterator();
	while(iterator.hasNext()){
		Map.Entry mapSet=(Entry) iterator.next();
		System.out.println(mapSet.getKey() +" "+mapSet.getValue());
	
	}
}
}
