package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x =20;
    int y =20;
    int birdYVelocity=-10;
   	int gravity = 1;
   	int pipeXPosition = 800;
   	int upperPipeHeight = (int) random(100, 400);
   	int pipeGap = 40;
   	int lowerY = (int) random(100, 400);
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
    	y+=birdYVelocity;	
    	fill(0, 255, 0);
    	rect(pipeXPosition, 0, 60, upperPipeHeight);
    	birdYVelocity+=gravity;
    	pipeXPosition-=3;
  teleportPipes();
  lowerY = upperPipeHeight + pipeGap;


    }
    @Override
    public void mousePressed() {
    	 birdYVelocity= -10;
    }
   public void teleportPipes() {
	   if(pipeXPosition<-60) {
		  pipeXPosition = 800;
		upperPipeHeight = (int) random(100,400);
	 }
	   
   }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
