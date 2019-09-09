import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicateString {
public static void main(String[] args) {
	String string="Hare Ram Hare ram Ram ram";
	String[] strArr=string.split(" ");
	Set set=new HashSet();
	for(String st: strArr){
		set.add(st);
	}
	System.out.println("set : "+set);
}
}
