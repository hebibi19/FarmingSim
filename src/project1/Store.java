package project1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

/**
 * Store Class
 * 
 * contains six buttons
 * 	- three buttons for buying animals (cattle, sheep, chicken)
 * 	- three buttons for buying animal food (fodder, hay, seed)
 * 
 * @author Jacqueline Molina
 */
public class Store extends JPanel implements ActionListener {
	
	/**
	 * protected static variables needed throughout the entire project
	 */
	
	protected static JButton btn_buyCow;
	protected static JButton btn_buySheep;
	protected static JButton btn_buyChicken;

	protected static JButton btn_buyFodder;
	protected static JButton btn_buyHay;
	protected static JButton btn_buySeed;
	
	/**
	 * default constructor
	 */
	public Store() {
		
		//layout manager
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		GridBagConstraints c = new GridBagConstraints();
		
		/**
		 * BUTTON BUYS COW
		 */
		btn_buyCow = new JButton("+1 cow");
		
		//event handler
		btn_buyCow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// add 1 cow
				Stats.cattle_count += 1;
				
				// allow cow to be milked
				Barn.btn_milk.setEnabled(true);
				Barn.milking_count = 1;
				Barn.btn_milk.setText("milk cows (" + Barn.milking_count + ")");
				
				//change labels
				Stats.cattle.setText("Total Cattle: " + Stats.cattle_count);
				Stats.fodder.setText("Total Fodder: " + Stats.fodder_count + " (-" + (Stats.cattle_count * 2) + "/day)");
				
				// change money amount
				Stats.money_count -= 500;
				Stats.money.setText("Total Money: " + Stats.money_count);
				
				// if cattle count is 1, reset cowdeath counts
				if (Stats.cattle_count == 1) {
					MISC.cowdeath_error.setText(" ");
					Home.cow_death_count = 3;
				}
				
				// disable certain options in the store if money is under a certain amount
				if (Stats.money_count < 500) {
					btn_buyCow.setEnabled(false);
				}
				if (Stats.money_count < 250) {
					btn_buySheep.setEnabled(false);
				}
				if (Stats.money_count < 150) {
					btn_buyChicken.setEnabled(false);
				}
				if (Stats.money_count < 60) {
					btn_buyHay.setEnabled(false);
				}
				if (Stats.money_count < 50) {
					btn_buyFodder.setEnabled(false);
				}
				if (Stats.money_count < 30) {
					btn_buySeed.setEnabled(false);
				}
	
			}
		});
		
		c.gridx = 1;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipadx = 5;
		this.add(btn_buyCow, c);
		
		// buy cow label
		JLabel lbl_buyCow = new JLabel("-$500", SwingConstants.CENTER);
		c.gridx = 1;
		c.gridy = 1;
		c.ipadx = 5;
		this.add(lbl_buyCow, c);
		
		
// EMTPY SPACE
		JLabel space1 = new JLabel(" ");
		c.gridx = 1;
		c.gridy = 2;
		c.ipadx = 5;
		this.add(space1, c);
