package aufgabe_01_05;

public class QuadratDefinition {
	
	//a gibt die Seitenlänge des Quadrats an
	int a;
	
	public QuadratDefinition(int a) {
		this.a = a;
	}
	public int flaeche() {
		int f = a*a;
		return f;
	}
	
	public static int flaeche(QuadratDefinition quadrat) {
		return quadrat.a * quadrat.a;
		
	}
	

}
