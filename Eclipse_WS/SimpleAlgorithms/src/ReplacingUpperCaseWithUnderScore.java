import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReplacingUpperCaseWithUnderScore {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter String ");
	StringBuffer inputStr=new StringBuffer(scanner.next());
	int strLength=inputStr.length();
	for(int i=0;i<strLength;i++){
		Character c=inputStr.charAt(i);
		if(Character.isUpperCase(c)){
			inputStr.replace(i, i+1, "_"+Character.toLowerCase(c));
		}
	}
	System.out.println(inputStr);
}
}
