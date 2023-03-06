package bddlearn.course;

public class RestaurantMenuItem {
	private String ItemName;

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public RestaurantMenuItem(String itemName, String description, String price) {
		super();
		ItemName = itemName;
		Description = description;
		Price = price;
	}

	public String getItemName() {
		return ItemName;
	}

	private String Description;
	private String Price;

}
