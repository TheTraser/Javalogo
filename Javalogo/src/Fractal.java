import org.javalogo.Turtle;
import org.javalogo.TurtleGraphicsWindow;

public class Fractal {

	public static void main(String[] args) {
		
		// Creëer een  venster om in te werken
		TurtleGraphicsWindow Venstertje = new TurtleGraphicsWindow(); 
		Venstertje.setTitle("Fractal");
		Venstertje.setVisible(true);
		
		// Creëer een turtle om mee te tekenen
		Turtle piet = new Turtle("piet"); 
		
		// Voeg turtle aan venster toe
		Venstertje.add(piet);
		
		// Fractal in het venster centeren
		piet.penUp();
        piet.right(120);
        piet.forward(360 * Math.sqrt(3)/3); 
        piet.left(120);
        piet.backward(90);
        piet.penDown();
		
		
		// Hier wordt de recursieve functie aangeroepen
		double lengte = 400;
		int diepte = 5; 
		int i = 1;
		while ( i <= 4 ) {
		i++;
		cesaro(piet, diepte, lengte);
		piet.left(90);
		
		}
	}
		// Door middel van recursie een fractal tekenen
	   public static void cesaro(Turtle piet, int diepte, double lengte) {
	        if ( diepte == 0) {
	        	piet.forward(lengte);
	        	 }
	        else {
	                cesaro(piet, diepte - 1, lengte/3);
	                piet.left(60);
	                cesaro(piet, diepte - 1, lengte/3);
	                piet.right(120);
	                cesaro(piet, diepte - 1, lengte/3);
	                piet.left(60);
	                cesaro(piet, diepte - 1, lengte/3);
	        }
	    } 
	} 	