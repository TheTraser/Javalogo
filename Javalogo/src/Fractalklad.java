import org.javalogo.Turtle;
import org.javalogo.TurtleGraphicsWindow;

/* Wat toelichting: deze klasse heet 'Fractalklad' omdat ik met opdracht 4 met 2 klasses maakte, hierbij functioneerde deze
 * zoals de naam misschien suggereert als een soort kladblok. Hierna heb ik deze echter gebruikt om opdracht 5 te maken, 
 * dit is dan ook de functie van deze klasse. 
 */

public class Fractalklad {

	public static void main(String[] args) {
		// Creëer een venster om in te werken
		TurtleGraphicsWindow Venstertje = new TurtleGraphicsWindow(); 
		Venstertje.setTitle("Fractalklad");
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
		double hoek = 85;
		int i = 1;
		while ( i <= 4){ 
		i++;
		cesaro(piet, diepte, lengte, hoek);
		piet.left(90);

		}
	}
	// Door middel van recursie een fractal tekenen
	   public static void cesaro(Turtle piet, int diepte, double lengte, double hoek) {
	        if ( diepte == 0) {
	        	piet.forward(lengte);
	        	 }
	        else {
	                cesaro(piet, diepte - 1, lengte/(2+2*Math.cos(Math.toRadians(hoek))), hoek);
	                piet.left(hoek);
	                cesaro(piet, diepte - 1, lengte/(2+2*Math.cos(Math.toRadians(hoek))), hoek);
	                piet.right(2 * hoek);
	                cesaro(piet, diepte - 1, lengte/(2+2*Math.cos(Math.toRadians(hoek))), hoek);
	                piet.left(hoek);
	                cesaro(piet, diepte - 1, lengte/(2+2*Math.cos(Math.toRadians(hoek))), hoek);
	        }
	    } 
	} 	
