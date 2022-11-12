
void setup() {
 
  // set the size of your sketch
  size(1000,1000);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  fill(0,0,255);
  ellipse(500, 500, 200, 200);
  fill(255,0,0);
  ellipse(500, 500, 150, 150);
  fill(0,255,0);
  ellipse(500,500,100,100);
  fill(255,0,255);
  ellipse(500,500,50,50);
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
