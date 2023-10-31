import processing.core.PApplet;

/**
 * Print the 8 differnt patterns in the 8 different regions in the canvas
 * @author: Preston Wong
 *
 */
public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    /*
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
*/
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */

  // prints out the white grid in quadrant 1
  public void draw_section1(){
    int intX;
    int intY;
     
    // uses for loops to print out the grid of squares 
    for(int intRow = 3; intRow < 300; intRow+= 10){
      for(int intColumn = 303; intColumn < 600; intColumn+= 10){
        intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */

  // prints out an alternating grid of white and black lines horizontally in quadrant 2
  public void draw_section2(){

    int intX;
    int intY;
    int intColour;
    
    // uses for loops to print out the grid of squares 
    for(int intRow = 303; intRow < 600; intRow+= 10){
      for(int intColumn = 303; intColumn < 600; intColumn += 10){
        intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'
        intColour = (intX / 10) % 10;

        // decides what colours goes into which square 
        if (intColour % 2 ==0) {
          fill(255);
        } else {
          fill(0);
        }
      
        noStroke();
        rect(intX, intY, 5, 5);
      }
    } 
  } 
 
  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */

  // prints out a grid of alternating white and black lines going vertically 
  public void draw_section3(){

    int intX;
    int intY;
    int intColour;
     
    // uses for loops to print out the grid of squares 
    for(int intRow = 603; intRow < 900; intRow+= 10){
      for(int intColumn = 303; intColumn < 600; intColumn += 10){
        intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'
        intColour = (intY / 10) % 10;

        // decides what colours goes into which square
        if (intColour % 2 ==0) {
          fill(0);
        } else {
          fill(255);
        }
        noStroke();
        rect(intX, intY, 5, 5);
      }
    } 
  } 

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */

  // prints out a grid of black lines with white dots in every other row and column in quadrant 4
  public void draw_section4(){

    int intX = 0;
    int intY = 0;
    int intColour1;
    int intColour2;
    
    // uses for loops to print out the grid of squares 
    for(int intRow = 903; intRow < 1200; intRow+= 10){
      for(int intColumn = 303; intColumn < 600; intColumn += 10){
        intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'
        intColour1 = (intX / 10) % 10;
        intColour2 = (intY / 10) % 10;

          // decides what colours goes into which square
          if (intColour1 % 2 ==0) {
            fill(0);
          } else if (intColour2 % 2 ==0) {
            fill(0);
          } else {
            fill(255);
          }
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  } 

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */

  // prints out a right angle tirangle in quadrant 5 that is the reflection of the triangle in qudrant 6
  public void draw_section5(){

    int intX;
    int intY;

    // uses for loops to print out triangles 
    for(int intColumn = 0; intColumn < 300 ; intColumn += 10){
      for(int intRow = 0; intRow < intColumn; intRow += 10){
        intX = 3 + intColumn;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 293 - intRow; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }
  
  // prints out a right anble triangle that is the reflection of the triangle in qudrant 5
  public void draw_section6(){

    int intX;
    int intY;

    // uses for loops to print out triangles 
    for(int intColumn = 313; intColumn < 610 ; intColumn += 10){
      for(int intRow = 303; intRow < intColumn; intRow += 10){
        intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn - 310; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }    
  }

  // prints out the triangle that is ther oppostive of the triangle in quadrant 8
  public void draw_section7(){
 
    int intX;
    int intY;

    // uses for loops to print out triangles 
    for(int intColumn = 590; intColumn < 900 ; intColumn += 10){
      for(int intRow = 590; intRow < intColumn; intRow += 10){
        intX = 13 + intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY =  893 - intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }
  
  // prints out a triangle that is the opposite of the triangle in qudrant 7
  public void draw_section8(){

    int intX;
    int intY;

    // uses for loops to print out triangles 
    for(int intRow = 893; intRow < 1200; intRow += 10){
      for(int intColumn = 893; intColumn < intRow ; intColumn += 10){
        intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn - 890; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }
}