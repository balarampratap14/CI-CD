import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) 
{
		java.util.Scanner s = new Scanner(System.in);
		char i ='y';
		while (i == 'y') {
			int c;
			System.out.print(" CALCULATOR ");
			System.out.println( "MENU ");
			System.out.println( " 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division" );
			System.out.println("Enter your choice :");
			c = s.nextInt();
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			switch(c) {
			case 1:
				System.out.println("The Sum is " +(a+b)+ "." );
				break;
			case 2:
				System.out.println("The Substraction result is " +(a-b)+ "." );
				break;
			case 3:
				System.out.println("The product is " +(a*b)+ "." );
				break;
			case 4:
				if (b >0) {
					System.out.println("The division result is " +(a/b)+ "." );
				break;
				}
			default:
				System.out.print("Invalid CHOICE");
		}
		
			System.out.println("Do u want to continue (y/n) :" );
			i = s.next().charAt(0);
			
		}	
}
}