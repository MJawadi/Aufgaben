public class Aufgabe7 {

	public static void main(String[] args) {
		
		System.out.println("Aufgabe 7: Es soll ein Programm entwickelt werden,\n das f�reinen beliebigen Kreis Fl�che und Umfang berechnet.");
		double radius, umfang, flaeche;
		final double PI =3.1415927;
		System.out.print("Geben Sie den Radius des Kreises ein: ");
		radius = mainApp.scan.nextDouble(); 
		flaeche = PI * (radius *radius); 
		umfang = 2*PI*radius; 
		System.out.println("Fl�che: " + flaeche); System.out.println("Umfang: " + umfang);

	}
}
