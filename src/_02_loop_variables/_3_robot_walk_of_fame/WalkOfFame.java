
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		rob.setSpeed(10);
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(25);
		
		for (int i = 0; i < 5; i++) {
			rob.penDown();
			rob.turn(144);
			rob.move(30);
		}
		
		rob.setX(100);
	
	}


}

