package Assignment1;

public class Advertisement extends GroceryBackground { //inheritance
	
	private String titleAd;
	private String date;
	
	public Advertisement(){
		printinfo();
	}
	
	public void printinfo() {//polymorphism
		System.out.println("*****************SALES PROMOTION**************");
		Advertisement e = new Advertisement();//interface
		System.out.println(titleAd + "Cash Voucher RM " + ((Advertisement) e).Advertisement() + " in purchasement more than RM 250.00");
	}
	
	private String Advertisement() {
		return null;
	}

	public void settitleAd(String titleAd) { // setter getter method (encapsulation)
		this.titleAd = titleAd;
	}
	
	public void setdate(String date) {
		this.date = date;
	}
	
	public String gettitleAd() {
		return this.titleAd;
	}
	
	public String getdate() {
		return this.date;
	}
	
	

}



