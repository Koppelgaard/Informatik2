package blatt1.aufgabe4;

public class Aufgabe4b {

	private static final int NUM = 99;
	
	public static void main(String[] args) {
		System.out.println("Ergebnis: " +binaryCount(NUM));
	}
	
	private static int binaryCount(final int num) {
		return Integer.toBinaryString(num).length();
	}
}
