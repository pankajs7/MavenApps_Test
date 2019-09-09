import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MatchingStringApp {
public static void main(String[] args) {
	Pattern pattern=Pattern.compile("Ram");
	Matcher matcher=pattern.matcher("Hare Ram Hare ram,Sita Ram Ram Hare Hare Ram Ram ");
	int count=0;
	while(matcher.find()){
		System.out.println(matcher.group());
		count+=1;
	}
	System.out.println(count);
}
}
