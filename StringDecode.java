import java.util.Arrays;
import java.util.Scanner;

public class StringDecode {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the String");
		  String str = scan.nextLine();
		  
		    byte[] byteArray;

		    byteArray = str.getBytes();
		    str=Arrays.toString(byteArray);
		    
		    System.out.println("Decoded String value: "+str);
		  }
		}
