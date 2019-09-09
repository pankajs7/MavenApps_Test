interface Interf{
	public String add(int a, int b);
}
class Summation{
	public static String  sum(int x, int y){
		int sum=x+y;
        return Integer.valueOf(sum).toString();
	}
}
public class MethodReferenceEx {
public static void main(String[] args) {
	//Summation s1=new Summation();
	Interf i=Summation::sum;
	String addition=i.add(1000, 234);
	System.out.println(addition);
}
}
