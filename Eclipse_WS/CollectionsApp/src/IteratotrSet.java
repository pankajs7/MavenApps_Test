import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class IteratotrSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list=new ArrayList();
		
		Set set=new HashSet();
		set.add(10);
		set.add(2);
		set.add(1);
		boolean flag=set.add(20);
		System.out.println(flag);
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
