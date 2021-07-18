package Assignment2;

import java.util.Scanner;

public class Employee extends GroceryBackground{ //Inheritance
	Scanner scan = new Scanner(System.in);
	private int noOfEmployee = 4;
	private double monthperSalary1 = 3000.00; //admin salary
	private double monthperSalary2 = 1200.00; //sales assistant salary
	private double monthperSalary3 = 1500.00; //cashier salary
	private double monthperSalary4 = 2000.00; //supervisor salary
	private int respond;
	

	Employee() {
		System.out.println("---Employee System---");
		System.out.println("Watsun contains a total of "+this.noOfEmployee+" employee.");
		Employeeexp a = new Employeeexp();
		System.out.printf("\nTotal Expenses On Salary : RM %.2f " , a.payment());
		printinfo();
		System.out.println();
	}
	
	public void printinfo() {
		do {
		System.out.println("\n1-Admin\n2-Sales Assistant\n3-Cashier\n4-Supervisor");
		System.out.print("\nSelect to check details : ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1 : System.out.println("1 Admin");
		 		 System.out.println("\nName   : Zulhafiz"+
		 				 			"\nAge    : 21"+
		 				 			"\nTel    : 01119721782"+
		 				 			"\nSalary : RM " + this.monthperSalary1);
		 		 					System.out.println();break;
		
		case 2 : System.out.println("2 Sales Assistant");
				 System.out.println("\nName   : Zul"+
						 "\nAge    : 22"+
						 "\nTel    : 0139693625"+
						 "\nSalary : RM " + this.monthperSalary2);
				 
		
		case 3 : System.out.println("3 Cashiers");
				 System.out.println("\nName   : Erul"+
						 "\nAge    : 22"+
						 "\nTel    : 0147562734"+
						 "\nSalary : RM " + this.monthperSalary3);
				
				 		 
		case 4 : System.out.println("4 Supervisor");
				 System.out.println("\nName   : Abdul"+
						 "\nAge    : 26"+
						 "\nTel    : 0129874625"+
						 "\nSalary : RM " + this.monthperSalary4);
				
		}
		System.out.println("Continue Checking another Employee?(1-Yes,0-No) : ");
	    respond = scan.nextInt();
	    if(respond!=1&&respond!=0) {
	    	System.out.println("Wrong Input.");
	    	System.out.println("Continue Checking another Employee?(1-Yes,0-No) : ");
		    respond = scan.nextInt();
	    }  
		}while(respond==1);
		System.out.println("End Checking Employee Personal Information");
	}
	
}
