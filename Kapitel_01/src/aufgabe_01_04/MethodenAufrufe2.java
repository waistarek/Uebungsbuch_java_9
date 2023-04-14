package aufgabe_01_04;

public class MethodenAufrufe2 {
	
	void instMethode() {
		
		MethodenAufrufe1 w = new MethodenAufrufe1();
		w.instMethode1();
		
		MethodenAufrufe1.klsMethode2();
		
	}
	static void klsMethode() {
		
		MethodenAufrufe1 w = new MethodenAufrufe1();
		w.instMethode1();
		MethodenAufrufe1.klsMethode2();
	}

}
