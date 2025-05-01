package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x =20;
    int y =20;
    int birdYVelocity=-8;
   	int gravity = 1;
   	int pipeXPosition = 800;
   	int upperPipeHeight = (int) random(100, 400);
   	int pipeGap = 80;
   	int lowerY = upperPipeHeight + pipeGap;
   	int score = 0;
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
    	 rect(pipeXPosition, lowerY, 60, HEIGHT - lowerY);
    	birdYVelocity+=gravity;
    	pipeXPosition-=10;
  teleportPipes();
intersectsPipes();
boolean intersectsPipes = intersectsPipes();
 
  rect(0,595,WIDTH, 5);
  fill(0,0,0);
  text("Score is "+ score, 30, 50);


  if(intersectsPipes == true) {
	exit();
	
}
  
    }
    @Override
    public void mousePressed() {
    	 birdYVelocity= -8;
    }
   public void teleportPipes() {
	   if(pipeXPosition<-60) {
		  pipeXPosition = 800;
		upperPipeHeight = (int) random(100,400);
		lowerY = upperPipeHeight + pipeGap;
		score++;
	 }
	   
   }
   boolean intersectsPipes() { 
       if (y < upperPipeHeight && x > pipeXPosition && x < (pipeXPosition+60)){
          return true; }
      else if (y>lowerY && x > pipeXPosition && x < (pipeXPosition+60)) {
          return true; }
      else if(y>HEIGHT) {
    	  return(true);
      }
      else { return false; }
   }


    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
