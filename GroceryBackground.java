package Assignment2;

public abstract class GroceryBackground {
	
	protected String name;
	protected String location;
	protected String contact;
	
	GroceryBackground() {
		this.name = "Watsun";
		this.location = "Tumpat";
		this.contact = "097193642";

	}
	
	public void print() {
		System.out.println("Name     : " + this.name);
		System.out.println("Location : " + this.location);
		System.out.println("Contact: " + this.contact);

	}
	public abstract void printinfo(); //abstract method and polymorphism
}

