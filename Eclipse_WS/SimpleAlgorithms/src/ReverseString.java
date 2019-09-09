
public class ReverseString {
public static void main(String[] args) {
	String str="INDIA";
	String s[]=str.split("");
	for(String s1 : s){
		System.out.print(s1);
	}
	System.out.println("\n");
	int length=s.length;
	System.out.println("length "+length);
	for(int count=length-1;count>=0;count--){
		System.out.print(s[count]);
	}
}
}
