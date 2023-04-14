package aufgabe_01_06;

public class PunktTest {
	
	public static void main(String[] args) {
		Punkt p1 = new Punkt(1,2);
		p1.anzeige();
		System.out.println("-------------------\n");
		p1.setX(3);
		p1.setY(4);
		p1.anzeige();
		System.out.println(p1.getX());
		System.out.println(p1.getY());
	
		
	
		
		System.out.println("-------------------\n");
		p1.setY(7);
		p1.setX(10);
		p1.anzeige();
		System.out.println("-------------------\n");
		p1.anzeige();
		System.out.println("-------------------\n");
		p1.anzeige();
		System.out.println("-------------------\n");
		
	}

}
