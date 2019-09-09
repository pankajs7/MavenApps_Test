import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class FilteringUsingStream {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(10, "Pankaj");
	map.put(2, "Indra");
	map.put(4, "Sudha");
	map.put(1, "Gopi");
	map.put(18, "Gopi");
	
	/*for(Map.Entry entry: map.entrySet() ){
		if(entry.getKey()==Integer.valueOf(18))
			System.out.println(entry.getKey()+" "+entry.getValue());
	}*/
	
	/*map.entrySet().stream()
	.filter(e-> e.getValue().equals("Pankaj"))
	.forEach(System.out::println);*/
	/*map.entrySet().stream()
	.filter(e-> e.getValue().equalsIgnoreCase("indra"))
	.forEach(e->System.out.println(e.getKey()+" "+e.getValue()));*/
	
	Map<Integer,String> filter=map.entrySet().stream()
			.filter(e-> e.getValue().equalsIgnoreCase("gopi"))
			.collect(Collectors.toMap(p-> p.getKey(), p-> p.getValue()));
	System.out.println(filter);
	
	
	
	
}
}
