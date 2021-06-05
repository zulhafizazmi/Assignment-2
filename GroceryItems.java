package Assignment1;

import java.util.Scanner;

public class GroceryItems extends GroceryBackground {
	
	Scanner scan = new Scanner(System.in);
	private String category;
	private String brand;
	private String suitableFor;
	private double price;
	private int choice;
	
	GroceryItems(){
	    System.out.println("***Shop Menu***");
		System.out.println("Select category : ");
		int option = scan.nextInt();
		switch(option) {
	
		case 1 : this.category = "Syampoo";
		 System.out.println("*** "+ category +" ***");
         this.brand = "Sunsilk";
	     System.out.println("Brand  : " + brand);
	     this.suitableFor = "Women";
	     System.out.println("Suitable for        : " + suitableFor);
	     this.price = 11.99;
	     System.out.printf("Price       : RM %.2f" , price);
	     break;
	     

		
		 case 2 : this.category = "Soap";
		 System.out.println("*** "+category+" ***");
	     this.brand = "Lifebuoy";
		 System.out.println("Brand  : " + brand);
		 this.suitableFor = "Anyone";
		 System.out.println("Suitable for        : " + suitableFor);
		 this.price = 15.99;
		 System.out.printf("Price       : RM %.2f" , price);
		 break;
		  
		  
		  
		 case 3 : this.category = "Cosmetics";
 		  System.out.println("*** "+category+" ***");
 		  this.brand = "Garnier Men";
		  System.out.println("Brand       : " + brand);
		  this.suitableFor = "Men";
		  System.out.println("Suitable for        : " + suitableFor);
		  this.price = 7.99;
		  System.out.printf("Price       : RM %.2f" , this.price);
		  break;
		 

   }
		
     System.out.println("\n1-Continue Checking Details \n2-Exit");
     choice = scan.nextInt();
     if(choice != 1 && choice != 2) {
	 System.out.println("Choose only \n1-Continue Checking Details \n2-Exit ");
	 choice = scan.nextInt();

   }   
     
     while(choice == 1); {
	 System.out.println("Have a nice day! See you again! " +super.name);
	 
    }
	}

	public String brand() {
		return brand;
}
	public String suitableFor() {
		return suitableFor;
}

	public double price() {
		return price;
}
	@override
	public void printinfo() {

}
}
