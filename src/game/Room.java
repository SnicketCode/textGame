package game;

import java.util.ArrayList;

class RoomsInit {

	public static void build(Room[][] room, final int WIDTH, final int HEIGHT) {

		// Initialize rooms
		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < HEIGHT; j++) {
				room[i][j] = new Room();
			}
		}

		room[0][0].setName("Hill");
		room[0][0].setDescription("You are on a hill. It overlooks a dreamy view of the village to the south.");
		room[0][0].addItems(new Item("Pinecone", "Its prickly and it hurts.", false));

		room[0][1].setName("Village");
		room[0][1].setDescription("The village you were overlooking is now upon you.");
		room[0][1].addItems(new Item("Key to the Village", "It's rustic with some oxidation", false));


		room[1][0].setName("House");
		room[1][0].setDescription("Your house.");
		room[1][0].addItems(new Item("Plate", "Fine china", false));


		room[1][1].setName("Cave Mouth");
		room[1][1].setDescription("You are in the mouth of a damp cave.");
		room[1][0].addItems(new Item("Wooden Stick", "Fine starter's combat kit", true));


	}
 
}

class Room {

	private String name = "name_missing";
	private String description = "desc_missing";
	public ArrayList<Item> items = new ArrayList<Item>();

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void addItem(Item item)
	{
		items.add(item);
	}

	public void removeItems(Item item) {
		items.remove(item);
	}

	public void addItems(Item item) {
		items.add(item);
	}
	
	public Item findItem(String lookingFor)
	{
		for (Item item : items)
		{
			if(item.getItemName().equalsIgnoreCase(lookingFor))
			{
				return item;
			}
		}
		return null;
	}

	public void printRoomDescription(boolean detailMode) {


		System.out.println(getDescription());
		System.out.println("Items in the vicinity:");

		for(Item item : items)
		{
			if (!detailMode)
			{
				System.out.println("  " + item.getItemName());
			} else {
				System.out.println("  " + item.getItemName() + ": " + item.getItemDescription());

			}
		}

	}

	public void printRoomDescription() {
		printRoomDescription(false);
	}

}    


