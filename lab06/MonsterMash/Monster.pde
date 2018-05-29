import java.util.Random;

public class Monster {
  
    // Instance Variables
    public PVector direction;
    public double x;
    public double y;
    private float cnt=25;
    private float cnt2=25; 
    private float cnt3=25;
    private float cnt4=25;
    private boolean forward = true;
    private boolean forward2 = true;
    private boolean forward3 = true; 
    private boolean forward4 = true;
    private Random rand = new Random();
    private int trans;
    
    // Constructor
   public Monster(double x, double y) {
      this.x = x;
      this.y = y;
      direction = new PVector(0, 0);
   }
   
   public void draw() {

     pushMatrix();
     
 /*        // trans = rand.nextInt(5);
          trans +=1;
          if (trans ==width)
             trans = 0;
 */    translate((int)x+trans, (int)y);
    
     
    pushMatrix(); //**************************************
    scale(-1,1);
    noStroke();
    pushMatrix(); //-----------------------  
    fill(226, 244, 253,cnt2);
    ellipse(-25+(cnt3/100),-15,10,10);
    if (forward2 == true)
       cnt2 += 1;   
    if (forward2 == false)
       cnt2 -= 1;
    
    if (cnt2> 200) {
      cnt2 = 200;
      forward2 = false;
    }
    if (cnt2 < 25) {
      cnt2 = 25;
      forward2 = true;
    }
    popMatrix(); //------------------------ 
    pushMatrix(); //-----------------------
    fill(55, 135, 174,cnt);
    ellipse(10,15,5,5);
    if (forward == true)
       cnt += .5;   
    if (forward == false)
       cnt -= .5;
    
    if (cnt> 200) {
      cnt = 200;
      forward = false;
    }
    if (cnt < 25) {
      cnt = 25;
      forward = true;
    }
    popMatrix(); //------------------------ 
    pushMatrix(); //-----------------------
    fill(173, 219, 242,cnt3);
    ellipse(10,-7,10,10);
    if (forward3 == true)
       cnt3 += .3;   
    if (forward3 == false)
       cnt3 -= .3;
    
    if (cnt3> 200) {
      cnt3 = 200;
      forward3 = false;
    }
    if (cnt3 < 25) {
      cnt3 = 25;
      forward3 = true;
    }
    popMatrix(); //------------------------------ 
    pushMatrix(); //-----------------------
    fill(173, 219, 242,cnt4);
    ellipse(-15,13,7,7);
    if (forward4 == true)
       cnt4 += .7;   
    if (forward4 == false)
       cnt4 -= .7;
    
    if (cnt4> 200) {
      cnt4 = 200;
      forward4 = false;
    }
    if (cnt4 < 25) {
      cnt4 = 25;
      forward4 = true;
    }
    popMatrix(); //------------------------------     
    popMatrix(); //**************************************    
     
     popMatrix();

 }
   
   public double getX() {return x;}
   
   public double getY() {return y;}
   
   public void move() {
     // double x = direction.x;
      //double y = direction.y;
      //this.x += x;
     // this.y += y;
     x += direction.x;
     y += direction.y;
   }
   
   public void setVector(PVector direction) {
      this.direction = direction;
   }
 
}