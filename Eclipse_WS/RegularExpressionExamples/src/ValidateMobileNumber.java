import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidateMobileNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter Mobile No. ");
	String mobileNo=scanner.next();
	Pattern pattern=Pattern.compile("[0][6-9][0-9]{9}");
	Matcher matcher=pattern.matcher(mobileNo);
	//System.out.println(""+matcher.find());
	if(matcher.find() && matcher.group().equals(mobileNo)){
		System.out.println("Valid");
	}else{
		System.out.println("Invlalid");
	}
}
}
