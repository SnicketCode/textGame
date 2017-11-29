package game;

public class Item {

	private static String name;
	private static String description;

	//This is a push test from Windows to Mac
	public Item(String name, String description) {
		super();
		Item.name = name;
		Item.description = description;
	}


	public static String getItemName() {
		return name;
	}

	public void setItemName(String name) {
		Item.name = name;
	}

	public static String getItemDescription() {
		return description;
	}

	public void setItemDescription(String description) {
		Item.description = description;
	}
	
	
	public String toString()
	{
		return name;
	}



}