// EMTPY SPACE

		
		/**
		 * BUTTON BUYS SHEEP
		 */
		btn_buySheep = new JButton("+1 sheep");
		
		btn_buySheep.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// add 1 sheep
				Stats.sheep_count += 1;
				
				// enable shearing
				Barn.btn_shear.setEnabled(true);
				Barn.shear_count = 1;
				Barn.btn_shear.setText("shear sheep (" + Barn.shear_count + ")");
				
				//change labels
				Stats.sheep.setText("Total Sheep: " + Stats.sheep_count);
				Stats.hay.setText("Total Fodder: " + Stats.hay_count + " (-" + (Stats.sheep_count * 2) + "/day)");
				
				//change money amount
				Stats.money_count -= 250;
				Stats.money.setText("Total Money: " + Stats.money_count);
				
				// if sheep = 1, reste death counts
				if (Stats.sheep_count == 1) {
					MISC.sheepdeath_error.setText(" ");
					Home.sheep_death_count = 3;
				}
				
				// disable certain options in the store if money is under a certain amount
				if (Stats.money_count < 500) {
					btn_buyCow.setEnabled(false);
				}
				if (Stats.money_count < 250) {
					btn_buySheep.setEnabled(false);
				}
				if (Stats.money_count < 150) {
					btn_buyChicken.setEnabled(false);
				}
				if (Stats.money_count < 60) {
					btn_buyHay.setEnabled(false);
				}
				if (Stats.money_count < 50) {
					btn_buyFodder.setEnabled(false);
				}
				if (Stats.money_count < 30) {
					btn_buySeed.setEnabled(false);
				}
	
			}
		});
		
		c.gridx = 1;
		c.gridy = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipadx = 5;
		this.add(btn_buySheep, c);
		
		// milk jug label
		JLabel lbl_buySheep = new JLabel("-$250", SwingConstants.CENTER);
		c.gridx = 1;
		c.gridy = 4;
		c.ipadx = 5;
		this.add(lbl_buySheep, c);
		
	// EMTPY SPACE
		JLabel space2 = new JLabel(" ");
		c.gridx = 1;
		c.gridy = 5;
		c.ipadx = 5;
		this.add(space2, c);
	// EMTPY SPACE

				
		/**
		* BUTTON BUYS CHCKEN
		*/
		btn_buyChicken = new JButton("+1 chicken");
				
		btn_buyChicken.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// add 1 chicken	
				Stats.chicken_count += 1;
					
				// allow for egg grabbing
				Barn.btn_grabEgg.setEnabled(true);
				Barn.grabEgg_count = 1;
				Barn.btn_grabEgg.setText("grab eggs (" + Barn.grabEgg_count + ")");
						
				// change labels
				Stats.chicken.setText("Total Chickens: " + Stats.chicken_count);
				Stats.seed.setText("Total Seed: " + Stats.seed_count + " (-" + (Stats.chicken_count * 4) + "/day)");
						
				// change money
				Stats.money_count -= 150;
				Stats.money.setText("Total Money: " + Stats.money_count);
				
				// if chicken = 1, reset death counts
				if (Stats.chicken_count == 1) {
					MISC.chickendeath_error.setText(" ");
					Home.chicken_death_count = 3;
				}
						
				// disable certain options in the store if money is under a certain amount
				if (Stats.money_count < 500) {
					btn_buyCow.setEnabled(false);
				}
				if (Stats.money_count < 250) {
					btn_buySheep.setEnabled(false);
				}
				if (Stats.money_count < 150) {
					btn_buyChicken.setEnabled(false);
				}
				if (Stats.money_count < 60) {
					btn_buyHay.setEnabled(false);
				}
				if (Stats.money_count < 50) {
					btn_buyFodder.setEnabled(false);
				}
				if (Stats.money_count < 30) {
					btn_buySeed.setEnabled(false);
				}
			
					}
				});
				
				c.gridx = 1;
				c.gridy = 6;
				c.fill = GridBagConstraints.HORIZONTAL;
				c.ipadx = 5;
				this.add(btn_buyChicken, c);
				
				// milk jug label
				JLabel lbl_buyChicken = new JLabel("-$150", SwingConstants.CENTER);
				c.gridx = 1;
				c.gridy = 7;
				c.ipadx = 5;
				this.add(lbl_buyChicken, c);
		
		
		/**
		 * BUTTON FODDER
		 */
		btn_buyFodder = new JButton("+25 fodder");
		
		// event handler		
		btn_buyFodder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// if the fodder isnt enoough to feed the cows					
				if (Stats.fodder_count < (Stats.cattle_count * 2)) {
					
					Stats.fodder_count += 25;
					Stats.fodder.setText("Total Fodder: " + Stats.fodder_count + " (-" + (Stats.cattle_count * 2) + "/day)");
						
					Stats.money_count -= 50;
					Stats.money.setText("Total Money: " + Stats.money_count);
						
					// reset death counts	
					MISC.cowdeath_error.setText(" ");
					MISC.fodder_error.setText(" ");
					Home.cow_death_count = 3;
					
					// disable certain options in the store if money is under a certain amount
					if (Stats.money_count < 500) {
						btn_buyCow.setEnabled(false);
					}
					if (Stats.money_count < 250) {
						btn_buySheep.setEnabled(false);
					}
					if (Stats.money_count < 150) {
						btn_buyChicken.setEnabled(false);
					}
					if (Stats.money_count < 60) {
						btn_buyHay.setEnabled(false);
					}
					if (Stats.money_count < 50) {
						btn_buyFodder.setEnabled(false);
					}
					if (Stats.money_count < 30) {
						btn_buySeed.setEnabled(false);
					}
				}
				
				else {
					// enable ability to buy fodder
					btn_buyFodder.setEnabled(true);

					Stats.fodder_count += 25;
					Stats.fodder.setText("Total Fodder: " + Stats.fodder_count + " (-" + (Stats.cattle_count * 2) + "/day)");
						
					Stats.money_count -= 50;
					Stats.money.setText("Total Money: " + Stats.money_count);
					
					// disable certain options in the store if money is under a certain amount
					if (Stats.money_count < 500) {
						btn_buyCow.setEnabled(false);
					}
					if (Stats.money_count < 250) {
						btn_buySheep.setEnabled(false);
					}
					if (Stats.money_count < 150) {
						btn_buyChicken.setEnabled(false);
					}
					if (Stats.money_count < 60) {
						btn_buyHay.setEnabled(false);
					}
					if (Stats.money_count < 50) {
						btn_buyFodder.setEnabled(false);
					}
					if (Stats.money_count < 30) {
						btn_buySeed.setEnabled(false);
					}
						
				}
				
			}
		});
		
		c.gridx = 2;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(btn_buyFodder, c);
		
		// fodder label
		JLabel lbl_buyFodder = new JLabel("-$50", SwingConstants.CENTER);
		c.gridx = 2;
		c.gridy = 1;
		this.add(lbl_buyFodder, c);
		
		// EMTPY SPACE
				JLabel space3 = new JLabel(" ");
				c.gridx = 2;
				c.gridy = 2;
				c.ipadx = 5;
				this.add(space3, c);
		// EMTPY SPACE
		
		/**
		 * BUTTON HAY
		 */
		btn_buyHay = new JButton("+15 hay");
		
		// event handler
		btn_buyHay.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// if there isnt enough hay to feed the sheep					
				if (Stats.hay_count < (Stats.sheep_count * 2)) {
					
					Stats.hay_count += 25;
					Stats.hay.setText("Total Hay: " + Stats.hay_count + " (-" + (Stats.sheep_count * 2) + "/day)");
						
					Stats.money_count -= 60;
					Stats.money.setText("Total Money: " + Stats.money_count);
						
					// reset death counts	
					MISC.sheepdeath_error.setText(" ");
					MISC.hay_error.setText(" ");
					Home.sheep_death_count = 3;
					
					// disable certain options in the store if money is under a certain amount
					if (Stats.money_count < 500) {
						btn_buyCow.setEnabled(false);
					}
					if (Stats.money_count < 250) {
						btn_buySheep.setEnabled(false);
					}
					if (Stats.money_count < 150) {
						btn_buyChicken.setEnabled(false);
					}
					if (Stats.money_count < 60) {
						btn_buyHay.setEnabled(false);
					}
					if (Stats.money_count < 50) {
						btn_buyFodder.setEnabled(false);
					}
					if (Stats.money_count < 30) {
						btn_buySeed.setEnabled(false);
					}
				}
				
				else {
					// enable ability to buy hay
					btn_buyHay.setEnabled(true);

					Stats.hay_count += 15;
					Stats.hay.setText("Total Hay: " + Stats.hay_count + " (-" + (Stats.sheep_count * 2) + "/day)");
						
					Stats.money_count -= 60;
					Stats.money.setText("Total Money: " + Stats.money_count);
					
					// disable certain options in the store if money is under a certain amount
					if (Stats.money_count < 500) {
						btn_buyCow.setEnabled(false);
					}
					if (Stats.money_count < 250) {
						btn_buySheep.setEnabled(false);
					}
					if (Stats.money_count < 150) {
						btn_buyChicken.setEnabled(false);
					}
					if (Stats.money_count < 60) {
						btn_buyHay.setEnabled(false);
					}
					if (Stats.money_count < 50) {
						btn_buyFodder.setEnabled(false);
					}
					if (Stats.money_count < 30) {
						btn_buySeed.setEnabled(false);
					}
						
				}
				
			}
		});
		
		c.gridx = 2;
		c.gridy = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(btn_buyHay, c);
		
		// hay label
		JLabel lbl_buyHay = new JLabel("-$60", SwingConstants.CENTER);
		c.gridx = 2;
		c.gridy = 4;
		this.add(lbl_buyHay, c);
		
		// EMTPY SPACE
		JLabel space4 = new JLabel(" ");
		c.gridx = 2;
		c.gridy = 5;
		c.ipadx = 5;
		this.add(space4, c);
		
		/**
		 * BUTTON SEED
		 */
		btn_buySeed = new JButton("+50 seed");
		
		// event handler
		btn_buySeed.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// if there isnt enough seed to feed the chickens					
				if (Stats.seed_count < (Stats.chicken_count * 4)) {
					
					Stats.seed_count += 50;
					Stats.seed.setText("Total Seed: " + Stats.seed_count + " (-" + (Stats.chicken_count * 4) + "/day)");
						
					Stats.money_count -= 30;
					Stats.money.setText("Total Money: " + Stats.money_count);
						
					// reset death counts
					MISC.chickendeath_error.setText(" ");
					MISC.seed_error.setText(" ");
					Home.chicken_death_count = 3;
					
					// disable certain options in the store if money is under a certain amount
					if (Stats.money_count < 500) {
						btn_buyCow.setEnabled(false);
					}
					if (Stats.money_count < 250) {
						btn_buySheep.setEnabled(false);
					}
					if (Stats.money_count < 150) {
						btn_buyChicken.setEnabled(false);
					}
					if (Stats.money_count < 60) {
						btn_buyHay.setEnabled(false);
					}
					if (Stats.money_count < 50) {
						btn_buyFodder.setEnabled(false);
					}
					if (Stats.money_count < 30) {
						btn_buySeed.setEnabled(false);
					}
				}
				
				else {
					// enable ability to buy seed
					btn_buySeed.setEnabled(true);

					Stats.seed_count += 50;
					Stats.seed.setText("Total Seed: " + Stats.seed_count + " (-" + (Stats.chicken_count * 4) + "/day)");
						
					Stats.money_count -= 30;
					Stats.money.setText("Total Money: " + Stats.money_count);
					
					// disable certain options in the store if money is under a certain amount
					if (Stats.money_count < 500) {
						btn_buyCow.setEnabled(false);
					}
					if (Stats.money_count < 250) {
						btn_buySheep.setEnabled(false);
					}
					if (Stats.money_count < 150) {
						btn_buyChicken.setEnabled(false);
					}
					if (Stats.money_count < 60) {
						btn_buyHay.setEnabled(false);
					}
					if (Stats.money_count < 50) {
						btn_buyFodder.setEnabled(false);
					}
					if (Stats.money_count < 30) {
						btn_buySeed.setEnabled(false);
					}
						
				}
				
			}
		});
		
		c.gridx = 2;
		c.gridy = 6;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(btn_buySeed, c);
		
		// hay label
		JLabel lbl_buySeed = new JLabel("-$30", SwingConstants.CENTER);
		c.gridx = 2;
		c.gridy = 7;
		this.add(lbl_buySeed, c);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
