import java.util.Scanner;

public class TestSystem {

	public static void main (String[] args) {

		InventorySystem sys = new InventorySystem();
		Scanner sc = new Scanner (System.in);
		String newName = "";
		int newQuantity = 0;
		double newPrice = 0;
		int newProductID = 00000;
		int input = 0;
		boolean programmingRunning = true;


		while (programmingRunning) {

			System.out.println("Welcome to the inventory management system.  Please make a selection:\n");
			System.out.println("1: Add item(s)\n"+
								"2: Remove item(s)\n"+
								"3: View inventory\n"+
								"4: Exit\n");

			input = sc.nextInt();
			

			if (input == 1) {
				System.out.println("Enter item name:\n");
				sc.nextLine();
				newName = sc.nextLine(); 

				System.out.println("Enter product ID:\n");
				newProductID = sc.nextInt();

				System.out.println("Enter price");
				newPrice = sc.nextDouble();

				System.out.println("Enter quantity (limit 99):\n");
				newQuantity = sc.nextInt(); 
				if (newQuantity > 99 || newQuantity < 1) {
					do{
						System.out.println("Invalid entry.  Please input a quantity between 1 and 99.");
						newQuantity = sc.nextInt();
					}while(newQuantity >99 || newQuantity < 1);

				}

				System.out.println("Item successfully added.");
				

				sys.addItem(new Item(newName, newProductID, newPrice, newQuantity));
			} 
			else if (input == 2) {
				//removes last item in inventory
				if(sys.isEmpty()) {
					System.out.println("Inventory is currently empty.  No items to remove.\n");
				}
				else {
					sys.removeItem();}
			}
			else if (input == 3) {
				if (sys.isEmpty()) {
					System.out.println("Inventory is currently empty.  \n");
				}
				else {
				System.out.println(sys.toString()); 
				}
			}
			else {
				programmingRunning = false;
			}

		
		} 
	
	}


}