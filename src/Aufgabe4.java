public class Aufgabe4 {

	public static void main(String[] args) {
		
		String word;
		System.out.println("\nAufgabe 4: Erstelle eine Klasse Temperatur mit einer main-Methode,\n"
				+ "um eine Temperatur gegeben in Grad Celsius in Grad Fahrenheit umzurechnen. Die Umrechungsformel ist:\n"
				+ "Fahrenheit = 9/5 * Celsius + 32");
		double celsius, fahrenheit;
	    System.out.println("\nEnter the room temputure to calculate: ");
	    System.out.print("Temperatur in °Celsius: ");
	    celsius = mainApp.scan.nextDouble();
		fahrenheit = 9/5d * celsius + 32;
		System.out.println(celsius+" Grad Celsius sind " +fahrenheit+" Grad Fahrenheit");
		System.out.print("\nTry another value? y/n: ");
		word = mainApp.scan.nextLine();
		while(true) {
			word = mainApp.scan.nextLine();
			if(word.equals("y") || word.equals("Y")) {
				System.out.println("Enter the room temputure to calculate: ");
				System.out.print("Temperatur in °Celsius: ");
				celsius = mainApp.scan.nextDouble();
				fahrenheit = 9/5d * celsius + 32;
				System.out.println(celsius+" Grad Celsius sind " +fahrenheit+" Grad Fahrenheit"); 
				System.out.print("\nTry another value? y/n: ");
				word = mainApp.scan.nextLine();
			}else {
				break;
			}
		}
	}
}
