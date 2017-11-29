package game;

import java.util.ArrayList;

public class Player {

	private String name;

	private ArrayList<Item> Inventory = new ArrayList<Item>();

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void takeItem(Room room, Item item) {
		room.removeItems(item);
		Inventory.add(item);
	}

	
	public void printInventory()
	{
		for(Item item : Inventory)
		{
				System.out.println("  " + item.getItemName() + ": " + item.getItemDescription());

		}
		
	}
}

