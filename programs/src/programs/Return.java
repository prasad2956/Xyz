package programs;

public class Return {

	int x,y;
	void fun1()
	{
		x=x+1;
		Return d1=new Return();
		d1.x=x+2;
		System.out.println(d1.x);
	}
	public static void main(String[]args)
	{
		Return d1=new Return();
		d1.fun1();
	}
}
