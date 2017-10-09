

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
		this.name = name;
		this.productID = productID;
		this.price = price;
		//this.manufacturer = manufacturer;
		this.quantity = quantity;
	}

	//Item[] inventory = new Item[100];

	public String getName() {
		String output = "Name: "+name+"   ProductID: "+productID+"   Quantity: "+quantity ;
		return output;
	}


}