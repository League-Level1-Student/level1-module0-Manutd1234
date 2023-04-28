package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int HEIGHT = 600;
	static final int WIDTH = 800;

    @Override
    public void settings() {
    	size(WIDTH,HEIGHT);  
    }

    @Override
    public void setup() {
        
    }

    @Override
    public void draw() {
    	background(0, 0, 50);
    	fill(0, 0, 50);
    	stroke(0, 0, 10);
    	ellipse(100 , 100, WIDTH, HEIGHT);
    	int birdVelocity = -10;
    	int gravity = 1;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
