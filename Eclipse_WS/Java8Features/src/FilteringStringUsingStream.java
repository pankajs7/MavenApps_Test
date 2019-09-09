import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FilteringStringUsingStream {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Pankaj");
	list.add("Singh");
	list.add("Kumar");
	list.add("Pankaj");
	List<String> updatedList=(List<String>) list.stream().filter(name->name.equals("Pankaj"))
			                 .collect(Collectors.toList());
	System.out.println(updatedList);
}
}
