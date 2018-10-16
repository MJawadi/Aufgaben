public class Aufgabe3 {

	public static void main(String[] args) {
		
		String aufgabe;
		System.out.println("\nAufgabe 3:   Angenommen du bist an den Werten der Quadratgleichung 3x2 -8x + 4 für verschiedene \n"
				+ "Werte von x interessiert. Schreibe ein Programm mit einer Variablen x vom Typ double. Weise der Variablen einen Wert zu.");
		double x, result;
		x = 11.14;
		result = 3 * (Math.pow(x, 2)) - 8 * x + 4;
		System.out.println("\nAt x=" + x + ", the quadratic equation gives the value " + result);
		System.out.print("\nWant to change the value of (x)? y/n: ");
		aufgabe = mainApp.scan.nextLine();
		while (true) {
			aufgabe = mainApp.scan.nextLine();
			if (aufgabe.equals("y") || aufgabe.equals("Y")) {
				System.out.print("Enter the new value of (x): ");
				x = mainApp.scan.nextDouble();
				result = 3 * (Math.pow(x, 2)) - 8 * x + 4;
				System.out.println("\nAt x=" + x + ", the quadratic equation gives the value " + result);
				System.out.print("\nanother Value? y/n: ");
				aufgabe = mainApp.scan.nextLine();
			} else {
				break;
			}
		}

	}

}
