import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MinMaxUsingStream {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(2);
	list.add(20);
	list.add(7);
	list.add(3);
	List defaultSortedList=list.stream().sorted().collect(Collectors.toList());
	List CustomizeSortedList=list.stream().sorted((I1,I2)->I2.compareTo(I1)).collect(Collectors.toList());
	int maxValue=list.stream().max((I1,I2)->I1.compareTo(I2)).get();
	int minValue=list.stream().min((I1,I2)->I1.compareTo(I2)).get();
	
	System.out.println(defaultSortedList);
	System.out.println(CustomizeSortedList);
	System.out.println("MaxValue :"+maxValue);
	System.out.println("MinValue : "+minValue);
}
}
