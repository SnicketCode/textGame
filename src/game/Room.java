package game;

import java.util.ArrayList;

class RoomsInit {

    public static void build(Room[][] room, final int WIDTH, final int HEIGHT) {

    	// Initialize rooms
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                room[i][j] = new Room(i, "", "", null);
            }
        }

        room[0][0].setNumber(1);
        room[0][0].setName("Hill");
        room[0][0].setDescription("You are on a hill. It overlooks a dreamy view of the village to the south.");
        room[0][0].addItems(new Item("Pinecone", "Its prickly and it hurts."));
        room[0][0].addItems(new Item("Error", "404"));

        



        room[0][1].setNumber(2);
        room[0][1].setName("Village");
        room[0][1].setDescription("The village you were overlooking is now opon you.");


        room[1][0].setNumber(3);
        room[1][0].setName("House");
        room[1][0].setDescription("Your house.");


        room[1][1].setNumber(4);
        room[1][1].setName("Cave Mouth");
        room[1][1].setDescription("You are in the mouth of a damp cave.");

    }

    public static void print(Room[][] room, int x, int y) {

    	
    	System.out.println();
        System.out.println(room[x][y].getDescription());
        System.out.println("Items in the vicinity: " + Item.getItemName());

    }
    

    public static void printDet(Room[][] room, int x, int y) {

    	
        System.out.println("Items with notation: " + Item.getItemName() + " " + Item.getItemDescription());

    }
}

class Room {

    private int number;
    private String name;
    private String description;
    public ArrayList<Item> items = new ArrayList<Item>();

    public Room(int number, String name, String description, ArrayList<String> items) {

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

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
    
    public ArrayList<Item> getItems() {
        return this.items;
    }

	public void removeItems(Item item) {
		items.remove(item);
	}
	
    public void addItems(Item item) {
        items.add(item);
    }

    
 
}
