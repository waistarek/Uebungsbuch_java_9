package aufgabe_01_06;

public class Punkt {
	
	private double x;
	private double y;
	
	
	
	public Punkt(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(double newValue) {
		this.x = newValue;
		System.out.println("x-Wert gesetzt");
	}
	public double getX() {
		return x;
	}
	public void setY(double newValue) {
		this.y = newValue;
		System.out.println("y-Wert gesetzt");
	}
	public double getY() {
		return y;
	}
	
	
	
	public void anzeige() {
		System.out.println("(" + x + "," + y + ")");
	}

}

/*Zusammenfassung:
 * Das Prinzip der Datenkapslung besagt: Auf die Felder der Klasse soll nur mit Hilfe von Methoden der Klasse
 * zugegriffen werden können.
 * Diese Methoden werden Zugriffsmethoden(accessor-methodes) und auch Getter_Setter_Methoden genannt.*/ 
