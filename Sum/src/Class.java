import java.util.Scanner;

	 class Employee 
	{  
	    String name; 
	    String id; 
	    int age; 
	    String gender; 
	  
	    public Employee(String name, String id, 
	                   int age, String gender) 
	    { 
	        this.name = name; 
	        this.id = id; 
	        this.age = age; 
	        this.gender = gender; 
	    
	    }
	    
	    public String getName() 
	    { 
	        return name; 
	    } 
	  
	    public String getid() 
	    { 
	        return id; 
	    } 
	  
	    public int getAge() 
	    { 
	        return age; 
	    } 

	    public String getgender() 
	    { 
	        return gender; 
	    } 
	    public String toString() 
	    { 
	        return("Hi Your name is "+ this.getName()+ 
	               ".\nYour id,age and gender are " + 
	               this.getid()+"," + this.getAge()+ 
	               ","+ this.getgender()); 
	    } 
	}
	 public class Class {

	 public static void main(String[] args) 
	    { 
	    	java.util.Scanner s = new Scanner(System.in);
	    	System.out.println("Enter your name :");
	    	String a = s.nextLine();
	    	System.out.println("Enter your age ");
	    	int b = s.nextInt();
	    	System.out.println("Enter your gender :");
	    	String c = s.nextLine();
	    	System.out.println("Enter your id :");
	    	String d = s.nextLine();
	        Employee obj = new Employee(a,d,b,c); 
	    	System.out.println(obj.toString()); 
	    } 
} 

