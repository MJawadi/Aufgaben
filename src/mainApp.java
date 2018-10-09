import java.util.Scanner;

public class mainApp {
	
	public static void main(String[] args) {
		System.out.println("Write a task's number to show:");
		Scanner input = new Scanner(System.in);
		Scanner word = new Scanner(System.in);
		int aufgabeNum = 0;
		String aufgabe = word.nextLine();
		boolean run = true;
		aufgabeNum = input.nextInt();

		while(run == true) {
			
			switch(aufgabeNum) {
			
			case 1:
				System.out.println("\nAufgabe 1:");
				double num1, num2;
				double sum, difference;
			    num1 = 123.456;
			    num2 = 76.543;
			    sum = num1 + num2;
			    difference = num1 - num2;
			    System.out.println("Summe: " + sum);
			    System.out.println("Differenz: " + difference);
			    num1 = 0;
			    num2 = 0;
			    sum = 0;
			    difference = 0;
			    aufgabeNum = input.nextInt();
			    break;
			    
			case 2: 
				System.out.println("\nAufgabe 2:");
				System.out.print("Zahl 1: ");
				num1 = input.nextDouble(); 
				System.out.print("Zahl 2: "); 
				num2 = input.nextDouble();
				sum = num1 + num2;
				difference = num1 - num2;
				System.out.println("\nSumme: " + sum);
				System.out.println("Differenz: " + difference);
			    num1 = 0.0;
			    num2 = 0.0;
			    sum = 0.0;
			    difference = 0.0;
				aufgabeNum = 0;
				aufgabeNum = input.nextInt();
				break;
				
			case 3:
				System.out.println("\nAufgabe 3:");
				double x, result;
				x=11.14;
				result = 3*(Math.pow(x, 2)) - 8*x + 4;
				System.out.println("At x="+x+", the quadratic equation gives the value " + result);
				/*
				System.out.println("Want to change the value of (x)? y/n");
				aufgabe = input.nextLine();
				boolean go = true;
				while(go == true) {
				  if(input.nextLine().equals("y") || input.nextLine().equals("Y")) {
					System.out.println("Enter the new value of (x):");
					x = input.nextDouble();
					result = 3*(Math.pow(x, 2)) - 8*x + 4;
				    System.out.println("At x="+x+", the quadratic equation gives the value " + result);
				    aufgabe = input.nextLine();
				    System.out.println("another Value?:");
				  }else{
					System.out.println("Write a task's number to show:");
				    aufgabeNum = input.nextInt();
				    aufgabe = "";
					go = false;
				  }
				}
				*/
				x=0;
				result=0;
				aufgabeNum = input.nextInt();
				break;
				
			case 4:	
				System.out.println("\nAufgabe 4:");
				double celsius, fahrenheit;
				boolean go2 = true;
				System.out.println("Enter the room temputure to calculate? y/n");
				System.out.print("Temperatur in °Celsius: ");
				fahrenheit = 9/5d * celsius + 32;
				/*
				aufgabe = word.nextLine();
				while(go2 == true) {
					if(aufgabe.equals("y") || aufgabe.equals("Y")) {
						System.out.print("Temperatur in °Celsius: "); 
						celsius = input.nextDouble(); 
						fahrenheit = 9/5d * celsius + 32;
						System.out.println(celsius+" Grad Celsius sind "+fahrenheit+" Grad Fahrenheit");
						aufgabe = "";
						celsius = 0.0;
						System.out.println("Again?");
						aufgabe = word.nextLine();
					}else {
						go2 = false;
					}

				}
				*/
				break;
				
			default :
				break;
				
			}
			
		
		}
	}
}

