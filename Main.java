package Assignment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opt,choice,select;
		
		
		Advertisement ad = new Advertisement();
		ad.settitleAd("Get Discount 20% "); // encapsulation
		ad.setdate("19/12/2021");// encapsulation
		ad.printinfo();
		
		do {
		System.out.println("Please Select User as : \n1-Admin \n2-Customer");
		choice = scan.nextInt();
		switch(choice) {	
		case 1 : System.out.println("** Grocery System **");
				 System.out.println("As an Admin you are allowed to enter : ");
		         do {
		         System.out.println("\n1.Finance System \n2.Employee System \n3.Advertisement System");
		         System.out.println("Please Choose : ");
		         opt = scan.nextInt();
		         switch(opt) {
		         case 1 :Finance fn = new Finance();
		        	 	 System.out.println(fn);break;
		         case 2 :Employee em = new Employee();
		         		 System.out.println(em);break;
		         case 3 :ad.printinfo();
		         		 System.out.println("Coupon will be able before "+ ad.getdate());
		         		 System.out.println();break;
		         }
		         System.out.println("Continue As Admin?(1-Yes,2-No)");
		 		 select = scan.nextInt();
		         }while(select==1);break;
		         
		         
		case 2 :do { 
				 System.out.println("** Welcome to the Watsun **");
        		 System.out.println("\n1.Grocery Items \n2.Billing System \n3.Exit");
                 System.out.println("Please select your option : ");
                 opt = scan.nextInt();
                 switch(opt) {

                 case 1 :GroceryItems a = new GroceryItems();
                	 	 System.out.println(a);break;
                 case 2 :BillingSystem b = new BillingSystem();
        	     		 System.out.println(b);break;
                	 	 
                 }
                 if(opt<1 && opt>3) {
                	 System.out.println("\n1.Grocery Items \n2.Billing System \n3.Exit");			         
                	 System.out.println("Please Choose");
			         opt = scan.nextInt();
		         }
                 System.out.println("Continue As Customer?(1-Yes,2-No)");
		 		 select = scan.nextInt();
		         }while(select==1);break;
        		 }
		System.out.println("Continue Using Grocery System?(1-Yes,2-No)");
		select = scan.nextInt();
		
		}while(select==1);
		System.out.println("Thankyou for come this Grocery.");
		
	}

}



