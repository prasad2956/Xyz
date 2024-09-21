package programs;

public class PolyDemo1 

{

	public static void main(String[] args)
	{
		PolyDemo1 p1 = new PolyDemo1();
		p1.funA();
		p1.funA(10);
		p1.funA(489);
		p1.funA(10.23f);
		p1.funA(10.23);
		p1.funA('m');
		p1.funA(true);
		
	}
	void funA()
	{
		System.out.println("zero args of funA");
	}
	void funA(int a)
	{
		System.out.println("int args of funA");
	}
	void funA(long b)
	{
		System.out.println("long args of funA");
	}
	void funA(float c)
	{
		System.out.println("float args of funA");
	}
	void funA(double d)
	{
		System.out.println("double args of funA");
	}
	void funA(char e) 
	{
		System.out.println("char args of funA");
	}
	void funA(boolean f)
	{
		System.out.println("boolean args of funA");
	}
}
