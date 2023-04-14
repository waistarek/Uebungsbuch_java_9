package aufgabe_01_03;

public class FeldZugriffe {
	
	static int zaehlerAlsKlassenfeld;
	int zaehlerAlsInstanzfeld;
	
	public FeldZugriffe() {
		zaehlerAlsKlassenfeld++;
		zaehlerAlsInstanzfeld++;
	}
	
	
	
	void anzeigeInstMeth() {
		System.out.println("Das ist ein Instanzfeld: " + zaehlerAlsInstanzfeld);
		
		
		System.out.println("Das ist ein Klassenfeld: " + zaehlerAlsKlassenfeld);
	}
	
	static void anzeigeKlsMeth() {
		System.out.println("Das ist ein Klassenfeld: " + zaehlerAlsKlassenfeld);
		
		FeldZugriffe t = new FeldZugriffe();
		System.out.println("Das ist ein Instanzfeld: " + t.zaehlerAlsInstanzfeld);;
	}
	
}
