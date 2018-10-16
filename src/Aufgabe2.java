public class Aufgabe2 {

	public static void main(String[] args) {
		
		double num1, num2, sum, difference;
		System.out.println("\nAufgabe 2: Nun soll nicht mehr der Programmierer die Gleitkommazahlen initialisieren, \n"
				+ " sondern der Benutzer. Dieser wird aufgefordert zwei Kom-mazahlen einzugeben.\n"
				+ " Das Programm errech-net dann wie oben Summe und Differenz.");
		System.out.print("Zahl 1: ");
		num1 = mainApp.scan.nextDouble();
		System.out.print("Zahl 2: ");
		num2 = mainApp.scan.nextDouble();
		sum = num1 + num2;
		difference = num1 - num2;
		System.out.println("\nSumme: " + sum);
		System.out.println("Differenz: " + difference);
	}

}
