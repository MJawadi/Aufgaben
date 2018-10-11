import java.util.Scanner;
public class Aufgabe5 {

	public static void main(String[] args) {
		
		double liter, preis;
		Scanner sc = new Scanner(System.in);
		System.out.print("Fueled liters: ");
		liter = sc.nextDouble();
		System.out.print("Price per liter in EUR: ");
		preis = sc.nextDouble();
		double nettobetrag = liter*preis; 
		double mwst = nettobetrag * 0.19; 
		double bruttobetrag = nettobetrag + mwst; 
		System.out.println("Amont: "+ nettobetrag); 
		System.out.println("Value added tax: "+ mwst); 
		System.out.println("Price with tax: "+ bruttobetrag); 
	}

}
