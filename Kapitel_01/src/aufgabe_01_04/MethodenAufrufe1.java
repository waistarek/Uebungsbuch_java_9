package aufgabe_01_04;

public class MethodenAufrufe1 {
	
	void instMethode1() {
		
		System.out.println("I. Instanzmethode der Klasse MethodenAufrufeI");
		instMethode2();
		klsMethode1();
	}
	
	
	void instMethode2() {
		System.out.println("2. Instanzmethode der Klasse MethodenAufrufeI");
		
	}
	
	
	static void klsMethode1() {
		System.out.println("I. Klassenmethode der Klassen MethodenAufrufeI");
	}
	
	
	static void klsMethode2() {
		System.out.println("2. KlassenMethode der Klasse MethodenAufrufe1");
		
		MethodenAufrufe1 e = new MethodenAufrufe1();
		e.instMethode2();
		
		klsMethode1();
	}
}
