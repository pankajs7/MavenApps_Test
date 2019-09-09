import java.io.*;
public class DecimalToRomanMethhod1
{
  public static void main(String args[]) throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int num;
    String str="";
    System.out.print("Enter a Number : ");
    num=Integer.parseInt(br.readLine()); //accepting decimal number
 
    /*Arrays storing the unique symbols of Roman Number System
       and also the corresponding decimal equivalents in the second array*/
    String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int decimal[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
 
        if(num>0 && num<4000) //checking whether the number entered is within the range &#91;1-3999&#93;
        {
            for (int i=0; i<13; i++) // i<13 because the total unique numbers stored in the above array=13
            {
                /*The while loop is for printing repeated digits like XXX for 30 etc
                   and is also calculating the equivalent Roman number by adding the corresponding
                   Roman Digits from the Array to the String str*/
            while (num >= decimal[i])
                {
                num = num-decimal[i];
                str = str+roman[i];
                }
            }
         System.out.println("Roman Equivalent = "+str); //Printing the Roman equivalent
        }
 
        /*Displaying an error message if the number entered is out of range*/
        else
        System.out.println("nYou entered a number out of Range.nPlease enter a number in the range [1-3999]");
}
}