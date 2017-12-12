package game;

import java.util.ArrayList;

public class Player {

	private String name;
    private int maxHitPoints;
    private int hitPoints;
    private int numPotions;
    private Item weapon;



	private ArrayList<Item> Inventory = new ArrayList<Item>();

	
	public Player(String name, int maxHitPoints, int hitPoints, int numPotions, Item weapon) {
        super();
        this.name = name;
        this.maxHitPoints = maxHitPoints;
        this.hitPoints = hitPoints;
        this.numPotions = numPotions;
        this.weapon = weapon;
    }

    public Item getWeapon() {
        return weapon;
    }

    public void setWeapon(Item weapon) {
        this.weapon = weapon;
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
    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public void setMaxHitPoints(int maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getNumPotions() {
        return numPotions;
    }

    public void setNumPotions(int numPotions) {
        this.numPotions = numPotions;
    }

	public void printInventory()
	{
		for(Item item : Inventory)
		{
				System.out.println("  " + item.getItemName() + ": " + item.getItemDescription());

		}
		
	}
}

