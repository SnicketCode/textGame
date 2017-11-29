package game;

public class Main {

	public static void main(String args[]) {

		// Build rooms of any size using the RoomsInit class, under Room.java
		final int WIDTH = 2;
		final int HEIGHT = 2;
		Room[][] rooms = new Room[WIDTH][HEIGHT];
		RoomsInit.build(rooms, WIDTH, HEIGHT);
		boolean gameRunning = true;
		int x = 0;
		int y = 0;
		final String takeCommandPrefix = "take ";
		
		Player player  = new Player("Jakub");
		
		// My greedy credit
		System.out.println("Jakub's Text Adventure");
		

		// Print starting room description generated from RoomInit Class
		rooms[x][y].printRoomDescription();

		// Start game loop
		while (gameRunning) {

			// Grabs user input generated from PlayerInput Class
			String input = PlayerInput.getInput();
			System.out.println();
			// Movement commands
			if (input.equals("n")) {
				if (y > 0) {
					y--;
					rooms[x][y].printRoomDescription();
				} else {
					System.out.println("Unable to proceed north.");
				}
			} else if (input.equals("s")) {
				if (y < HEIGHT - 1) {
					y++;
					rooms[x][y].printRoomDescription();
				} else {
					System.out.println("Unable to proceed south.");
				}
			} else if (input.equals("e")) {
				if (x > 0) {
					x--;
					rooms[x][y].printRoomDescription();
				} else {
					System.out.println("Unable to proceed east.");
				}
			} else if (input.equals("w")) {
				if (x < WIDTH - 1) {
					x++;
					rooms[x][y].printRoomDescription();
				} else {
					System.out.println("Unable to proceed west.");
				}
			}

			//Help commands
			else if (input.equals("help")) {
				System.out.println("------------------------------------------------------");
				System.out.println("Type 'n' or 'e' or 's' or 'w' to move around the \"map\"");
				System.out.println("Type 'look' for a description of the \"room\" you're in");
				System.out.println("Type 'quit' to terminate the program");
				System.out.println("Type 'look closer' for a closer look at items in the room");
				System.out.println("Type 'take <item>' to take the item you inputed");
				System.out.println("Type 'backpack' to look in your bag of trash");
				System.out.println("There are some commands that can only be accessed by obtaining a special item");
				System.out.println("------------------------------------------------------");

			}

			// Look commands
			else if (input.equals("look")) {
				rooms[x][y].printRoomDescription();
			}
			
			else if (input.equals("look closer")) {
				rooms[x][y].printRoomDescription(true);
			}
			
			//Take command
			else if (input.startsWith(takeCommandPrefix)) {
				
				Item item = rooms[x][y].findItem(input.substring(takeCommandPrefix.length()));
				if (item == null)
				{
					System.out.println("No items found! Better luck in the next room.");
				} else {
					System.out.println("Congrats! You found: " + item.getItemName() + ", and I bet it's trash anyway!");
					player.takeItem(rooms[x][y], item);
				}
			}
			
			else if (input.equals("backpack"))
			{
				player.printInventory();
			}
		
			// Quit
			else if (input.equals("quit")) {
				System.out.println("Thank you for playing!");
				gameRunning = false;

				// If all else fails, run this.
			} else {
				System.out.println("You can't do that.");
			}
		}
		System.exit(0);
	}
}
