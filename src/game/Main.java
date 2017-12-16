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
		
		Player player  = new Player("Jakub", 10, 10, 0 , null);
		
		// My greedy credit
		System.out.println("Layout for a text adventure!");
		System.out.println("Edit the final int and for loop for generating rooms to make it your own.");


		// Print starting room description generated from RoomInit Class TEST
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
				System.out.println("There are some commands that can only be accessed by trial and error");
				System.out.println("------------------------------------------------------");

			}

			// Look commands
			else if (input.equals("look")) {
				rooms[x][y].printRoomDescription();
			}

			else if (input.equals("name"))
			{
				player.getName();
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

			else if (input.equals("memes"))
			{
				System.out.println("Many people always ask me how I was able to get into Harvard as a 16 year old who skipped 3 grades of high school. They think I got in because of my scholarly records, but no the key is the interview.\n" +
						"As I sat in the Harvard Dean's office in front of the board of reviewers for my application, the Dean asks me \"Why should you be a good candidate for this school?\" They seemed bored but I replied \"Well I was born a child prodigy, placed 1st in my state spelling bee for three consecutive years, I can speak eight different languages not counting Latin, play four different instruments, I skipped grades 4 through 6, and graduated my high school as valedictorian at the age of 14. I then worked as an intern at both Telsa, and NASA.\" Suddenly the room burst into laughter and many of board instantly started scribbling down \"No\" near the application check marks. The Dean says \"Sorry but you are just not the type we are looking for.\" But then I said \"Excuse me but I wasn't finished... I watch Rick and Morty\" The Dean looked at me like an idiot and said \"So....?\" Then I replied with a smile \"And I understand all the references and subtle jokes\" An audible gasp let out by the board was so loud the secretary had to come in. You could hear a pin drop and then suddenly all at once the entire board clicked their pens on the \"Approved Box\" and I was instantly handed a diploma and now I'm teaching advanced physicals there. I guess you can say I'm pretty smart. :)");
			}
			// Quit
			else if (input.equals("quit")) {
				System.out.println("Thank you for playing!");
				gameRunning = false;
				//This breaks the loop and allows System.exit(0); to run!

				// If all else fails, run this.
			} else {
				System.out.println("You can't do that.");
			}
		}
		System.exit(0);
	}
}
