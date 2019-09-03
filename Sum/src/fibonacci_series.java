import java.util.Scanner;
public class fibonacci_series {

	public static void main(String[] args) {
		Sum a = new Sum();
		java.util.Scanner s = new Scanner(System.in);
		int first=0,second=1,next,c;
		System.out.print("Enter the number of terms : ");
		int n = s.nextInt();
		System.out.println("First " +n+ " terms of fibonacci series are : ");
		for ( c=0; c<n ; c++) {
			if ( c<=1)
			{
				next=c;
			}
			else 
			{
				next=first+second;
				first=second;
				second=next;
			}
			System.out.print(next);
		}
	}
}
