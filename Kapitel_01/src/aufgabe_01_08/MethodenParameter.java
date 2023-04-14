package aufgabe_01_08;
import aufgabe_01_06.Punkt;

//Wertübergabe in Methodenaufrufen (call by value/copy per value)

public class MethodenParameter {
	
	//Die Lösung im Buch 
	
	//Methodendefinitionen
	public static void methode1(int  x, int[]y) {// Die Werte der übergebenen Argumenten von Array werden
		//innerhalb und außerhalb der Methode verändert und sinchtbar.
		//// Die Werte der übergebenen Argumenten von primitiven Typen (Variable) werden nur
		//innerhalb der Methode verändert und sinchtbar.
		x = 0;
		y[1] = 0;
		System.out.println("x = " +x +" innerhalb der Methode");
	}
	public static void methode2(Punkt x, Punkt[]y) {// Die Werte der übergebenen Argumenten werden
		//innerhalb und außerhalb der Methode verändert und sinchtbar.
			x.setX(0.0);
			x.setY(0.0);
			y[1].setX(0.0);
			y[1].setY(0.0);
		}
	public static void methode3(Punkt x) {
		x = new Punkt(-1.0, -1.0);
		
		System.out.println("Das Objekt innerhalb der Methode: " +"(" + x.getX() + ", " + x.getY() + ")" );
		
	}
	
	public static void main(String[] args) {
		//Lokale primitive und Referenz-Variablen 
		int i = 1;
		int[] iarray = {1,2,3};
		
		Punkt p = new Punkt(4.0, 3.0);
		Punkt[] parray = {new Punkt(1.0,1.0), new Punkt(2.0, 2.0)};
		/*
		System.out.println("int-Variable vor dem Aufruf von " + "methode1(): "+i);
		System.out.println("int-Array vor dem Aufruf von " + "methode1(): ");
		for(int j =0; j < iarray.length; j++){
			System.out.print(iarray[j]+ " ");
		}
		
		System.out.println();
		methode1(i,iarray);
		System.out.println("int-Variable nach dem Aufruf von " + "methode1(): "+ i);
		System.out.println("int-Array nach dem Aufruf von " + "methode1(): ");
		for(int j = 0; j < iarray.length; j++){
			System.out.print(iarray[j]+ " ");
		}*/
		//Ausgabe des oberen Codes:
		/*
		 * 	int-Variable vor dem Aufruf von methode1(): 1
			int-Array vor dem Aufruf von methode1(): 
			1 2 3 
			x = 0 innerhalb der Methode
			int-Variable nach dem Aufruf von methode1(): 1
			int-Array nach dem Aufruf von methode1(): 
			1 0 3 */

	
		
		System.out.println();
		 //Referenzübergabe(call by reference) in Methodenaufrufen
		System.out.println("Die Referenzvariable vom Type Punkt zeigt" + 
		" vor dem Aufruf von methode2() auf das Objekt: ");
		
		// Die Methode anzeige() der Klasse Punkt wird aufgerufen
		p.anzeige();
		System.out.println("Punkt-Array vor dem Aufruf von " + "methode2(): ");
		
		for(int j =0; j < parray.length; j++){
			parray[j].anzeige();
		}
		methode2(p, parray);
		System.out.println("Die Referenzvariablen von Typ Punkt zeigt" +
		" nach dem Aufruf von methode2() auf das gleiche Objekte"+
				" mit abgeänderten Werten: ");
		p.anzeige();
		System.out.println("Punkt-Array nach dem Aufruf von " + "methode2(): ");
		
		for(int j =0; j < parray.length; j++){
			parray[j].anzeige();
		}
		
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Die Referenzvariable vom Typ Punkt zeigt" + 
				" vor dem Aufruf von methode3() auf das Objekt: ");
		p.anzeige();
		methode3(p);
		System.out.println("Die Referenzvariable vom Typ Punkt zeigt" + 
				" nach dem Aufruf von methode3() auf das gleiche" +
				" Objekt: ");
		p.anzeige();
		
		
		
	}
	
	
	// Meine Lösung
	/*static void methode1(int x, int[] y) {
		
		System.out.println("Das ist Parameter der Methode1: "+ x + " .");
		System.out.println("Das ist Parameter der Methode1: "+ y + " .");
		
	}
	static void methode2(Punkt x, Punkt[] y) {
		
		System.out.println("Das ist Parameter der Methode2: "+  x  + " .");
		System.out.println("Das ist Parameter der Methode2: "+ y + " .");
			
		}
	static void methode3(Punkt x) {
		
		System.out.println("Das ist Parameter der Methode3: "+ x + " .");
	}
	
	public static void main(String[] args) {
		int a = 10;
		int[] b = {1,2,3,4,5};
		 methode1(a, b);
		 System.out.println("------------------------------------------------------------");
		 
		 Punkt c = new Punkt(1,1);
		 
		 Punkt[] d = {new Punkt(1,2), new Punkt(1,3), new Punkt(1,4)};
		 
		 
		 methode2(c, d);
		 
		 System.out.println("------------------------------------------------------------");
		 Punkt e = new Punkt(1,5);
		 methode3(e);
	}*/

}

//Zusammenfassung: 
