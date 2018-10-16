public class Aufgabe5 {

	public static void main(String[] args) {
		
		System.out.println("Aufgabe 5:  Es soll ein Programm entwickelt werden, das eine Rechnung für eine Tankfüllung erstellt und\n"
				+ "auf dem Bildschirm ausgibt. Getankte Literzahl und der Nettopreis pro Liter werden vom Benutzer eingegeben.");
		double liter, preis;
		String word;
		System.out.print("Fueled liters: ");
		liter = mainApp.scan.nextDouble();
		System.out.print("Price per liter in EUR: ");
		preis = mainApp.scan.nextDouble();
		double nettobetrag = liter*preis; 
		double mwst = nettobetrag * 0.19; 
		double bruttobetrag = nettobetrag + mwst; 
		System.out.println("Amont: "+ nettobetrag); 
		System.out.println("Value added tax: "+ mwst); 
		System.out.println("Price with tax: "+ bruttobetrag); 
		System.out.print("\nTry with new values? y/n: ");
		word = mainApp.scan.nextLine();
		while(true) {
			word = mainApp.scan.nextLine();
			if(word.equals("Y") || word.equals("y")) {
				System.out.print("Fueled liters: ");
				liter = mainApp.scan.nextDouble();
				System.out.print("Price per liter in EUR: ");
				preis = mainApp.scan.nextDouble();
				nettobetrag = liter*preis; 
				mwst = nettobetrag * 0.19; 
				bruttobetrag = nettobetrag + mwst; 
				System.out.println("Nettobetrag: "+ nettobetrag); 
				System.out.println("Mehrwertsteuer: "+ mwst); 
				System.out.println("Bruttubetrag: "+ bruttobetrag); 
				System.out.print("\nTry with new values? y/n: ");
				word = mainApp.scan.nextLine();
			}else {
				break;
			}
		}
	}

}
