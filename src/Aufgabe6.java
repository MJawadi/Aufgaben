import java.util.Scanner;
public class Aufgabe6 {

	public static void main(String[] args) {
		
		double km, verbrauch, ergebnis;
		Scanner sc = new Scanner(System.in);
		System.out.print("Gefahrene Kilometer: ");
		km = sc.nextDouble();
		System.out.print("Verbrauchtes Benzin in Liter: ");
		verbrauch = sc.nextDouble();
		ergebnis = verbrauch/km*100;
		System.out.println("Sie haben auf 100 km " + ergebnis + " Liter ver-braucht.");
	}

}
