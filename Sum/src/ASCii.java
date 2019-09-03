import java.util.Scanner;

public class ASCii {

	    public static void main(String[] args) {
	    	java.util.Scanner s = new Scanner(System.in);
	    	System.out.print(" Enter a Character : - " );
			char ch = s.next().charAt(0); 
	        int asciiCode = ch;
	        int asciiValue = (int)ch;

	        System.out.println("ASCII value of "+ch+" is: " + asciiCode);
	        System.out.println("ASCII value of "+ch+" using Type_Casting is: " + asciiValue);
	    }
}
