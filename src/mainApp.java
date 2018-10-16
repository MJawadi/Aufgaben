import java.util.Scanner;

public class mainApp {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		boolean run = true;
		while (run) {
			
			scan = new Scanner(System.in);
			int aufgabeNum = 0;
			System.out.println("\nType 0 to close program");
			System.out.print("\nWrite a task's number to show: ");
			aufgabeNum = scan.nextInt();
			switch (aufgabeNum) {
			
			case 0:
				System.out.println("End of Program");
				run = false;
				break;

			case 1:
				Aufgabe1.main(null);
				System.out.println("\nEnd of task: " + aufgabeNum);
				break;

			case 2:
				Aufgabe2.main(null);
				System.out.println("\nEnd of task: " + aufgabeNum);
				break;

			case 3:
				Aufgabe3.main(null);
				System.out.println("\nEnd of task: " + aufgabeNum);
				break;

			case 4:
				Aufgabe4.main(null);
				System.out.println("\nEnd of task: " + aufgabeNum);
				break;
				
			case 5:
				Aufgabe5.main(null);
				System.out.println("\nEnd of task: " + aufgabeNum);
				break;
				
			case 6:
				Aufgabe6.main(null);
				System.out.println("\nEnd of task: " + aufgabeNum);
				break;
				
			case 7:
				Aufgabe7.main(null);
				System.out.println("\nEnd of task: " + aufgabeNum);
				break;
				
			case 8:
				Aufgabe8.main(null);
				System.out.println("\nEnd of task: " + aufgabeNum);
				break;
				
			case 9:
				Aufgabe9.main(null);
				System.out.println("\nEnd of task: " + aufgabeNum);
				break;
				
			case 10:
				Aufgabe10.main(null);
				System.out.println("\nEnd of task: " + aufgabeNum);
				break;
				
			default:
				break;

			}

		}
	}
	
}
