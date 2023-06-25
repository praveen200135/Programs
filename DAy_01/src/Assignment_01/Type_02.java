package Assignment_01;

public class Type_02 {
	
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int sub(int p,int b)
	{
		int w=p-b;
		return w;
	}
	public int mul(int p,int b)
	{
		int w=p*b;
		return w;
	}
	public void div(int q,int w)
	{
		System.out.println(q/w);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Type_02 t =new Type_02();
	 int ref1=t.add(10, 2);
	 int ref2=t.add(ref1,2);
	 int ref3=t.sub(ref2,2);
	 int ref4=t.mul(ref3,2);
	 t.div(ref4,2);
	}

}
