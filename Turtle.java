/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////


  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.forward();
  }
  public void hexagon() {
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    }
    public void hexagon(int distance) {
      this.forward(distance);
      this.turn(60);
      this.forward(distance);
      this.turn(60);
      this.forward(distance);
      this.turn(60);
      this.forward(distance);
      this.turn(60);
      this.forward(distance);
      this.turn(60);
      this.forward(distance);
      this.turn(60);
      }

      public void drawSquare() {

        for (int i = 0; i < 4; i++) {
          this.turn(90);
          this.forward(75);
        }
        this.penUp();
    }
} // this } is the end of class Turtle, put all new methods before this