package javaprogram;

public class Returnmethod1 {

	public static void main(String[]args)
	{
		int grossSalary=100000;
	Returnmethod1 obj=new Returnmethod1();

		int charges=obj.housecharges();
		
		int netSalary=grossSalary-charges;
		System.out.println(netSalary);
		int taxcal=30*charges;
		System.out.println(taxcal);
	}
	
	int housecharges()
	
	{
	System.out.println("housecharges is invoking");	
		int rent=10000;
	int childfee=20000;
	int totalcharges=rent+childfee;
	System.out.println(totalcharges);
	return totalcharges;
	}

}
