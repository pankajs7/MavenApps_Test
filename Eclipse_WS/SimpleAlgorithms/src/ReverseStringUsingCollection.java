import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class ReverseStringUsingCollection {
public static void main(String[] args) {
	String originalStr="Geeks for Geeks";
	char[] ch=originalStr.toCharArray();
	List list=new ArrayList();
	for(char c : ch)
	  list.add(c);
	
	System.out.println(list);
	
	Collections.reverse(list);
	System.out.println(list);
	
	ListIterator iterator=list.listIterator();
	while(iterator.hasNext())
		System.out.print(iterator.next());
	
}
}
