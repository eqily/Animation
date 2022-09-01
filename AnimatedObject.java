public class AnimatedObject {

private int x;
private int y;
private int width;
private int height;
private int theta;
private String pic;

private int vx;
private int vy;


public AnimatedObject(int x, int y, int width, int height, int theta, String pic){
  this.x = x;
  this.y = y;
  this.width = width;
  this.height = height;
  this.theta = theta;
  this.pic = pic;

  this.vx = 1;
  this.vy = 1;
}

//accessor methods
public int getX(){
  return this.x;
}

public int getY(){
  return this.y;
}

public int getWidth(){
  return this.width;
}

public int getHeight(){
  return this.height;
}

public int getTheta(){
  return this.theta;
}

public String getPic(){
  return this.pic;
}

//mutator methods
public void update(){
  this.x = this.x + this.vx;
  this.y = this.y + this.vy;
  this.theta = this.theta + 4;

  if (x < 0 || x > 670){
    this.vx = -this.vx;
  }

  if (y<0 || y > 480){
    this.vy = -this.vy;
  }
}


}//end of AnimatedObject