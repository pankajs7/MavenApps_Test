import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class SortingUsingStream {
public static void main(String[] args) {
		List<Integer> list=new ArrayList();
		list.add(10);
		list.add(2);
		list.add(20);
		list.add(7);
		list.add(3);
		list=list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List : "+list);
	}
}
