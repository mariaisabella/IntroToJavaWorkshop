package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot dabBot=new Robot();
	
dabBot.moveTo(300, 400);
dabBot.setWindowColor(164,249,232);
dabBot.setPenColor(Color.white);
dabBot.penDown();
for (int i = 0; i < 4; i++) {
	dabBot.move(200);
	dabBot.turn(90);
}
for (int i = 0; i < 4; i++) {
	dabBot.move(100)
	dabBot.turn(90)
}
	}
}
