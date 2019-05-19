package exercises;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;


/* 
 * Use the Gridworld Reference document in the "doc" directory to complete the following tasks;
 * 
 * 1. Figure out how to get the World to show.
 * 2. Figure out how to add a Bug to the world (clue: you will need the Bug and Location objects)
 * 3. Add another bug at a random location in the world.
 * 4. Change the color of that bug to blue.
 * 5. Make the bug face to the right.
 * 6. Add flowers to the left and right of the bug.
 * 7. Fill the whole world with flowers!
*/

public class Gridworld {
	
	public static void main(String[] args) {
		World world = new World ();
		world.show();
				
		Bug bug = new Bug ();
		Location location = new Location(0,0);
		
		world.add(location, bug);
		
		Bug bug1 = new Bug();
		Location location1 = new Location (3,4);
		
		world.add(location1, bug1);
		bug1.setColor(Color.blue);
		bug1.turn();
		bug1.turn();

		Flower flowers = new Flower();
		Flower flowers1 = new Flower ();
		Flower flowers2 = new Flower ();
		
		
		Location location2 = new Location (3,3);
		Location location3 = new Location (3,5);
		
		world.add(location2, flowers);
		world.add(location3, flowers);
		
		flowers1.setColor(Color.green);
		flowers2.setColor(Color.orange);
		
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {			
			Location location4 = new Location (i,j);
			world.add(location4, flowers1);
			}
			
//		for (int n = 1; n < 10; n++) {
//			Location location5 = new Location(n, 0);
//			world.add(location5, flowers2);
//			
//		}
			
		}
	}
	
}
