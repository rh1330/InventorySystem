
// main program for inventory system

public class InventorySystem {

	//create array

	public Item[] inventory = new Item[100];
	public int currentIndex = 0;

	//constructor for Inventory System
	//public InventorySystem (){

	//}
	


	/*TESTING - REMOVE LATER

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

	public void removeItem () {
		this.inventory[currentIndex] = null;
		currentIndex--;

	}

	public String toString () {
		String msg = "";
		for (int i =0; i < currentIndex; i++) {
			msg = msg + "item #"+(i+1)+" "+inventory[i].getName()+"\n";
		}
		return msg;
	}

}