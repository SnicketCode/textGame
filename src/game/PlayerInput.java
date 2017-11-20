package game;

import java.util.Scanner;

public class PlayerInput {
	
    public static String getInput() {
    	
        System.out.print("> ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input.toLowerCase();
        return input;
    }
}

