package game;

import java.util.ArrayList;

public class Player {

    private String name;
    private String age;

    private ArrayList<Item> Inventory = new ArrayList<Item>();

    public Player(String name, String age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void takeItem(Room room, Item item) {
        room.removeItem(item);
        Inventory.add(item);
    }




}

