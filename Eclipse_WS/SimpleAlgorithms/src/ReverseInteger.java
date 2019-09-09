
public class ReverseInteger {

	
	public static void main(String[] args) {
	   
		int a=123456;
		int reverse=0;
		while(a!=0){
			int rem=a%10;
			a=a/10;
			reverse=reverse*10+rem;
		}
		System.out.println("Reversed :"+reverse);
	}
}
