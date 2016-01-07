import org.javalogo.*;
import java.awt.Color; 

public class Javalogo {
	
	public static void main(String args[])  {
		
	// Creëer een window om in te werken
	TurtleGraphicsWindow Venstertje = new TurtleGraphicsWindow(); 
	Venstertje.setTitle("JavaLogo"); 
	Venstertje.setVisible(true);
	
	// Creeër een turtle om mee te tekenen
	Turtle piet = new Turtle("piet"); 
	
	// Voeg turtle aan venster toe 
	Venstertje.add(piet);
	
	// Geef turtle een kleur voor stylistische redenen 
	piet.setPenColor(Color.MAGENTA);
	piet.setBodyColor(Color.MAGENTA);
	
	// Laat turtle een spiraal tekenen
	int l = 10; 
	int i = 1; 
	while ( i <= 120 ) { 
	i++;
	piet.forward(l); 
	piet.left(90);
	l = l + 4; 
		}  
	}
}
