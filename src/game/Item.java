package game;

public class Item extends ItemGeneric {

	private String name;
	private String description;
	private boolean doesDamage;

	//This is a push test from Windows to Mac

	public Item(String name, String description)
	{
		super(name, description);

	}

	public Item(String name, String description, boolean doesDamage)
	{
		super(name, description);
		this.doesDamage = doesDamage;

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
	
}
