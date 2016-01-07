import org.javalogo.*;
import java.awt.Color; 

public class VeelVeelhoeken {
	
	public static void main(String args[])  {
		
	// Creëer een venster om in te werken
	TurtleGraphicsWindow Venstertje = new TurtleGraphicsWindow(); 
	Venstertje.setTitle("Veelveelhoeken");
	Venstertje.setVisible(true);
	
	// Creëer een turtle om mee te tekenen
	Turtle piet = new Turtle("piet"); 
	
	// Voeg turtle aan venster toe
	Venstertje.add(piet);
	
	// Geef turtle een kleur voor stylistische redenen 
	piet.setPenColor(Color.magenta);
	piet.setBodyColor(Color.magenta);
	
	// Declareer variabele om hoek & lengte berekenen
	int n = 12;  
	
	// Roep veelhoek functie aan
	veelhoek(piet, n); 
	
		
}
	// Laat de turtle een bloem van veelhoeken creëen
	public static void veelhoek(Turtle piet, int n) {
		int i = 1;
		while ( i <=240) { 
		i++;
		piet.left(360/n);
		piet.forward(400/n);
		
		if ( i % 12 == 0)
			piet.left(18);
		} 
	}
}
	
