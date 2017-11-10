
// main program for inventory system

public class InventorySystem {

	//create array

	public Item[] inventory = new Item[100];
	public int currentIndex = 0;

	//constructor for Inventory System
	//public InventorySystem (){

	//}
	


	/*TE

	//addItem(0);
	Item item1 = new Item();
	//inventory[0] = item1;
	inventory.addItem(item1);
	//System.out.println(item1.getName());
	System.out.println(inventory[0].getName());
	//System.out.println(item1);
	//System.out.println(inventory[0].getName());

	*/

	//method for adding inventory item 
	
	public void addItem (Item newItem) {
		this.inventory[currentIndex] = newItem;
		currentIndex++;
	}

	//remove last item
	public void removeItem () {
		this.inventory[currentIndex] = null;
		currentIndex--;

	}

	public void modifyItem(int index, int quantity) {
		// get quantity.  Subtract quantity and set new quantity.  				
		int original = this.inventory[index-1].getQuantity();
		int newQuantity = original - quantity;

		//send error message is user attempts to deduct more than available quantity 
		if (newQuantity < 0) {
			System.out.println("Error!  Pick a valid quantity.\n");
		}		
		//set new quanity 
		else if (newQuantity > 0) {
			this.inventory[index-1].setQuantity(newQuantity); 
			System.out.println("Quantity removed. \n");
		}
		//remove item from inventory array
		else {
			this.inventory[index-1] = null;
			System.out.println("Item(s) removed from inventory. \n");

			for (int i = index-1; i< currentIndex+1; i++) {
				inventory[i] = inventory[i+1];
			}

		}

	}

	//remove item by search

	//check if inventory is empty 

	public boolean isEmpty() {
		if (currentIndex > 0)
			return false;
		else
			return true;
			
	}

	public String toString () {
		String msg = "";
		double currentValue = 0;

		for (int i =0; i < currentIndex; i++) {
			//currentValue += inventory[i].getValue();
			if (inventory[i] != null)
				msg = msg + "Item #"+(i+1)+" "+inventory[i].getName()+"\n";

			//msg = msg + "Total value of items in inventory:  $"+showValue
		}
		//msg = msg + "The total value of all items in inventory:  $"+currentValue+".\n";
		return msg;
	}


}