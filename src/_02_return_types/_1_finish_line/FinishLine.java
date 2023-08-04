package _02_return_types._1_finish_line;



import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
/*
 * HINT: We can tell what a method returns by looking at its return type
 * The return type is always to the left of the method name
 */
public class FinishLine {
	static Robot rob = new Robot("mini");
	static int totalDistance;
	
	public static void main(String[] args) {
		//1. Call the drawFinishLine() method
		drawFinishLine();
		//2. Call the crazyMove() method to move the robot
		crazyMove();
		//3. Call the getTotalDistance() and save what is returned into a variable
		int Distance = getTotalDistance();
		//4. Call the hasCrossedFinishLine() method and save what is returned into a variable
		Boolean hasFinished = hasCrossedFinishLine();
		//5. If the robot has crossed the finish line... 
			if(hasFinished) {
				
			}
			//6. Use a pop up to say the robot finished and how far it went
		// String input = JOptionPane.showInputDialog("The robot has finished and went )
		
		
		//7. Else use a pop up to say the robot did not finish and how far it went
		
	}
	
	static void crazyMove() {
		rob.setX(400);
		rob.setY(600);
		
		int numMoves = new Random().nextInt(41)+10;
		for (int i = 0; i < numMoves; i++ ) { 
			rob.setAngle(0);
			if(i%2==0) {
				rob.turn(45);
			}
			else {
				rob.turn(-45);
			}
			int dist = new Random().nextInt(31);
			rob.move(dist);
			totalDistance+=dist;
		}
	}
	
	static void drawFinishLine() {
		rob.setSpeed(100);
		rob.penDown();
		
		//Line
		for(int i =0; i <30; i++) 
			rob.setX(100);
			rob.setY(200);
			rob.turn(90);
			rob.move(1000);
			rob.setY(250);
			rob.turn(180);
			rob.move(10);
		
		
	}
	
	static int getTotalDistance() {
		return totalDistance;
	}
	
	static boolean hasCrossedFinishLine() {
		if(rob.getY() < 200) {
			return true;
		}
		return false;
		
	}
	
}
