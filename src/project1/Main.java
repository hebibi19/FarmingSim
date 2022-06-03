package project1;

import java.awt.*;
import javax.swing.*;

/**
 * Main CLASS
 * 
 * Contains a JFrame, JPanel, and JTabbedPane
 * 
 * @author Jacqueline Molina
 */
public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * FRAME (aka the base of the gui)
		 */
		JFrame frame = new JFrame("Farm Simulator");

		/**
		 * Initializing Objects
		 */
		// leftmost panel
		JPanel stats = new Stats();
		// middle panel
		JPanel home = new Home();
		JPanel barn = new Barn();
		JPanel market = new Market();
		JPanel store = new Store();
		// rightmost panel
		JPanel misc = new MISC();
		
		/**
		 * TABBED PANE
		 */
		JTabbedPane tp = new JTabbedPane();
		tp.setBounds(50, 50, 200, 200);
		tp.add("home", home);
		tp.add("barn", barn);
		tp.add("market", market);
		tp.add("store", store);
		
		
		/**
		 * Panel allows all three panels to rest side by side
		 */
		JPanel panel = new JPanel();
		// type of panel layout (GRIDLayout)
		panel.setLayout(new GridLayout(0, 3));
		panel.add(stats, 0, 0);
		panel.add(tp, 0, 1);
		panel.add(misc, 0, 2);
		


		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// does not allow resizing frame
		frame.setResizable(false);
		frame.pack();
		// opens gui in the center of the screen
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		

		
	}

}
