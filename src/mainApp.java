import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		/*
		System.out.println("Args are:");
		for(String arg : args) {
			System.out.println(arg);
		}*/
		
		
		boolean run = true;

		while (run) {
			
			Scanner input = new Scanner(System.in);
			int aufgabeNum = 0;
			System.out.println("\nWrite a task's number to show:");
			aufgabeNum = input.nextInt();
			switch (aufgabeNum) {

			case 1:
				Aufgabe1.main(null);
				break;

			case 2:
				Aufgabe2.main(null);
				break;

			case 3:
				Aufgabe3.main(null);
				break;

			case 4:
				Aufgabe4.main(null);
				break;
				
			case 5:
				Aufgabe5.main(null);
				break;
				
			case 6:
				//Aufgabe6.main(null);
				break;
				
			default:
				break;

			}

		}
	}
}
