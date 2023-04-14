package aufgabe_01_10;

public class GanzeZahlen {
	
	private int z;
	
	public GanzeZahlen(int z) {
		this.z = z;
	}
	
	public void setZahl(int z) {
		this.z = z;
	}
	
	public int getZahl() {
		return z;
	}
	
	public int negativ() {
		return -z;
	}
	public boolean gleich(int x) {
		return  x == z;
	}
	public boolean kleiner(int x) {
		return x < z;
	}
	public void anzeige() {
		System.out.println("Das ist ein GanzZahlen-Objekt: " + z);
	}
	
	public static void ggTeiler(int a, int b) {
		
		
		
		
	
		
	}
	public static void kgViekfaches() {
		
	}
	
	/*public static int add(int x) {
		return x + z;
	}*/
	/*public static int divid(int x) {
		return x / z;
	}*/
	public int subtr(int x) {
		return x - z;
	}
	public int multipl(int x) {
		return x * z;
	}
}
