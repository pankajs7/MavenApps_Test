import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidateEmailId {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter Email Id ");
	String emailId=scanner.next();
	Pattern pattern=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@gmail[.]com");
	Matcher matcher=pattern.matcher(emailId);
	//System.out.println(""+matcher.find());
	if(matcher.find() && matcher.group().equals(emailId)){
		System.out.println("Valid");
	}else{
		System.out.println("Invlalid");
	}	
}
}
