package javaprogram;

import java.util.Scanner;

public class javapractice {
   String name="hari";
   static int B=30;
   
   static char gender='m';
   
	
	
	public static void main (String args[]) {
	
 
	//variables
	javapractice obj=new javapractice();
	
	String s="prasad";
	System.out.println(s.length());
	System.out.println(s.charAt(2));
	System.out.println(s.contains("an"));
	System.out.println(s.substring(2 ,4));
	System.out.println(s.concat(" dasari"));
	
	Scanner scan= new Scanner(System.in); 
	String p=scan.next();
	System.out.println("ENTER the String  value");
	
	System.out.println("javapractice");
	
	System.out.println(B);
	System.out.println(obj.name);
	System.out.println(gender);
	   
	}
	
}
