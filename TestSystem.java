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


		while (input != 4) {

			System.out.println("Welcome to the inventory management system.  Please make a selection:\n");
			System.out.println("1: Add item(s)\n"+
								"2: Remove item(s)\n"+
								"3: View inventory\n"+
								"4: Exit\n");

			input = sc.nextInt();
			

			if (input == 1) {
				System.out.println("Enter item name:\n");
				newName = sc.next();
				System.out.println("Enter product ID:\n");
				newProductID = sc.nextInt();
				System.out.println("Enter price");
				newPrice = sc.nextDouble();
				System.out.println("Enter quantity:\n");
				newQuantity = sc.nextInt();

				sys.addItem(new Item(newName, newProductID, newPrice, newQuantity));
			} 
			else if (input == 2) {
				//removes last item in inventory
				sys.removeItem();
			}
			else if (input == 3) {
				System.out.println(sys.toString());
			}
		
		} 
	
	}


}