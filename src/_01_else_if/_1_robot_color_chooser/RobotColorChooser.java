
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		
Robot rob = new Robot();

while(true) { String penColor = JOptionPane.showInputDialog(null, "Choose a color for the pen");

if(penColor.equals("exit")) {
	System.exit(0);;
}

if (penColor.equals("blue")) {
	rob.setPenColor(Color.blue);
} else if (penColor.equals("red")) {
	rob.setPenColor(Color.red);
} else if (penColor.equals("green")) {
	rob.setPenColor(Color.green);
} else {
	rob.setRandomPenColor();
}
rob.penDown();
rob.setSpeed(1000);

for (int i = 0; i < 5; i++) { 
	rob.move(100);
	rob.turn(90);
}
rob.setPenWidth(10);








	
}}}
