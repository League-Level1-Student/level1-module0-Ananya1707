package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot robot = new Robot("mini");
	
	public void run() {
		robot.penDown();
		robot.setSpeed(100);
		robot.setX(20);
		robot.setY(550);
		house(70);
		
		

		
	}
	
	public void house(int height) {
		for(int i = 0; i < 11; i++) {
			robot.setPenColor(0, 0, 0);
			robot.move(height);
			robot.turn(90);
			robot.move(20);
			robot.turn(90);
			robot.move(height);
			robot.turn(-90);
			robot.setPenColor(0, 255, 0);
			robot.move(30);
			robot.turn(-90);
		}
	}
}
