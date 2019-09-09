import java.util.Scanner;


public class NumberSummation {
public static void main(String[] args) {
	//int num=367896457;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Number :");
	int num=scanner.nextInt();
	int iterateResult=0;
	int result=sum(num);
	int oldResult=result;
	while(result/10>0){
		result=sum(result);
	}
	int totalSum=oldResult+result;
	System.out.println(totalSum);
	
}

public static int sum(int number){
	int remainder=0,sum=0,divide=0;
	while(number/10>0){
		remainder=number%10;
		sum=sum+remainder;
		divide=number/10;
		number=divide;
	}
	sum=sum+divide;
	return sum;
}
}
