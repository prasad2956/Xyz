package Basicprogram;

public class Firstprogram {

	// main method

	
		public static void main(String args[]) {

			  	
		
		Firstprogram obj=new Firstprogram();
		
			obj.sumnumber2(10, 20, 30);		
		
	obj.sumnumber2(55l, 5);
	
	obj.func();
	
	}

	// simple method with out parameter and without return type	
		
		
	
		public int sumnumber2(int a, int b, int c){
		System.out.println("my class");
	return a+b+c;

	
		}	
		
	public long sumnumber2(long a, int b) {
		long c=a/b;
	System.out.println(c);	
		
		return c;
	}
	public int func() {
		int x=20;
		System.out.println("my program");
		return 10;
	}
	
	
	
		
}
