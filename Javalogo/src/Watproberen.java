import org.javalogo.*;

public class Watproberen {
    
    public static void main(String[] args) {
        //Create a window to draw in
        TurtleGraphicsWindow myTurtleGraphicsWindow = new TurtleGraphicsWindow();
        
        //Set the windows title
        myTurtleGraphicsWindow.setTitle("Betere Koch");
        
        //Display the window
        myTurtleGraphicsWindow.setVisible(true);
        
        //Create a turtle, name him after the guy who came up with this shape
        Turtle koch = new Turtle("Koch");
        
        //Put koch in our window
        myTurtleGraphicsWindow.add(koch);
        
        //Move koch so that the snowflake is centered in the window.
       	koch.penUp();
        koch.left(120);
        koch.forward(360 * Math.sqrt(3)/3);  //radius of an equilateral triangle with side = 360
        koch.right(120);
        koch.penDown();
        koch.right(30); 
        
        //Instruct koch to draw a snowflake
        //A Koch snowflake is actually three Koch Curves joined together in the shape of a triangle
        for (int i = 1; i <= 3; i++) {
            //Instruct koch to draw a 4th order Koch Curve with length of 360 pixels
            kochCurve(koch, 4, 360);
            koch.right(120);
        }
        //go back to home position
        koch.penUp();
        koch.home();
        koch.penDown();
    }
    
    /**
     * A method to encapsulate the set of instructions that draws a Koch Curve.  
     * Astute observers will notice that this method uses recursion to draw the curve.
     */
   public static void kochCurve(Turtle turtle, int order, double length) {
        switch(order) {
            //base case
            case 0:
                turtle.forward(length);
                break;
            default:
                kochCurve(turtle, order - 1, length/3);
                turtle.rotateDegrees(60);
                kochCurve(turtle, order - 1, length/3);
                turtle.rotateDegrees(-120);
                kochCurve(turtle, order - 1, length/3);
                turtle.rotateDegrees(60);
                kochCurve(turtle, order - 1, length/3);
                break;
        }
    } 
    
}
