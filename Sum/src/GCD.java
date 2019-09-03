import java.util.Scanner;

public class GCD {

	int evaluate_GCD ( int a, int b)
	{
		int gcd = 0; 
		for(int i=1 ; i<= a && i<=b ; ++i )
			{ 
				if(a % i ==0 && b % i ==0)
				{
					
					gcd = i;
			
				}
			}
	return gcd; 
    }

		public static void main(String args[]) 
 	{
		java.util.Scanner s = new Scanner(System.in);
		GCD ob = new GCD();
		System.out.print("Enter first operand :");
		int a = s.nextInt();
		System.out.println("Enter second operand");
		int b = s.nextInt();
		System.out.println("Evaluating GCD Of " +a+ "and " +b+ "........." );
	    int c;
	    c = ob.evaluate_GCD(a,b);
	    System.out.println(" The GCD of "+a+ "and" +b+ "is : " +c );
   }
	


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

