package aufgabe_01_07;

public class VektorTest {

	public static void main(String[] args) {
		Vektor v1 = new Vektor(1,1,1);
		Vektor v2 = new Vektor(2,2,2);
		Vektor v3 = new Vektor(v2);
		//System.out.println(v3);
		
		System.out.println(v1.vektorErzeuge(1,1,1));
		System.out.println(v1);
		//v1.vektorAnzeige();
		//System.out.println(v1.vektorErzeuge(v2));

	}

}
