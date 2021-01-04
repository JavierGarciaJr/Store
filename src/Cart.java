/**
 * this class creates a shopping cart for the user
 */
import java.util.ArrayList;



public class Cart {// sets the date, name and creates an array to store the info of the cart

	private String currentDate;
	ArrayList<Merchandise> cartItems = new ArrayList<Merchandise>();
	private String customerName;
	/**
	 * states the minimum for the cart
	 */
	public Cart() {

		currentDate = "no date";
		customerName = "no name";
	}
	/**
	 * makes the private variables equal to the variables contributed
	 * @param name
	 * @param date
	 */
	public Cart(String name, String date) {

		this.currentDate = date;
		this.customerName = name;
	}
	/**
	 * gets/returns the name of the customer
	 * @return
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * sets the users name
	 * @param customerName
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * returns the current date
	 * @return
	 */
	public String getCurrenDate() {
		return currentDate;
	}
	/**
	 *  sets the date that the user entered
	 * @param currentDate
	 */
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	/**
	 * adds an item to the array
	 * @param stuff
	 */
	public void addItem(Merchandise stuff) {
		cartItems.add(stuff);
	}
	/**
	 *  removes items from the array
	 * @param product
	 */
	public void removeItem(String product) {
		boolean regulate = false;// initializes to false
		for (Merchandise stuff : cartItems) {
			if (stuff.getName().equalsIgnoreCase(product)) {

				regulate = true;// makes the boolean true to indicate that the item was already in the cart
				cartItems.remove(stuff);// removes the item from the array
				break;
			}

		}

		if (!regulate) {// only if the user enters an item that is not in the cart
			System.out.println("Item not found in cart. Nothing removed.");
		}
	}
	/**
	 * changes the quantity of an product
	 * 
	 * @param newStuff
	 */
	public void modifyItem(Merchandise newStuff) { 
		boolean regulate = false;//initializes regulate
		for (Merchandise stuff : cartItems) {
			if (stuff.getName().equalsIgnoreCase(newStuff.getName())) {
				if (stuff.getQuantity() != 0) {
					stuff.setQuantity(newStuff.getQuantity());//changes the quantity within the array
				}

				regulate = true;
				break;
			}

		}

		if (!regulate) {//only if the item is not in array
			System.out.println("Item not found in cart. Quantity not changed.");
		}
	}
	/**
	 * returns the quantity of items in cart
	 * @return
	 */
	public int getNumItemsInCart() {
		
		int totalStuff = 0;
		for (Merchandise stuff : cartItems) {
			totalStuff += stuff.getQuantity();
		}

		return totalStuff;
	}
	/**
	 * gets the cost of the amount of items and the cost individually
	 * @return
	 */
	public double getCostOfCart() {
		double totalPrice = 0;
		for (Merchandise stuff : cartItems) {
			totalPrice += stuff.getPrice();
		}

		return totalPrice;
	}
	/**
	 * prints what is in the cart
	 */
	public void printTotal() {
		if (cartItems != null && cartItems.size() > 0) {
			System.out.println(customerName + "'s Shopping Cart - " + currentDate + "\n");
			System.out.println("Number of Items: " + cartItems.size() + "\n");

			for (Merchandise stuff : cartItems) {
				stuff.printMerchandiseCost();//puts stuff through printitemcost
			}
		}

		else {//if the user did not put anything in the cart
			System.out.println("SHOPPING CART IS EMPTY");
		}
	}
	/**
	 * prints the descriptions
	 */
	public void printDescription() {
		System.out.println(customerName + "'s Shopping Cart - " + currentDate + "\nItem Descriptions");

		for (Merchandise stuff : cartItems) {
			stuff.printMerchandiseDescription();
		}
	}
}
