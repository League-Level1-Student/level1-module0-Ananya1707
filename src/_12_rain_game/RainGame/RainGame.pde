int x = (int) random(600);
int y = -40;
int score = 0;

void setup(){
  size(600, 600);
}

void draw(){
  background(152,235,242);
  fill(16, 147, 232);
  stroke(16, 147, 232);
  ellipse(x, y, 35, 80);
  fill(137, 100, 32);
  rect(mouseX, 550, 80, 50);
  y+=5;
  if(y > 630){
    checkCatch(x);  
    x = (int) random(600);
    y=-40;
    ellipse(x, y, 35, 80);
  }
  
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
}
void checkCatch(int x){
  if (x > mouseX && x < mouseX+100){
    score++;
  }
  else if (score > 0){
    score--;
    println("Your score is now: " + score);
  }
}
