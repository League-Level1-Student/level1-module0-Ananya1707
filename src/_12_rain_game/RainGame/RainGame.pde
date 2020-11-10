int y = -40;
void setup(){
  size(600, 600);
}

void draw(){
  background(152,235,242);
  fill(16, 147, 232);
  stroke(16, 147, 232);
  ellipse(200, y, 35, 80);
  y++;
  if(y==630){
    y = -40;
    ellipse(400, y, 35, 80);
  }
}
