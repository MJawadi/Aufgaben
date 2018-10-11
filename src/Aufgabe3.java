import java.util.Scanner;
public class Aufgabe3 {

	public static void main(String[] args) {
		
		Scanner input2 = new Scanner(System.in);
		String aufgabe;
		System.out.println("\nAufgabe 3:");
		double x, result;
		x = 11.14;
		result = 3 * (Math.pow(x, 2)) - 8 * x + 4;
		System.out.println("At x=" + x + ", the quadratic equation gives the value " + result);
		System.out.println("\nWant to change the value of (x)? y/n");
		while (true) {
			aufgabe = input2.nextLine();
			if (aufgabe.equals("y") || aufgabe.equals("Y")) {
				System.out.println("Enter the new value of (x): ");
				x = input2.nextDouble();
				result = 3 * (Math.pow(x, 2)) - 8 * x + 4;
				System.out.println("At x=" + x + ", the quadratic equation gives the value " + result);
				System.out.println("\nanother Value? y/n");
				aufgabe = input2.nextLine();
			} else {
				break;
			}
		}

	}

}
