 class Clown{
	 int x;
		public Clown() {
			x=0;
		}
		public Clown(int a) {
			this.x = a;
			System.out.println("THe value of x is  :" +x);
		}
		public Clown(int a , int b) {
			this.x = a+b;
			System.out.println("THe value of x is  :" +x);
		
		}
	   }

public class Lab1 {

	public static void main(String[] args)
	{	Clown[] ob = new Clown[5];
        for (int i=0;i<6;i++)
        {
        	if(i==0)
        	ob[i] = new Clown ();
        	if(i==1) {
            	ob[i] = new Clown (i,i+3);}
        	if(i>=2)
        		ob[i] = new Clown (i);
        	
        	
        }
	}
}