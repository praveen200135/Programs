package Assignment_01;

public class Call_method {
	
	int rollno=234;
	int age=34;
	
	public void display()
	{
		System.out.println("Welcome to all of you");
	}
	public void display1()
	{
		System.out.println("Automation is easy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Call_method ref1= new Call_method();
		int y=ref1.rollno;
		System.out.println(y);
		System.out.println(ref1.age);
		ref1.display();
		ref1.display1();
				
		
	}

}
