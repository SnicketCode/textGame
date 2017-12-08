package game;

public class Item {

	private String name;
	private String description;
	private int damage;

	//This is a push test from Windows to Mac
	public Item(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public Item(String name, String description, int damage)
	{
		this.name = name;
		this. description = description;
		this.damage = damage;
	}

	public String getItemName() {
		return name;
	}

	public void setItemName(String name) {
		this.name = name;
	}

	public String getItemDescription() {
		return description;
	}

	public void setItemDescription(String description) {
		this.description = description;
	}
	
	public String toString()
	{
		return name;
	}

	public boolean doesDamage()
	{
	}


}
