package javaprogram3;

public class conditionalclass {
	int id;
public  conditionalclass(int id) {
	this.id=id;
}
	public static void main(String args[]) {
	
		conditionalclass stident1=new conditionalclass(12);
		
		int x=50;
		int y=40;
		
		if(x>y) {
			System.out.println("x greaterthan y");
		}else {
			System.out.println("y greaterthan x");
		}
		
		int marks=90;
		
		if(marks>87) {
			System.out.println("A grade");
		}else if(marks>70) {
			System.out.println("B grade");
		}else if(marks>55) {
			System.out.println("C grade");
		}
		
		int day=5;
		
		switch(day) {
		case 1: System.out.println("1st rank");
		break;
		case 2: System.out.println("2nd rank");
		  break;
		case 3: System.out.println("3rd rank");
		break;
		case 4:System.out.println("4th rank");
		break;
		case 5:System.out.println("5th rank");
		break;
		default : System.out.println("enter correct value");
		}
		
		
		
		
		
		
		
	}
	
}
