import java.awt.*;

public class ITSC1212Lab3 {
    public static void main(String[] args) {
        //Part A + C + D
        World w = new World(500, 500);
        Turtle tom = new Turtle(w);
        //Tom starts at the center of the world, facing up and pen down
        tom.hexagon(100);
        tom.turn(-90);
        tom.setPenColor(Color.CYAN);
        tom.hexagon(20);
        tom.turn(-90);
        tom.setPenColor(Color.PINK);
        tom.hexagon(100);
        tom.turn(-90);
        tom.setPenColor(Color.RED);
        tom.setPenWidth(16);
        tom.hexagon(50);
        //tom.forward();
        //moves tom forward 100 pixels
        //tom.turn(270);
        //tom.penUp();
        //turns tom so it faces left, then moves the pen up
        //tom.forward(50);
        //moves tom forward 50 pixels
        //tom.turn(180);
        //tom.penDown();
        //tom.forward();
        //Turns tom around so he faces right, puts the pen down, and draws
        //a line 10 pixels long

        //Part B
       // tom.penUp();
        //tom.turn(90);
        //tom.forward();
        //tom.turn(-90);
        //tom.forward(25);
        //tom.turn(-90);
        //tom.penDown();
        //tom.forward();
        //tom.turn(90);
        //tom.forward(70);
        //tom.turn(90);
        //tom.forward();
        //tom.turn(90);
        //tom.forward(70);
        //tom.turn(180);
        //tom.penUp();
        //tom.forward(95);
        //tom.penDown();
        //tom.turn(-90);
        //tom.forward();
        //tom.turn(150);
        //tom.forward(50);
        //tom.turn(-130);
        //tom.forward(50);
        //tom.turn(160);
        //tom.forward();

    }
}
