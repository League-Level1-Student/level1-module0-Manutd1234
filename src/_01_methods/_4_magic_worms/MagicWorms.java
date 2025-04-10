package _01_methods._4_magic_worms;

import java.awt.Color;
import java.util.Random;

import processing.core.PApplet;

/*
 * Goal: Create a program that draws a magical pattern using worms!
 * 
 * In the setup() method:
 * 1. Set a background color using the background() method
 * 
 * In the draw() method:
 * 2. Use a for loop to draw 300 small ellipses in a diagonal line across
 *    the canvas. Make them a bright color.
 * 
 * 3. Run the program and check the recipe for the expected outcome.
 * 
 * 4. Now make each ellipse use random values for their x and y coordinates.
 *    Make sure they are inside the canvas.
 *    Hint: random(int maxValue)
 * 
 * 5. Run the program and check the recipe for the expected outcome.
 * 
 * 6. Now use the getWormX() and getWormY() methods for x and y coordinates of
 *    each ellipse. Use the for loop variable as the parameter to these methods.
 * 
 * 7. Run the program and check the recipe for the expected outcome.
 * 
 * 8. Call makeMagical() in your draw method before the for loop.
 *    EXTRA: Pass in frameCount or another variable for the ellipse
 *    "red value", and i as the "green value" for some extra color coolness.
 */
public class MagicWorms extends PApplet {
	static final int WIDTH = 1920;
	static final int HEIGHT = 900;
	int[] colors = new int[1000];
	
	
	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		background(0, 0, 0);
		for(int i = 0 ; i < colors.length; i++) {
			colors[i] = new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)).getRGB();
			
		}
	
	}

	@Override
	public void draw() {
		//background(0,0,0);
		makeMagical();
		fill(100,100,255);
		for (int i = 0; i < colors.length; i++) {
			
			fill ( colors[i]   );
			ellipse(getWormX(i) ,getWormY(i) , 30, 20);
		}

	}

	static public void main(String[] args) {
		PApplet.main(MagicWorms.class.getName());
	}

	/*********************** DO NOT MODIFY THE CODE BELOW ********************/
	float frequency = 0.001f;
	float noiseInterval = (float) (3.0*PI/23.0);

	void makeMagical() {
		fill(0, 0, 0, 10);
		rect(0, 0, width, height);
		noStroke();
	}

	float getWormX(int i) {
		return map(noise(i * noiseInterval + frameCount * frequency), 0, 1, 0, WIDTH);
	}

	float getWormY(int i) {
		return map(noise(i * noiseInterval + 1 + frameCount * frequency), 0, 1, 0, HEIGHT);
	}
}
