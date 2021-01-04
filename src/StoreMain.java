/**
 * this class is the driver of the program
 * it gets the user to create a new shopping cart and 
 * items to purchase.
 * it also gives a menu to do any tasks that a shopper would do
 */
import java.util.Scanner;

public class StoreMain {
	/**
	 * this is the main driver of the program
	 * creates a new shopping cart
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner joemama = new Scanner(System.in);

		System.out.println("Enter Customer's Name: ");
		String customerName = joemama.nextLine();//gets the users input for their name

		System.out.println("Enter Today's Date: ");
		String currentDate = joemama.nextLine();//gets the users input for the date

		Cart identity = new Cart(customerName, currentDate);//creates new shopping cart with the variable customerName and currentDate

		System.out.println();

		System.out.println("Customer Name: " + identity.getCustomerName());//shopping cart gives the name and it prints 

		System.out.println("Today's Date: " + currentDate);

		Menu(identity);// makes the program go to the print menu
	}
	/**
	 * displays a menu for the user to choose from certain program tasks
	 * @param trolly
	 */
	public static void Menu(Cart trolly) {
		while (true) {//the menu continues until the while loop is false(when the user enters "q")
			
			System.out.println("MENU");
			System.out.println("a - Add item to cart");
			System.out.println("d - Remove item from cart");
			System.out.println("c - Change item quantity");
			System.out.println("i - Output item's description");
			System.out.println("o - Output shopping cart");
			System.out.println("q - Quit\nChoose an option");

			Scanner joemama = new Scanner(System.in);
			char single = joemama.next().charAt(0);//users input on the character they chose
			joemama.nextLine();

			
			if (single == 'A' || single == 'a') {//only passes through if user entered A
				System.out.println("ADD ITEM TO CART");

				System.out.println("Enter Item Name: ");
				String product = joemama.nextLine();//user enters the name of the item that they want to add

				System.out.println("Enter the item description: ");
				String description = joemama.nextLine();//user enters the description of the item they want to add

				System.out.println("Enter the item price: ");
				int price = joemama.nextInt();//user enters the price of the item that they want to add

				System.out.println("Enter the item quantity: ");
				int quantity = joemama.nextInt();//user enters the quantity of the item that they want to add

				joemama.nextLine();

				Merchandise stuff = new Merchandise(product, description, price, quantity);//passes all the users answers through itemtopurchase

				trolly.addItem(stuff);//add stuff in the shopping cart
			}

			
			else if (single == 'D' || single == 'd') {//only passes through if the user enter d
				System.out.println("REMOVE ITEM");
				System.out.println("Enter name of item to remove");
				String product = joemama.nextLine();//user enters the product that they want to get rid of
				trolly.removeItem(product);// shopping cart removes that item
			}

			
			else if (single == 'C' || single == 'c') {//only passes through if the user enters c
				System.out.println("CHANGE ITEM QUANTITY");
				System.out.println("Enter the item name: ");
				String product = joemama.nextLine();//user enters the name of the item in which they want to change the quantity for
				System.out.println("Enter the new quantity: ");
				int quantity = joemama.nextInt();//user enter the new quantity

				Merchandise stuff = new Merchandise();

				stuff.setName(product);//puts the name of the product through itemtopurchase
				stuff.setQuantity(quantity);//puts the quantity of the product through itemtopurchase
				trolly.modifyItem(stuff);//puts the change into shopping cart

			}

			
			else if (single == 'I' || single == 'i') {//only passes if the user enters i
				System.out.println("OUTPUT ITEM'S DESCRIPTIONS");
				trolly.printDescription();//shopping cart prints the items description
			}

			
			else if (single == 'O' || single == 'o') {//only passes if the user enters o
				System.out.println("OUTPUT SHOPPING CART");
				trolly.printTotal();//shopping cart prints the total
			}

			// if 'q', quit program
			else if (single == 'Q' || single == 'q') {//only passes if the user enters q
				break;//stops the program
			}
		}
	}

}
