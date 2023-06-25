package Assignment2;

public class Connec {
	
	Connec()
	{
		System.out.println("im the default constructor");
	}
	
	Connec(int a)
	{
		System.out.println("so im parameterized"+" "+a);
	}
    
	public void koki()
	{
		System.out.println("Vinter is cool");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connec c = new Connec(3);
		c.koki();

	}

}
