package tiyemba.tapiwa;

import java.util.Scanner;

public class World {
	
	public static boolean isRunning;
	
	static Scanner scanner = new Scanner(System.in);
	
	String input = "";

	/**
	 * The world Constructor take two paramters
	 * @param player - player object
	 * @param item - item object
	 */
	public World(Player player, Item item) {
		double ddx = (player.xCord * 2)+ (item.xCord*2);
		double ddy = (player.yCord * 2)+ (item.yCord*2);
		double total = ddx + ddy;
		int playerPosition = 0;
		double distance = Math.sqrt(total);
		int castDist = (int) distance;
		//System.out.println("The dial reads " + castDist + "m");
		Story.intro();
		System.out.println();
		System.out.println();
		while(playerPosition != castDist) {
				
		System.out.println("The dial reads " + castDist + "m");
		String input = scanner.next();
		if(input.equalsIgnoreCase("north")) {
			playerPosition = playerPosition  +2;
			castDist =  castDist -playerPosition ;
		}else if(input.equalsIgnoreCase("west")) {
			playerPosition = playerPosition  +1;
			castDist = castDist - playerPosition;
		}else if(input.equalsIgnoreCase("south")) {
			playerPosition = playerPosition -2;
			castDist = castDist - playerPosition;
		}else if (input.equalsIgnoreCase("east")){
			playerPosition =playerPosition -1;
			castDist = castDist - playerPosition;
		}
		
		
			
		}
		
		
		
		
	}
	


	
	
	
}
