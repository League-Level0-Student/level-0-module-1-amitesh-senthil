package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
				String birthday = JOptionPane.showInputDialog("Hello is your birthday today");
				// 2. If they say "yes", tell them they will rule the world.
				if (birthday.equals("yes")){
					JOptionPane.showMessageDialog(null, "Hello, and Happy Birthday ");
				}
				// 3. Otherwise, tell them to sign up for classes at The League.
				else {
					JOptionPane.showMessageDialog(null, "Hello, and Happy Unbirthday");
					
				}
	} 
}
