package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot robot = new Robot("mini");
	Random random = new Random();
	
	public void run() {
		robot.penDown();
		robot.setSpeed(100);
		robot.setX(20);
		robot.setY(550);
		for(int i = 0; i < 11; i++) {
			String sizeInput = "";
		
			int sizeNumber = random.nextInt(3);
		
			if(sizeNumber == 0) {
				sizeInput = "small" ;
			}
			if(sizeNumber == 1) {
				sizeInput = "medium" ;
			}
			if(sizeNumber == 2) {
				sizeInput = "large" ;
			}
		
			String colorInput = "";
		
			int colorNumber = random.nextInt(3);
		
			if(colorNumber == 0) {
				colorInput = "red" ;
			}
			if(colorNumber == 1) {
				colorInput = "yellow" ;
			}
			if(colorNumber == 2) {
				colorInput = "blue" ;
			}
		
			house(sizeInput, colorInput);
		}

	}
	
	public void house(String size, String color) {	
		int height = 0;
		
		if(size.equalsIgnoreCase("small")) {
			height = 60; 
		}
		if(size.equalsIgnoreCase("medium")) {
			height = 120; 
		}
		if(size.equalsIgnoreCase("large")) {
			height = 250; 
		}
			
		if(color.equalsIgnoreCase("red")) {
			robot.setPenColor(Color.red);
		}
		if(color.equalsIgnoreCase("yellow")) {
			robot.setPenColor(Color.yellow);
		}
		if(color.equalsIgnoreCase("blue")) {
			robot.setPenColor(Color.blue);
		}
		
		int roofNumber = random.nextInt(2);
		if(roofNumber == 0) {
			drawPointyRoof(height);
		}
		else {
			drawFlatRoof(height);
		}
		
	}
	
	public void drawPointyRoof(int length) {
		robot.move(length);
		robot.turn(45);
		robot.move(14);
		robot.turn(90);
		robot.move(14);
		robot.turn(45);
		robot.move(length);
		robot.turn(-90);
		robot.setPenColor(0, 255, 0);
		robot.move(30);
		robot.turn(-90);
		
	}
	
	public void drawFlatRoof(int length) {
		robot.move(length);
		robot.turn(90);
		robot.move(20);
		robot.turn(90);
		robot.move(length);
		robot.turn(-90);
		robot.setPenColor(0, 255, 0);
		robot.move(30);
		robot.turn(-90);
		
	}
}
