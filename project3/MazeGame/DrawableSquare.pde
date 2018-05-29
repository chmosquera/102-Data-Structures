/**
 * DrawableSquare.java
 * CPE102-23: Class that draws Square objects in Processing Window
 * @author Chanelle Mosquera
 * @version April 29, 3016
 */

public class DrawableSquare extends Square implements Drawable {
  
    private float cnt=25;
    private float cnt2=25; 
    private float cnt3=25;
    private float cnt4=25;
    private boolean forward = true;
    private boolean forward2 = true;
    private boolean forward3 = true; 
    private boolean forward4 = true;     

   // CONSTRUCTORS
   public DrawableSquare(boolean up, boolean right, boolean down, boolean left, int row, int col) {
      super(up, right, down, left, row, col);
     
      
   }



   public void draw() {
      if (this.seen() == false) {
         noStroke();
         fill(26, 48, 58); // darkest aqua
         rect(this.x(), this.y(), Square.SQUARE_SIZE,Square.SQUARE_SIZE);       
         
      }

      if (this.inView() == true) {
         noStroke();
         fill(153, 182, 195); // aqua
         rect(this.x(), this.y(), Square.SQUARE_SIZE,Square.SQUARE_SIZE);  
         
          pushMatrix(); //**************************************
          translate(this.x(),this.y());
          pushMatrix(); //-----------------------  
          fill(250, 209, 232, cnt2);
          rect(-25+(cnt3/100),-15,15,15,20,20,5,5);
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
          fill(239, 168, 208,cnt);
          rect(0,5,10,10,20,20,10,10);
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
          fill(250, 209, 232,cnt3);
          rect(10,-7,7,7,20,20,10,10);
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
          fill(250, 209, 232,cnt4);
          rect(-15,13,5,5,20,20,10,10);
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
         
         
         if (this.wall(Square.UP)) {
           //----------------------------------------
           pushMatrix();
           translate(this.x(),this.y());
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------
           //----------------------------------------
           pushMatrix();
           translate(this.x()+15,this.y());
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------  
           //----------------------------------------
           pushMatrix();
           translate(this.x()+30,this.y());
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------           
         }
         if (this.wall(Square.RIGHT)) {  
           //----------------------------------------
           pushMatrix();
           translate(this.x()+45,this.y());
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------
           //----------------------------------------
           pushMatrix();
           translate(this.x()+45,this.y()+15);
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------     
           //----------------------------------------
           pushMatrix();
           translate(this.x()+45,this.y()+30);
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------              
         }
         if (this.wall(Square.DOWN)) { 
           //----------------------------------------
           pushMatrix();
           translate(this.x(),this.y()+45);
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------
           //----------------------------------------
           pushMatrix();
           translate(this.x()+15,this.y()+45);
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------       
           //----------------------------------------
           pushMatrix();
           translate(this.x()+30,this.y()+45);
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------              
         }
         if (this.wall(Square.LEFT)) {
           //----------------------------------------
           pushMatrix();
           translate(this.x(),this.y());
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------   
           //----------------------------------------
           pushMatrix();
           translate(this.x(),this.y()+15);
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------   
           //----------------------------------------
           pushMatrix();
           translate(this.x(),this.y()+30);
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------             
         }         
      }

      if (this.seen() == true && this.inView()==false) {
         noStroke();
         fill(71, 99, 111); // dark aqua
         rect(this.x(), this.y(), Square.SQUARE_SIZE,Square.SQUARE_SIZE);  
         
          pushMatrix(); //**************************************
          translate(this.x(),this.y());
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
         
         
         
         if (this.wall(Square.UP)) {
           //----------------------------------------
           pushMatrix();
           translate(this.x(),this.y());
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------
           //----------------------------------------
           pushMatrix();
           translate(this.x()+15,this.y());
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------  
           //----------------------------------------
           pushMatrix();
           translate(this.x()+30,this.y());
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------                     
         }
         if (this.wall(Square.RIGHT)) {
           //----------------------------------------
           pushMatrix();
           translate(this.x()+45,this.y());
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------
           //----------------------------------------
           pushMatrix();
           translate(this.x()+45,this.y()+15);
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------     
           //----------------------------------------
           pushMatrix();
           translate(this.x()+45,this.y()+30);
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------             
         }
         if (this.wall(Square.DOWN)) {
           //----------------------------------------
           pushMatrix();
           translate(this.x(),this.y()+45);
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------
           //----------------------------------------
           pushMatrix();
           translate(this.x()+15,this.y()+45);
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------       
           //----------------------------------------
           pushMatrix();
           translate(this.x()+30,this.y()+45);
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------             
         }         
         if (this.wall(Square.LEFT)) {
           //----------------------------------------
           pushMatrix();
           translate(this.x(),this.y());
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------   
           //----------------------------------------
           pushMatrix();
           translate(this.x(),this.y()+15);
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------   
           //----------------------------------------
           pushMatrix();
           translate(this.x(),this.y()+30);
           noStroke();
           fill(187, 228, 246);
           ellipse(0,0,10,10);
           stroke(0);
           fill(243, 251, 255);
           ellipse(3,-3,4,4);
           popMatrix();
           //----------------------------------------                   
         }
      }
   }

}