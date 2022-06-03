package project1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Home Class
 * 
 * Contains static variables
 * 
 * Contains a money button with various functions
 * 		- adds +1 to the money total each time button is pressed
 * 		- contains criteria needed in order to enable certain buttons
 * 
 * Contains a sleep button with various functions
 * 		- adds +1 to day count
 * 
 *		 - resets milking ability for cows
 *		 - resets shearing ability for sheep
 *		 - resets grabbing egg ability for chickens
 * 
 * 		- feeds cattle 2 fodder per cattle each day
 * 		- feeds sheep 2 hay per sheep each day
 * 		- feeds chicken 4 seed per chicken each day
 * 
 * @author Jacqueline Molina
 */
public class Home extends JPanel implements ActionListener {
	
	/**
	 * protected static variables needed throughout the entire project
	 */
	
	protected static int cow_death_count = 3;
	protected static int sheep_death_count = 3;
	protected static int chicken_death_count = 3;


	/**
	 * default constructor
	 */
	public Home() {
		//panel layout
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		GridBagConstraints c = new GridBagConstraints();
		
		/**
		 * MONEY BUTTON
		 * 
		 * - adds +1 to the money total each time button is pressed
		 * - contains criteria needed in order to enable certain buttons
		 * 
		 */
		JButton bttn_money = new JButton("click me");
		
		bttn_money.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Stats.money_count++;
				Stats.money.setText("Total Money: " + Stats.money_count);
				
				if (Stats.money_count >= 30) {
					Store.btn_buySeed.setEnabled(true);
				}
				if (Stats.money_count >= 50) {
					Store.btn_buyFodder.setEnabled(true);
				}
				if (Stats.money_count >= 60) {
					Store.btn_buyHay.setEnabled(true);
				}
				if (Stats.money_count >= 150) {
					Store.btn_buyChicken.setEnabled(true);
				}
				if (Stats.money_count >= 250) {
					Store.btn_buySheep.setEnabled(true);
				}
				if (Stats.money_count >= 500) {
					Store.btn_buyCow.setEnabled(true);
				}
				
			}
			
		});		
		c.gridx = 1;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(bttn_money, c);
		
		// money label identifies how much is added to total
		JLabel lbl_money = new JLabel("+1 dollar", SwingConstants.CENTER);
		c.gridx = 1;
		c.gridy = 2;
		this.add(lbl_money, c);
		
		
		/**
		 * SLEEP BUTTON
		 * 
		 * - adds +1 to day count
		 * 
		 * - resets milking ability for cows
		 * - resets shearing ability for sheep
		 * - resets grabbing egg ability for chickens
		 * 
		 * - feeds cattle 2 fodder per cattle each day
		 * - feeds sheep 2 hay per sheep each day
		 * - feeds chicken 4 seed per chicken each day
		 */
		JButton bttn_day = new JButton("sleep");
		bttn_day.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
				
			// Adds +1 to current day count
				Stats.day_count++;
				Stats.day.setText("DAY NUMBER: " + Stats.day_count + "/30");
				
			// ENDS GAME
			if (Stats.day_count == 30) {
				
				// disables all buttons
				bttn_money.setEnabled(false);
				bttn_day.setEnabled(false);
				Market.btn_sellEggs.setEnabled(false);
				Market.btn_sellMilk.setEnabled(false);
				Market.btn_sellWool.setEnabled(false);
				Barn.btn_grabEgg.setEnabled(false);
				Barn.btn_milk.setEnabled(false);
				Barn.btn_shear.setEnabled(false);
				Store.btn_buyChicken.setEnabled(false);
				Store.btn_buyCow.setEnabled(false);
				Store.btn_buySheep.setEnabled(false);
				Store.btn_buyFodder.setEnabled(false);
				Store.btn_buyHay.setEnabled(false);
				Store.btn_buySeed.setEnabled(false);
				
				/**
				 * New Frame contains final stats screen
				 */
				JFrame f = new JFrame("End of Game!");
				JPanel p = new JPanel();
				f.add(p);
					
				p.setLayout(new GridBagLayout());
				p.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
				GridBagConstraints d = new GridBagConstraints();
				
				JLabel l1 = new JLabel("CONGRATS! YOUVE REACHED THE END");
				d.gridx = 0;
				d.gridy = 0;
				p.add(l1, d);
				
				JLabel l2 = new JLabel(" ");
				d.gridx = 0;
				d.gridy = 1;
				p.add(l2, d);
				
				JLabel l3 = new JLabel(" FINAL STATISTICS ");
				d.gridx = 0;
				d.gridy = 2;
				p.add(l3, d);
				
				JLabel l4 = new JLabel(" ");
				d.gridx = 0;
				d.gridy = 3;
				p.add(l4, d);
				
				JLabel l5 = new JLabel(" Total Money: " + Stats.money_count);
				d.gridx = 0;
				d.gridy = 4;
				p.add(l5, d);
				
				JLabel l6 = new JLabel(" Total Cattle: " + Stats.cattle_count);
				d.gridx = 0;
				d.gridy = 5;
				p.add(l6, d);
				
				JLabel l7 = new JLabel(" Total Sheep: " + Stats.sheep_count);
				d.gridx = 0;
				d.gridy = 6;
				p.add(l7, d);
				
				JLabel l8 = new JLabel(" Total Chickens: " + Stats.chicken_count);
				d.gridx = 0;
				d.gridy = 7;
				p.add(l8, d);
					
				f.pack();
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setLocationRelativeTo(null);
				f.setResizable(false);
			}				
				
			// Resets Milking Ability
				Barn.btn_milk.setEnabled(true);
				Barn.milking_count = 2;
				Barn.btn_milk.setText("milk cows (" + Barn.milking_count + ")");
				MISC.milk_error.setText(" ");
				
			// Resets Shearing Ability
				Barn.btn_shear.setEnabled(true);
				Barn.shear_count = 1;
				Barn.btn_shear.setText("shear sheep (" + Barn.shear_count + ")");
				MISC.shear_error.setText(" ");
				
			// Resets grabEgg Ability
				Barn.btn_grabEgg.setEnabled(true);
				Barn.grabEgg_count = 1;
				Barn.btn_grabEgg.setText("grab eggs (" + Barn.grabEgg_count + ")");
				MISC.grabEgg_error.setText(" ");
				
			// Feeds cows 2 pieces of fodder daily per cow
				// if fodder count is less than needed or 0
				if ((Stats.fodder_count < (Stats.cattle_count * 2)) || (Stats.fodder_count == 0)) {
					// change label
					Stats.fodder.setText("Total Fodder: " + Stats.fodder_count + " (-" + (Stats.cattle_count * 2) + "/day)");
					
					// send error messages + warning messages
					MISC.fodder_error.setText("not enough fodder");
					MISC.cowdeath_error.setText("cattle dies in " + cow_death_count + " days");
					cow_death_count--;
					
					// if death count reaches 0
					if (cow_death_count < 0) {
						// kill cattle
						Stats.cattle_count = 0;
						Stats.cattle.setText("Total Cattle: " + Stats.cattle_count);
						MISC.cowdeath_error.setText("cattle dead");
						// disable ability to milk cows
						Barn.btn_milk.setEnabled(false);
					}	
				}
				// if fodder is plentiful
				else {
					// subtract 2 fodder per cow from total fodder count
					Stats.fodder_count -= (Stats.cattle_count * 2);
					Stats.fodder.setText("Total Fodder: " + Stats.fodder_count + " (-" + (Stats.cattle_count * 2) + "/day)");
				}
				
				
			// Feeds sheep 2 pieces of hay daily per sheep
				// if number of sheep is at least 1
				if (Stats.sheep_count >= 1) {
					// if the hay is not enough to feed the sheep
					if ((Stats.hay_count < (Stats.sheep_count * 2)) || (Stats.hay_count == 0)) {
						// change label
						Stats.hay.setText("Total Hay: " + Stats.hay_count + " (-" + (Stats.sheep_count * 2) + "/day)");
						
						// send warning messages
						MISC.hay_error.setText("not enough hay");
						MISC.sheepdeath_error.setText("sheep die in " + sheep_death_count + " days");
						sheep_death_count--;
						
						// if death count reaches 0
						if (sheep_death_count < 0) {
							// kill sheep
							Stats.sheep_count = 0;
							Stats.sheep.setText("Total Sheep: " + Stats.sheep_count);
							MISC.sheepdeath_error.setText("sheep dead");
							// disable ability to shear sheep
							Barn.btn_shear.setEnabled(false);
						}
						
					}
					// if there is enough hay
					else {
						// feed 2 hay per sheep
						Stats.hay_count -= (Stats.sheep_count * 2);
						Stats.hay.setText("Total Hay: " + Stats.hay_count + " (-" + (Stats.sheep_count * 2) + "/day)");
					}
					
				}
				// if there are no sheep
				else if (Stats.sheep_count == 0) {
					// disable ability to shear
					Barn.btn_shear.setEnabled(false);
					Stats.hay.setText("Total Hay: " + Stats.hay_count + " (-" + (Stats.sheep_count * 2) + "/day)");
				}
				
				
			// Feeds chicken 4 pieces of seed daily per chicken
				// if there exists at least one chicken
				if (Stats.chicken_count >= 1) {
					// if there is not enough seed to feed chickens
					if ((Stats.seed_count < (Stats.chicken_count * 4)) || (Stats.seed_count == 0)) {
						// change label
						Stats.seed.setText("Total Seed: " + Stats.seed_count + " (-" + (Stats.chicken_count * 4) + "/day)");
						
						// send warning message
						MISC.seed_error.setText("not enough seed");
						MISC.chickendeath_error.setText("chicken die in " + chicken_death_count + " days");
						chicken_death_count--;
						
						// if death count reaches 0
						if (chicken_death_count < 0) {
							// kill chickens
							Stats.chicken_count = 0;
							Stats.chicken.setText("Total Chickens: " + Stats.chicken_count);
							MISC.chickendeath_error.setText("chickens dead");
							// disable ability to pick up eggs
							Barn.btn_grabEgg.setEnabled(false);
						}
						
					}
					// if there is enough seed
					else {
						// feed 4 seed per chicken
						Stats.seed_count -= (Stats.chicken_count * 4);
						Stats.seed.setText("Total Seed: " + Stats.seed_count + " (-" + (Stats.chicken_count * 4) + "/day)");
					}
					
				}
				// if there are no chickens
				else if (Stats.chicken_count == 0) {
					// disable ability to grab eggs
					Barn.btn_grabEgg.setEnabled(false);
					Stats.seed.setText("Total Seed: " + Stats.seed_count + " (-" + (Stats.chicken_count * 4) + "/day)");
				}

			}
			
		});
	
		c.gridx = 2;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(bttn_day, c);
		
		JLabel lbl_day = new JLabel("+1 day", SwingConstants.CENTER);
		c.gridx = 2;
		c.gridy = 2;
		this.add(lbl_day, c);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
	}

}
