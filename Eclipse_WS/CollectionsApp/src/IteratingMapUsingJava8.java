import java.util.HashMap;


public class IteratingMapUsingJava8 {
public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(10, "Pankaj");
	map.put(2, "Indra");
	map.put(4, "Sudha");
	map.put(1, "Gopi");
	map.put(18, "Gopi");
	
	map.entrySet().stream().forEach(e->
	System.out.println(e.getKey()+" "+e.getValue()));
}
}
