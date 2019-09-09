import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class IteratingHashtable {
public static void main(String[] args) {
	Hashtable<Integer,String> map=new Hashtable<Integer,String>();
	map.put(10, "Pankaj");
	map.put(2, "Indra");
	map.put(4, "Sudha");
	map.put(1, "Gopi");
	map.put(18, "Gopi");
	
	map.entrySet().stream().forEach(e->
	System.out.println(e.getKey()+""+e.getValue())
			);
	 /*for(Map.Entry entry : map.entrySet()){
		 System.out.println(entry.getKey()+" "+entry.getValue());
	 }*/
		
	
	/*Enumeration enumValue=map.elements();
	Enumeration enumKeys=map.keys();
	while(enumValue.hasMoreElements()){
		System.out.println(enumValue.nextElement());
	}
	while(enumKeys.hasMoreElements()){
		System.out.println(enumKeys.nextElement());
	}*/
	/*Set<Integer> set=map.keySet();
	for(Integer string: set){
		System.out.println(string+" "+map.get(string));
	}*/
	
	/*Enumeration enumeration=map.elements();
	while(enumeration.hasMoreElements()){
		System.out.println(enumeration.nextElement());
	}*/
	/*map.entrySet().stream().forEach(e-> 
	System.out.println(e.getKey()+" "+e.getValue())
			);*/
	/*for(Map.Entry entry : map.entrySet()){
		System.out.println("Key :"+entry.getKey()+" Value : "+entry.getValue());
	}*/
}
}
