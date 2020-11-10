PImage pictureOfRecord;
int r = 1;

void setup() {
  size(600,600);
  pictureOfRecord = loadImage("record.jpeg");
  pictureOfRecord.resize(600,600);
  
}

void draw(){
  if(mousePressed){
  rotateImage(pictureOfRecord,r); 
  }
  image(pictureOfRecord, 0, 0);
  r++;

  
}

void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
    }
