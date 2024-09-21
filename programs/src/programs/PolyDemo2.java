package programs;

public class PolyDemo2 
{

	public static void main(String[] args)
	{
		PolyDemo2 p1 = new PolyDemo2();
        A a = null;
        p1.funA(a);
        B b = null;
        p1.funA(b);
        C n =null;
        p1.funA(n);
		
	}
void funA(A a)
{

      System.out.println("class A args of PolyDemo2");
      System.out.println(a);
} 
void funA(B b)
{
	  System.out.println("class B args of PolyDemo2");
	  System.out.println(b);
}
void funA(C c)
{
	System.out.println("class C args of PolyDemo2");
	System.out.println(c);
}
}
