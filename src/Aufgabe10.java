public class Aufgabe10 {

	public static void main(String[] args) {
		
		int april, mai, juni; 
		double durchschnitt; 
		System.out.println("\nAufgabe 10:  Schreibe ein Programm, das die durchschnittliche Niederschlagsmenge für die drei Monate\n"
				+ "April, Mai und Juni berechnet. Deklariere und initialisiere eine Variable für jeden Monat.");
		
		System.out.print("\nNiederschlag im April:\t "); 
		april = mainApp.scan.nextInt(); 
		System.out.print("Niederschlag im Mai:\t"); 
		mai = mainApp.scan.nextInt(); 
		System.out.print("Niederschlag im Juni:\t"); 
		juni = mainApp.scan.nextInt(); 
		durchschnitt = (april + mai + juni)/3.0; 
		System.out.println("Durchschnitt: \t"+durchschnitt);
		System.out.println("\nWrite (Q) if you want to close this task");
	}

}

