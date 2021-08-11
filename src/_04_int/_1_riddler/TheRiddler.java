package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog("what stays in a corner but can travel all around the world");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (riddle.equals("stamp")) {
			JOptionPane.showMessageDialog(null, "Congrats! you got it right. ");
			score += 1;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "ur bad. The answer was |stamp| ");
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "you score is " + score + ".");
	}
}

