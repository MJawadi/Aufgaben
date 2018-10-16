public class Aufgabe8 {

	public static void main(String[] args) {
		
		System.out.println("\nAufgabe 8: Schreibe ein Programm Zaehlmass, das eine ganze Zahl >=0\n"
				+ "von der Kommandozeile einliest und diese in Gros, Schock,\n"
				+ "Dutzend und Einzelstücke umrechnet.");
		int gros, schock, dutzend, stueck, rest; 
		System.out.print("Geben Sie eine Zahl ein: "); 
		int zahl = mainApp.scan.nextInt(); 
		gros= zahl/144; 
		rest = zahl%144; 
		schock = rest/60; 
		rest = rest%60; 
		dutzend = rest/12; 
		rest = rest%12; 
		stueck = rest; 
		System.out.println("\n" +gros + " Gros\n" +schock + " Schock\n" + dutzend + " Dutzend\n" + stueck + " Stueck");
	}

}
