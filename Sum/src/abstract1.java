interface print{
	void print();
}

class A implements print{
	public void print()
	{
		System.out.println("hello");
	}

}
public class abstract1 {
public static void main(String[] args) {
	print ob  = new A();
	ob.print();
}
}
