/**
 * this class is dedicated to items in the cart
 * @author Javier
 *
 */
public class Merchandise {
	
	private String itemDescription;
	private int itemQuantity;
	private double itemPrice;
	private String thing;
	
	/**
	 * sets to the minimum of the cart
	 */
	public Merchandise() {
		itemQuantity = 0;
		thing = "none";
		itemDescription = "none";
		itemPrice = 0;
		
	}
	/**
	 * makes the private variable equal to the variables contributed
	 * @param product
	 * @param description
	 * @param price
	 * @param quantity
	 */
	public Merchandise(String product, String description, double price, int quantity) {
		this.itemPrice = price;
		this.thing = product;
		this.itemQuantity = quantity;
		this.itemDescription = description;
	}
	/**
	 * sets the individual name of a product
	 * @param newThing
	 */
	public void setName(String newThing) {
		this.thing = newThing;
	}
	/**
	 * gets/returns the name of the individual product
	 * @return
	 */
	public String getName() { 
		return thing;
	}
	/**
	 * sets the descriptions to the private variable
	 * @param newDescription
	 */
	public void setDescription(String newDescription) {
		this.itemDescription = newDescription;
	}
	/**
	 * gets/returns those descriptions
	 * @return
	 */
	public String getDescription() {
		return itemDescription;
	}
	/**
	 * sets the price of the product
	 * @param newPrice
	 */
	public void setPrice(double newPrice) {
		this.itemPrice = newPrice;
	}
	/**
	 * gets/returns the price of the product
	 * @return
	 */
	public double getPrice() {
		return itemPrice;
	}
	/**
	 * sets the quantity to the new variable
	 * @param newQuantity
	 */
	public void setQuantity(int newQuantity) {
		this.itemQuantity = newQuantity;
	}
	/**
	 * gets/returns the individual quantity
	 * @return
	 */
	public int getQuantity() {
		return itemQuantity;
	}
	/**
	 * prints the cost of each item
	 */
	public void printMerchandiseCost() {
		
		double amount = itemQuantity * itemPrice;//multiplies the amount of a certain product and the price to get the total amount that will be spent on that items
		System.out.println(thing + " " + itemQuantity + " @ " + "$" + itemPrice + " = " + "$" + amount);

	}
	/**
	 * prints the description
	 */
	public void printMerchandiseDescription() {
		System.out.println(thing + ":" + itemDescription);
	}

}
