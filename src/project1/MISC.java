package project1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * MISC Class
 * 
 * Contains
 * 
 * @author Jacqueline Molina
 */
public class MISC extends JPanel implements ActionListener {
	
	/**
	 * protected static variables needed throughout the entire project
	 */
	 
	protected static JLabel milk_error;
	protected static JLabel shear_error;
	protected static JLabel	grabEgg_error;


	protected static JLabel fodder_error;
	protected static JLabel hay_error;
	protected static JLabel seed_error;

	
	protected static JLabel cowdeath_error;
	protected static JLabel sheepdeath_error;
	protected static JLabel chickendeath_error;

	/**
	 * default constructor
	 */
	public MISC() {
		//layout
		this.setLayout(new GridBagLayout());
		this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		GridBagConstraints c = new GridBagConstraints();
		
		//TITLE
		JLabel space2 = new JLabel(" NOTES ");
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.BOTH;
		this.add(space2, c);
		
	/**
	 * ACTION ERRORS
	 */
		milk_error = new JLabel("  ");
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.BOTH;
		c.insets = (new Insets(10,0,0,150));
		this.add(milk_error, c);
		
		shear_error = new JLabel("  ");
		c.gridx = 0;
		c.gridy = 2;
		c.fill = GridBagConstraints.BOTH;
		c.insets = (new Insets(0,0,0,150));
		this.add(shear_error, c);
		
		grabEgg_error = new JLabel("  ");
		c.gridx = 0;
		c.gridy = 3;
		c.fill = GridBagConstraints.BOTH;
		c.insets = (new Insets(0,0,0,150));
		this.add(grabEgg_error, c);
		
		
	/**
	 * FOOD ERROR
	 */
		fodder_error = new JLabel("  ");
		c.gridx = 0;
		c.gridy = 4;
		c.fill = GridBagConstraints.BOTH;
		c.insets = (new Insets(5,0,0,150));
		this.add(fodder_error, c);
		
		hay_error = new JLabel("  ");
		c.gridx = 0;
		c.gridy = 5;
		c.fill = GridBagConstraints.BOTH;
		c.insets = (new Insets(0,0,0,150));
		this.add(hay_error, c);
		
		seed_error = new JLabel("  ");
		c.gridx = 0;
		c.gridy = 6;
		c.fill = GridBagConstraints.BOTH;
		c.insets = (new Insets(0,0,0,150));
		this.add(seed_error, c);
		
		
	/**
	 * DEATH MESSAGES
	 */
		cowdeath_error = new JLabel("  ");
		c.gridx = 0;
		c.gridy = 7;
		c.fill = GridBagConstraints.BOTH;
		c.insets = (new Insets(5,0,0,150));
		this.add(cowdeath_error, c);
		
		sheepdeath_error = new JLabel("  ");
		c.gridx = 0;
		c.gridy = 8;
		c.fill = GridBagConstraints.BOTH;
		c.insets = (new Insets(0,0,0,150));
		this.add(sheepdeath_error, c);
		
		chickendeath_error = new JLabel("  ");
		c.gridx = 0;
		c.gridy = 9;
		c.fill = GridBagConstraints.BOTH;
		c.insets = (new Insets(0,0,0,150));
		this.add(chickendeath_error, c);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
	}
}
