package project1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Barn Class
 * 
 * Contains milking button, shearing button, egg button
 * 
 * These allow the user to milk their cows (x2), shear their sheep (x1), and
 * pick up the eggs from their chickens (x1)
 * 
 * @author Jacqueline Molina
 */
public class Barn extends JPanel implements ActionListener {
	
	/**
	 * protected static variables needed throughout the entire project
	 */
	
	protected static int milking_count = 2;
	protected static JButton btn_milk;
	
	protected static int shear_count = 1;
	protected static JButton btn_shear;
	
	protected static int grabEgg_count = 1;
	protected static JButton btn_grabEgg;

	/**
	 * default constructor
	 */
	public Barn() {
		//panel layout
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		GridBagConstraints c = new GridBagConstraints();
		
		/**
		 * MILK COW BUTTON 
		 * 
		 * cows can be milked x2; each action adds 1 milk jug to inventory
		 */
		btn_milk = new JButton("milk cows (" + milking_count + ")");
		// button listener
		btn_milk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// subtract 1 from milking count
				milking_count--;
				// add milk to the milk count (proportional to the number of cows)
				Stats.milk_count += Stats.cattle_count;
				
				// option to sell milk is open
				Market.btn_sellMilk.setEnabled(true);
				
				// update labels
				Stats.milk.setText("Total Milk: " + Stats.milk_count);
				btn_milk.setText("milk cows (" + milking_count + ")");

				// if milking count is less than or equal to 0
				if (milking_count <= 0) {
					// change labels
					MISC.milk_error.setText("no more milk");
					btn_milk.setText("milk cows (" + milking_count + ")");
					// disable ability to milk cows
					btn_milk.setEnabled(false);
				}
			}
		});
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(btn_milk, c);
		
		/**
		 * milking label
		 */
		JLabel lbl_milk = new JLabel("+1 milk jug per cow", SwingConstants.CENTER);
		c.gridx = 0;
		c.gridy = 1;
		this.add(lbl_milk, c);
		
		// EMPTY SPACE
		JLabel space1 = new JLabel("");
		c.gridx = 0;
		c.gridy = 2;
		c.ipady = 15;
		this.add(space1, c);
		// EMPTY SPACE
		
		/**
		 * SHEAR SHEEP BUTTON 
		 * 
		 * sheep can be sheared x1; each action adds 1 wool to inventory
		 */
		btn_shear = new JButton("shear sheep (" + shear_count + ")");
		// shearing option is initially disabled
		btn_shear.setEnabled(false);

		// action listener
		btn_shear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// subtract 1 from shear count
				shear_count--;
				// add wool to wool count proportional to number of sheep
				Stats.wool_count += Stats.sheep_count;
				
				// enable ability to sell wool
				Market.btn_sellWool.setEnabled(true);
				
				// change labels
				Stats.wool.setText("Total Wool: " + Stats.wool_count);
				btn_shear.setText("shear sheep (" + shear_count + ")");

				// if shear count is less than or equal to 0
				if (shear_count <= 0) {
					// change labels
					MISC.shear_error.setText("no more wool");
					btn_shear.setText("shear sheep (" + shear_count + ")");
					// disable ability to shear sheep
					btn_shear.setEnabled(false);
				}
			}
		});
		c.gridx = 0;
		c.gridy = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(btn_shear, c);
		
		/**
		 * milk jug label
		 */
		JLabel lbl_shear = new JLabel("+1 wool per sheep", SwingConstants.CENTER);
		c.gridx = 0;
		c.gridy = 4;
		this.add(lbl_shear, c);
		
		// EMPTY SPACE
		JLabel space2 = new JLabel("");
		c.gridx = 0;
		c.gridy = 5;
		c.ipady = 15;
		this.add(space2, c);
		// EMPTY SPACE
		
		/**
		 * GRAB EGGS BUTTON 
		 * 
		 * eggs can be grabbed x1 per day; each action adds 1 egg to inventory
		 */
		btn_grabEgg = new JButton("grab eggs (" + grabEgg_count + ")");
		// grabbing egg option is initially disabled
		btn_grabEgg.setEnabled(false);

		// action listener
		btn_grabEgg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// subtract 1 from grab egg count
				grabEgg_count--;
				// add eggs to egg count proportional to number of chickens
				Stats.egg_count += Stats.chicken_count;
				
				// enable ability to sell eggs
				if (Stats.egg_count >= 12) {
					Market.btn_sellEggs.setEnabled(true);
				}
				
				// change labels
				Stats.eggs.setText("Total Eggs: " + Stats.egg_count);
				btn_grabEgg.setText("grab eggs (" + grabEgg_count + ")");

				// if grab egg count is less than or equal to 0
				if (grabEgg_count <= 0) {
					// change labels
					MISC.grabEgg_error.setText("no more wool");
					btn_grabEgg.setText("grab eggs (" + grabEgg_count + ")");
					// disable ability to grab eggs sheep
					btn_grabEgg.setEnabled(false);
				}
			}
		});
		c.gridx = 0;
		c.gridy = 6;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(btn_grabEgg, c);
		
		/**
		 * grab eggs label
		 */
		JLabel lbl_grabEgg = new JLabel("+1 egg per chicken", SwingConstants.CENTER);
		c.gridx = 0;
		c.gridy = 7;
		this.add(lbl_grabEgg, c);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
	}

}
