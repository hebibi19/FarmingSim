package project1;

import java.awt.*;
import javax.swing.*;

/**
 * STATS CLASS
 * 
 * contains all of the counts for the statistics
 * + contains all of the Labels for the leftmost panel
 * 
 * @author Jacqueline Molina
 */
public class Stats extends JPanel {
// INTEGERS
	protected static int money_count = 500;
	protected static int day_count = 1;
	// animal counts
	protected static int cattle_count = 1;
	protected static int sheep_count = 0;
	protected static int chicken_count = 0;
	// animal products count
	protected static int milk_count = 0;
	protected static int wool_count = 0;
	protected static int egg_count = 0;
	// animal food count
	protected static int fodder_count = 10;
	protected static int hay_count = 0;
	protected static int seed_count = 0;
	
// LABELS
	protected static JLabel money;
	protected static JLabel day;
	// animals
	protected static JLabel cattle;
	protected static JLabel sheep;
	protected static JLabel chicken;
	// animal products
	protected static JLabel milk;
	protected static JLabel wool;
	protected static JLabel eggs;
	// animal food
	protected static JLabel fodder;
	protected static JLabel hay;
	protected static JLabel seed;

	
	/**
	 * Default Constructor
	 */
	public Stats() {
		// Layout
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		GridBagConstraints c = new GridBagConstraints();
		
		JLabel l1 = new JLabel("Welcome!");
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.BOTH;
		this.add(l1, c);
		
	/** 
	 * BASIC TWO
	 */
		day = new JLabel("DAY NUMBER: " + day_count);
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.BOTH;
		this.add(day, c);
		
		//SPACE
		JLabel space1 = new JLabel(" ");
		c.gridx = 0;
		c.gridy = 2;
		c.fill = GridBagConstraints.BOTH;
		this.add(space1, c);
		//SPACE
		
		money = new JLabel("Total Money: " + money_count);
		c.gridx = 0;
		c.gridy = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(money, c);
		
		//SPACE
		JLabel space2 = new JLabel(" ");
		c.gridx = 0;
		c.gridy = 4;
		c.fill = GridBagConstraints.BOTH;
		this.add(space2, c);
		//SPACE

	/**
	 * ANIMALS
	 */
		cattle = new JLabel("Total Cattle: " + cattle_count);
		c.gridx = 0;
		c.gridy = 5;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(cattle, c);
		
		sheep = new JLabel("Total Sheep: " + sheep_count);
		c.gridx = 0;
		c.gridy = 6;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(sheep, c);
		
		chicken = new JLabel("Total Chicken: " + chicken_count);
		c.gridx = 0;
		c.gridy = 7;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(chicken, c);
		
		//SPACE
		JLabel space3 = new JLabel(" ");
		c.gridx = 0;
		c.gridy = 8;
		c.fill = GridBagConstraints.BOTH;
		this.add(space3, c);
		//SPACE
		
	/**
	 *  ANIMAL PRODUCTS
	 */
		
		milk = new JLabel("Total Milk: " + milk_count);
		c.gridx = 0;
		c.gridy = 9;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(milk, c);
		
		wool = new JLabel("Total Wool: " + wool_count);
		c.gridx = 0;
		c.gridy = 10;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(wool, c);
		
		eggs = new JLabel("Total Eggs: " + egg_count);
		c.gridx = 0;
		c.gridy = 11;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(eggs, c);
		
		//SPACE
		JLabel space4 = new JLabel(" ");
		c.gridx = 0;
		c.gridy = 12;
		c.fill = GridBagConstraints.BOTH;
		this.add(space4, c);
		//SPACE
		
	/** 
	 * ANIMAL FOOD
	 */
		
		fodder = new JLabel("Total Fodder: " + fodder_count + " (-" + (cattle_count * 2) + "/day)");
		c.gridx = 0;
		c.gridy = 13;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(fodder, c);
		
		hay = new JLabel("Total Hay: " + hay_count);
		c.gridx = 0;
		c.gridy = 14;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(hay, c);
		
		seed = new JLabel("Total Seed: " + seed_count);
		c.gridx = 0;
		c.gridy = 15;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(seed, c);
		
		//SPACE
		JLabel space5 = new JLabel(" ");
		c.gridx = 0;
		c.gridy = 16;
		c.fill = GridBagConstraints.BOTH;
		this.add(space5, c);
		//SPACE
		

	}

}
