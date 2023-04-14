package aufgabe_01_07;



public class Vektor {

	private int x,y,z;
	public Vektor() {
		this(0,0,0);
		/*x = 0;
		y = 0;
		z = 0;*/
		
	}
	public Vektor(int x,int y, int z) {
		
		
		this.x =x;
		this.y = y;
		this.z = z;
		
	}
	// Copy-Konstruktor
	public Vektor(Vektor v) {
		
		x = v.x;
		y = v.y;
		z = v.z;
		
	}
	
	void vektorAnzeige() {
		System.out.println("Vektor(" + x + "," + y + "," + z +")." );
	}
	
	public Vektor vektorErzeuge(int X, int Y, int Z) {
		
		// Diese Methode verändert die Werte der Instanz, an der sie aufgerufen wird.
		/*Vektor v = new Vektor(x+X,y+Y,z+Z);
		return v;*/
		this.x = this.x + X;
		this.y = this.y + Y;
		this.z = this.z + Z;
		return this;
		
		
		
	}
	
	Vektor vektorErzeuge(Vektor v) {
		// Diese Methode verändert die Werte der Instanz, an der sie aufgerufen wird.
		/*Vektor newV = new Vektor(x + v.x,y + v.y, z + v.z);
		return newV;*/
		this.x = this.x + v.x;
		this.y = this.y + v.y;
		this.z = this.z + v.z;
		return this;
		
	}
	Vektor vektorErzeugeOhneVeraenderung(int a,int b, int c) {
		/*Diese Methode macht zuerst eine Kopie von der Instanz und gebt eine neu Instanz zurück, ohne dass
		sie die Werte des Objekts, an dem sie aufgerufen wird, verändert.*/
		Vektor copyvektor = new Vektor(this);
		copyvektor.x = copyvektor.x +a;
		copyvektor.y = copyvektor.y +b;
		copyvektor.z = copyvektor.z +c;
		return copyvektor;
	}
	
	public String toString() {
		return "("+ x + "," + y + "," + z+ ")";
	}
	
	
}
/* Zusammenfassung: this ist nur ein Platzhalter für den Objektnamen einer Klasse und wird immer nach dem 
 * Aufruf mit dem Objektnamen ersetzt.
 * Ein Konstruktor kann nur mit this(parameterliste) innerhalb eines anderen Konstrukturs aufgerufen werden.
 * Man kann einen Konstruktor innerhalb einer anderen Klasse oder einer Methode mit dem Schlüsselwort new aufrufen.*/
