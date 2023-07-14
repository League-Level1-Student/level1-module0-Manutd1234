package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int HEIGHT = 600;
	static final int WIDTH = 800;
	int x = 100;
	int y = 100;
	int birdVelocity = -10;
	int gravity = 1; 
	int pipeGap = 20;
	int lowerY = 10;
	
		@Override
    public void settings() {
    	size(WIDTH,HEIGHT);  
    }

    @Override
    public void setup() {
        
    }

    @Override
    public void draw() {
    	background(185, 220, 238);
    	fill(185, 220, 238);
    	noStroke();
    	ellipse( x,y , WIDTH, HEIGHT);
    	fill(185,220,238);
    	rect(x, y, width, height);

    	
    }
    @Override
    public void mousePressed() {
    	int upperPipeHeight = (int) random(100, 400);
    	lowerY = upperPipeHeight + pipeGap;
    
    }
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
