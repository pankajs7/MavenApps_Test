import java.io.InputStream;
import java.util.Scanner;


public class PrintTriangle {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter No. of Lines : ");
		int lineNo=input.nextInt();
		System.out.println("You Entered : "+lineNo);
		for(int i=0;i<lineNo;i++){
			for(int j=lineNo-i;j>1;j--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
			System.out.print("* ");	
			}
			System.out.println();
		}
	}
}
