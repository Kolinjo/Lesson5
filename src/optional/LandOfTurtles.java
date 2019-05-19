package optional;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		
		JFrame jframe = new JFrame();
		jframe.setVisible(true);
		
		jframe.getContentPane().add(panel);
		panel.setBackgroundImage(galapagosIslands);
		jframe.setSize(600, 400);
		
		Turtle turtle = new Turtle ();
		panel.addTurtle(turtle);
		
		for (int i = 1; i <= 50; i++) {
			panel.addTurtle(turtle);
			//haven't finished...still to come
		}

		// 1. Instantiate a JFrame object & make it visible
		// 2. Add the panel to the frame

		// 3. Set the background image of the panel to the Galapagos Islands

		//4. Set the size image of the frame to 600 by 400 

		// 5. Instantiate a Turtle

		// 6. Add the turtle to the panel 

		// 7. Put 50 Turtles on the beach

	}
}
