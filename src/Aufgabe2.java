import java.util.Scanner;
public class Aufgabe2 {

	public static void main(String[] args) {
		
		Scanner input2 = new Scanner(System.in);
		double num1, num2, sum, difference;
		System.out.println("\nAufgabe 2:");
		System.out.print("Zahl 1: ");
		num1 = input2.nextDouble();
		System.out.print("Zahl 2: ");
		num2 = input2.nextDouble();
		sum = num1 + num2;
		difference = num1 - num2;
		System.out.println("\nSumme: " + sum);
		System.out.println("Differenz: " + difference);
		num1 = 0.0;
		num2 = 0.0;
		sum = 0.0;
		difference = 0.0;
		//input2.close();
	}

}
