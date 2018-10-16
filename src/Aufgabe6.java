public class Aufgabe6 {

	public static void main(String[] args) {
		
		System.out.println("\nAufgabe 6:  Es soll ein Programm entwickelt werden, das den durchschnittlichen Benzinverbrauch eines\n"
				+ "Pkw auf 100 km ermittelt. Der Benutzer gibt die gefahrenen Kilometer und den gesamten Benzinverbrauch ein. Das Programm\n "
				+ "ermittelt daraufhin den durchschnittlichen Verbrauch auf 100 km.");
		double km, verbrauch, ergebnis;
		System.out.print("\nGefahrene Kilometer: ");
		km = mainApp.scan.nextDouble();
		System.out.print("Verbrauchtes Benzin in Liter: ");
		verbrauch = mainApp.scan.nextDouble();
		ergebnis = verbrauch/km*100;
		System.out.println("Sie haben auf 100 km " + ergebnis + " Liter verbraucht.");
	}

}
