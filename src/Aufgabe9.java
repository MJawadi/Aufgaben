public class Aufgabe9 {

	public static void main(String[] args) {
		
		System.out.println("Aufgabe 9:  Implementiere eine main-Methode, die die Endgeschwindigkeit in Abhängigkeit der Fallhöhe h\n"
				+ "berechnet und sowohl in m/s als auch km/h am Bildschirm ausgibt. Die Quadratwurzel eines Wertes\n"
				+ "kann mit Math.sqrt() berechnet werden.");
		double endgeschwindigkeit, kmh; 
		//Fallzeit t 
		double t; 
		//Fallhöhe s 
		double s; 
		//Erdbeschleunigung g 
		final double G = 9.81;  
		System.out.print("Fallhoehe: "); 
		s = mainApp.scan.nextDouble(); 
		t=Math.sqrt((2*s/G)); 
		endgeschwindigkeit = t*G; 
		kmh = endgeschwindigkeit*3.6; 
		System.out.println("Endgeschwindigkeit in m/s: "+endgeschwindigkeit); 
		System.out.println("Endgschwindigkeit in km/h: "+kmh);

	}

}
