import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		java.util.Scanner s = new Scanner(System.in);
		System.out.println("Enter first operand :");
		int a = Integer.parseInt(args[0]);
		System.out.println("Enter second operand");
		int b = Integer.parseInt(args[1]);
		int c = a+b;
		System.out.print("The sum is : " +c);
	}
}
