package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x =20;
    int y =20;
    int speed = 5;
    int birdYVelocity=-10;
   	int gravity = 1;
    @Override
    public void settings() {
    	size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	 
    }

    @Override
    public void draw() {
    	background(0, 250, 40);
    	fill(0, 0, 0);
    	stroke(0, 0, 0);
    	ellipse(x,y , 20,20);
    	y+=speed;	
    	fill(0, 255, 0);
    	rect(x, y, 40, 50);
    }
    public void mousePressed() {
    	int resetBirdYVelocity = 3;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
