package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class doubleTestScores {
	public static void main(String[] args) {
		
	String test =	JOptionPane.showInputDialog(null, "what did you get on your test?");
	int score = Integer.parseInt(test);
	if( score >= 87){
		JOptionPane.showMessageDialog(null, "good job bro! (lucky...)");
	}
	else if( score <= 86) {
		JOptionPane.showMessageDialog(null, "hahaha, your joking right?");
	}
	}

	

	private static int parseInt(String test) {
		// TODO Auto-generated method stub
		return 0;
	}
}
