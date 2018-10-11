import java.util.Scanner;
public class Aufgabe4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("\nAufgabe 4:");
		double celsius, fahrenheit;
	    System.out.println("Enter the room temputure to calculate: ");
	    System.out.print("Temperatur in °Celsius: ");
	    celsius = input.nextDouble();
		fahrenheit = 9/5d * celsius + 32;
		System.out.println(celsius+" Grad Celsius sind " +fahrenheit+" Grad Fahrenheit"); 
	}
}
