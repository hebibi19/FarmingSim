package project1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Market Class
 * 
 * Class Contains three buttons
 * 	- sellMilk button
 * 	- sellWool button
 * 	- sellEggs button
 * 
 * @author Jacqueline Molina
 */
public class Market extends JPanel implements ActionListener {
	
	/**
	 * protected static variables needed throughout the entire project
	 */
	
	protected static JButton btn_sellMilk;
	protected static JButton btn_sellWool;
	protected static JButton btn_sellEggs;

	/**
	 * default constructor
	 */
	public Market() {
		
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		GridBagConstraints c = new GridBagConstraints();
		
		/**
		 * SELL MILK
		 */
		btn_sellMilk = new JButton("sell (1) milk");
		
		// automatically disabled (because you don't have any milk to start with)
		btn_sellMilk.setEnabled(false);

		//event handler
		btn_sellMilk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// If milk is at least 1
				if (Stats.milk_count > 0) {
					// subtract 1 and add 15 to money
					Stats.milk_count -= 1;
					Stats.milk.setText("Total Milk: " + Stats.milk_count);
					
					Stats.money_count += 15;
					Stats.money.setText("Total Money: " + Stats.money_count);
				}
				// if milk count is less than or equal to 0
				if (Stats.milk_count <= 0) {
					// disable button
					btn_sellMilk.setEnabled(false);
				}
				
				// If money generated is enough for these amounts, enable buttons
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
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(btn_sellMilk, c);
		
		// sell milk label
		JLabel lbl_sellMilk = new JLabel("+$15 per milk", SwingConstants.CENTER);
		c.gridx = 1;
		c.gridy = 1;
		this.add(lbl_sellMilk, c);
		
		
		// EMTPY SPACE
		JLabel space1 = new JLabel(" ");
		c.gridx = 1;
		c.gridy = 2;
		this.add(space1, c);
		// EMTPY SPACE
		
		
		/**
		 * SELL WOOL
		 */
		btn_sellWool = new JButton("sell (1) wool");
		
		// automatically disabled
		btn_sellWool.setEnabled(false);

		// event handler
		btn_sellWool.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// if wool count is at least 1
				if (Stats.wool_count > 0) {
					Stats.wool_count -= 1;
					Stats.wool.setText("Total Wool: " + Stats.wool_count);
					
					Stats.money_count += 20;
					Stats.money.setText("Total Money: " + Stats.money_count);
				}
				
				// if wool count is 0
				if (Stats.wool_count <= 0) {
					btn_sellWool.setEnabled(false);
				}
				
				// If money generated is enough for these amounts, enable buttons
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
		c.gridy = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(btn_sellWool, c);
		
		// sell wool label
		JLabel lbl_sellWool = new JLabel("+$20 per wool", SwingConstants.CENTER);
		c.gridx = 1;
		c.gridy = 4;
		this.add(lbl_sellWool, c);
		
		// EMTPY SPACE
		JLabel space2 = new JLabel(" ");
		c.gridx = 1;
		c.gridy = 5;
		this.add(space2, c);
		// EMTPY SPACE
		
		
		/**
		 * SELL EGGS
		 */
		btn_sellEggs = new JButton("sell (12) Eggs");
		
		// automatically disabled (because you dont have any eggs)
		btn_sellEggs.setEnabled(false);

		// event handler
		btn_sellEggs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// if egg count is greater than or equal to 12
				if (Stats.egg_count >= 12) {
					//'sell' eggs and add 45 to money
					Stats.egg_count -= 12;
					Stats.eggs.setText("Total Eggs: " + Stats.egg_count);
					
					Stats.money_count += 45;
					Stats.money.setText("Total Money: " + Stats.money_count);
				}
				// if egg count is less than 12
				if (Stats.egg_count < 12) {
					// disable option to sell eggs
					btn_sellEggs.setEnabled(false);
				}
				
				// If money generated is enough for these amounts, enable buttons
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
		c.gridy = 6;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		this.add(btn_sellEggs, c);
		
		// sell eggs label
		JLabel lbl_sellEggs = new JLabel("+$45 per dozen", SwingConstants.CENTER);
		c.gridx = 1;
		c.gridy = 7;
		this.add(lbl_sellEggs, c);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
	}

}
