

import java.text.DecimalFormat;

//contains constructor for generic item in inventory 
public class Item {
	int currentIndex = 0;

	//attributes of generic inventory item

	String name = "generic_name";
	int productID = 00000;
	double price = 0.00;		
	//String manufacturer = "manufacturer_name";
	int quantity = 0;
	
	//constructor with initial values

	public Item () {
	}

	public Item (String name, int productID, double price, int quantity) {

		//DecimalFormat df = new DecimalFormat("0.00");

		this.name = name;
		this.productID = productID;
		this.price = price;
		//this.manufacturer = manufacturer;
		this.quantity = quantity;
	}

	//Item[] inventory = new Item[100];

	public String getName() {

		DecimalFormat df = new DecimalFormat("#.00");
		//price = df.format(price);

		String output = "Name: "+name+"   ProductID: "+productID+"   Quantity: "+quantity+"   Price per Unit: $"+df.format(price) ;
		return output;
	}

	public double getValue () {
		double value = quantity * price;
		return value;
	}


}