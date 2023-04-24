package Aufgabe_01_01;

public class GenericTyp1<T> {
	private T object;
	
	//Zugriffsmethoden auf das Objekt
	
	public void setObjekt(T t) {
		this.object = t;
	}
	public T getObjekt() {
		return object;
	}
	
	//Typ des Objects
	public String getObjektTyp() {
		return object.getClass().getName();
	}

	//Objeke der Klasse erzeugen
	public static void main(String[] args) {
		/*Es werden GenericTyp1<Integer>- und GenericTyp1<String-Objekte erzeugt und ihre Referenzen
		Variablen vom gleichen Typ zugewiesen*/
		
		
		
		GenericTyp1<Integer> iObjekt = new GenericTyp1<Integer>();
		GenericTyp1<String> sObjekt = new GenericTyp1<String>();
		
		/*Korrekte Zuweisungen von Werten*/
		iObjekt.setObjekt(new Integer(10));
		sObjekt.setObjekt(new String("Java"));
		
		/*Fehlerhafte Zuweisungen, erzeigen Compilerfehler
		 * sObjekt.setObjekt((new Integer(10));
		 * iObjekt.setObjekt((new String("Java"));*/
		
		// Die Werte (auch Objekte) der erzeugten Instanzen der Klasse ermitteln und anzeigen
		System.out.println("IObjektwert = " + iObjekt. getObjekt() + " * sObjektWert = "
				+ sObjekt.getObjekt());
		// Die Datentyp dieser Objekte anzeigen
		System.out.println("iObjektTyp = " + iObjekt.getObjektTyp() + 
				" * sObjektTyp = " + sObjekt.getObjektTyp());
	}

}
