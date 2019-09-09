import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CharacterOccurenceCount {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a character : ");

	String stringCharacter=scanner.next();
	System.out.println("Entered character "+stringCharacter);
	char[] charArray=stringCharacter.toCharArray();
	Map<Character, Integer> map=new HashMap();
	for(char c : charArray){
		if(map.containsKey(c)){
			map.put(c, map.get(c)+1);
		}else{
			map.put(c, 1);
		}
	}
	System.out.println(map);
}
}
