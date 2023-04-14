package aufgabe_01_05;

public class QuadratDefinitionTest {
	
	public static void main(String[] args) {
		QuadratDefinition quadrat = new QuadratDefinition(7);
		
		System.out.println("Das ist das Rückgabewert von der Instanzmethode flaeche(): " + quadrat.flaeche()+ ".");
		System.out.println("Das ist das Rückgabewert von der Klassenmethode flaeche(QuadratDefinition quadrat): " + QuadratDefinition.flaeche(quadrat));
	}
	/* Zusammenfassung: Die Instanzmethode kann an einem Objekt ihrer Klasse in einer anderen Klasse aufgerufen werden.
	 * Der Klassenmethode soll der Klassenname vorangestellt werden, damit sie aufgerufen werden kann.
	 * Das Überladen von Methoden bedeutet, dass eine Klasse mehrere Methoden mit gleichen Namen aber mit verschieden Azahl von
	 *  Parametern(bei gleicher Zahl von Parameter sollen die Datentypen der Parameter unterschiedlich sein:Z.B. void a(int b){},
		void a(double b) {}) besitzen kann. */

}
