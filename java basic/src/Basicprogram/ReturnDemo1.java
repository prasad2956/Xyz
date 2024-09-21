package Basicprogram;

public class ReturnDemo1 {
int funA() {
int a=10;
int b=5;
int c=a+b;
System.out.println(c);
return c;
}
long funB() {
	long a=25l;
	long b=568l;
	long z=a+b;
	System.out.println(z);
	return z;
}


public static void main(String[]args)
{
	ReturnDemo1 obj=new ReturnDemo1();
	obj.funA();
	obj.funB();
}

}
