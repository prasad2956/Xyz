package javapractice;
import java.util.Scanner;
public class Firstclass {

	public static void main(String args[]) {
		 
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter Any Number");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
		System.out.println("Enter the String value");
		String s=sc.next();
	}
}
