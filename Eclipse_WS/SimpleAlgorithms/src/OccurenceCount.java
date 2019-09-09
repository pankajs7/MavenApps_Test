import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OccurenceCount {
public static void main(String[] args) {
	List<String> list=new ArrayList();
	list.add("Ram");
	list.add("Sita");
	list.add("Sita");
	list.add("Pankaj");
	list.add("Singh");
	list.add("Singh");
	list.add("singh");
	list.add("Singh");
	list.add("Ram");
	list.add("Ram");
	
	Map<String, Integer> map=new HashMap<String,Integer>();
	for(String str : list){
		if(map.containsKey(str)){
			map.put(str, map.get(str)+1);
		}else{
			map.put(str, 1);
		}
	}
	System.out.println(map);
}
}
