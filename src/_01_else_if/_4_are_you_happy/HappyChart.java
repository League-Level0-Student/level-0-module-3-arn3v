package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class HappyChart {

public static void main(String[] args) {
	String first = JOptionPane.showInputDialog("Are You Happy?");
	if(first.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
	}
	
	else if(first.equals("No")) {
		String second = JOptionPane.showInputDialog("Do you wanna be happy?");
		if(second.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Change Something!");
		}
		if(second.equals("No")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
		}
	}
}
}

