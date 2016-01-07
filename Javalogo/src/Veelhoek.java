import org.javalogo.*;
import java.awt.Color; 

public class Veelhoek {
	
	public static void main(String args[])  {
		
	// Creëer een window om in te werken
	TurtleGraphicsWindow Venstertje = new TurtleGraphicsWindow(); 
	Venstertje.setTitle("Veelhoek");
	Venstertje.setVisible(true);
	
	// Creeër een turtle om mee te tekenen
	Turtle piet = new Turtle("piet"); 
	
	// Voeg turtle aan venster toe
	Venstertje.add(piet);
	
	// Geef turtle een kleurtje voor stylistische redenen 
	piet.setPenColor(Color.magenta);
	piet.setBodyColor(Color.magenta);
	
	// Laat turtle een veelhoek tekenen
	int j = 12;
	int i = 1; 
	while ( i <=j) { 
	i++;
	piet.left(360/j);
	piet.forward(40);
		}
	}
}
