package game;

public class main {

    public static void main(String args[]) {

        // Build rooms of any size using the RoomsInit class, under Room.java
        final int WIDTH = 2;
        final int HEIGHT = 2;
        Room[][] room = new Room[WIDTH][HEIGHT];
        RoomsInit.build(room, WIDTH, HEIGHT);
        boolean gameRunning = true;
        int x = 0;
        int y = 0;
        
        // My greedy credit
    	System.out.println("Jakub's Text Adventure");

    	
    	// Print starting room description generated from RoomInit Class
    	RoomsInit.print(room, x, y);

        // Start game loop
        while (gameRunning) {

        	// Grabs user input generated from PlayerInput Class
            String input = PlayerInput.getInput();

            // Movement commands
            if (input.equals("n")) {
                if (y > 0) {
                    y--;
                    RoomsInit.print(room, x, y);
                } else {
                    System.out.println("Unable to proceed north.");
                }
            } else if (input.equals("s")) {
                if (y < HEIGHT - 1) {
                    y++;
                    RoomsInit.print(room, x, y);
                } else {
                    System.out.println("Unable to proceed south.");
                }
            } else if (input.equals("e")) {
                if (x > 0) {
                    x--;
                    RoomsInit.print(room, x, y);
                } else {
                    System.out.println("Unable to proceed east.");
                }
            } else if (input.equals("w")) {
                if (x < WIDTH - 1) {
                    x++;
                    RoomsInit.print(room, x, y);
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
            	System.out.println("There are some commands that can only be accessed by obtaining a special item");

            	System.out.println("------------------------------------------------------");

            }

            // Look commands
            else if (input.equals("look")) {
                RoomsInit.print(room, x, y);
            }
            
            else if (input.equals("look closer")) {
            	RoomsInit.printDet(room, x, y);
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
