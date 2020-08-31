package com.github.viniciusgugelmin;

import java.util.Scanner;

public class Interface {
	
	public static void main(String[] args) {
		int choice = 2;
		
		do {
			Scanner in = new Scanner(System.in);
			
			System.out.println("-------------");
			System.out.println("calculator-up");
			System.out.println("1- Addition");
			System.out.println("2- Subtraction");
			System.out.println("3- Division");
			System.out.println("4- Multiplication");
			System.out.println("5- Quit");
			System.out.print("Choose your operation: ");
			int op = in.nextInt();
			System.out.println("-------------");
			
			
			switch (op) {
			case 1:
				choice = add();
				break;
			case 2:
				choice = sub();
				break;
			case 3:
				choice = div();
				break;
			case 4:
				choice = mult();
				break;
			case 5:
				choice = 0;
				break;
			}
		
			System.out.println(choice == 0 ? "Goodbye!" : "");
			
		} while (choice > 0);
	}
	
	public static int add() {
		int choice = 2;
		Scanner in = new Scanner(System.in);
		
		do {
			int numbersCountAdd = 0;
			
			do {
				System.out.print("\nNum of numbers to add: ");
				numbersCountAdd = in.nextInt();
				
				if (numbersCountAdd < 0) {
					System.out.print("WRONG NUMBER; MUST BE POSITIVE");
				}
				
			} while (numbersCountAdd < 0);
			
			double numbersAdd = 0;
			
			for (int count = 0; count < numbersCountAdd; count++) {
				
				System.out.print("Number " + (count + 1) + ": ");
				numbersAdd += in.nextDouble();
			}
			
			System.out.println("The sum result is: " + numbersAdd);
			
			do {
				System.out.print("\nType 2 to sum again, 1 to stop and 0 to quit: ");
				choice = in.nextInt();
				
				if (choice > 2 || choice < 0) {
					System.out.print("WRONG NUMBER; MUST BE 2, 1 OR 0");
				}
				
			} while (choice > 2 || choice < 0);
			
		} while (choice == 2);
		
		return choice;
	}
	
	public static int sub() {
		int choice = 2;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.print("\nNumber to sub: ");
			double numberSub = in.nextDouble();
			
			double numbersSub = numberSub;
			int count = 0, calculating;
			
			do {
				count++;
				
				System.out.print("Number " + count + ": ");
				numbersSub -= in.nextDouble();
				
				System.out.println("The sub result is now: " + numbersSub);
				
				System.out.print("\nType 1 to continue this calculation, 0 to stop: ");
				calculating = in.nextInt();
				
				if (calculating > 1 || calculating < 0) {
					System.out.print("WRONG NUMBER; MUST BE 1 OR 0");
				}
				
			} while (calculating != 0);
			
			System.out.println("The sub result is: " + numbersSub);
			
			do {
				System.out.print("\nType 2 to sub again, 1 to stop and 0 to quit: ");
				choice = in.nextInt();
				
				if (choice > 2 || choice < 0) {
					System.out.print("WRONG NUMBER; MUST BE 2, 1 OR 0");
				}
				
			} while (choice > 2 || choice < 0);
			
		} while (choice == 2);
		
		return choice;
	}
	
	public static int div() {
		int choice = 2;
		Scanner in = new Scanner(System.in);
		
		do {
			double numberToDiv, numberDiv;

			System.out.print("\nDividend number: ");
			numberToDiv = in.nextDouble();
			
			do {
				System.out.print("\nDivisor number: ");
				numberDiv = in.nextDouble();
				
				if (numberDiv < 0) {
					System.out.print("WRONG NUMBER; MUST BE HIGHER THAN 0");
				}
				
			} while (numberDiv < 0);
			
			System.out.println("The div result is: " + (numberToDiv/numberDiv));
			
			do {
				System.out.print("\nType 2 to div again, 1 to stop and 0 to quit: ");
				choice = in.nextInt();
				
				if (choice > 2 || choice < 0) {
					System.out.print("WRONG NUMBER; MUST BE 2, 1 OR 0");
				}
				
			} while (choice > 2 || choice < 0);
			
		} while (choice == 2);
		
		return choice;
	}
	
	public static int mult() {
		int choice = 2;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.print("\nNumber to mult: ");
			double numberMult = in.nextDouble();
			
			double numbersMult = numberMult;
			int count = 0, calculating;
			
			do {
				count++;
				
				System.out.print("Number " + count + ": ");
				numbersMult *= in.nextDouble();
				
				System.out.println("The mult result is now: " + numbersMult);
				
				System.out.print("\nType 1 to continue this calculation, 0 to stop: ");
				calculating = in.nextInt();
				
				if (calculating > 1 || calculating < 0) {
					System.out.print("WRONG NUMBER; MUST BE 1 OR 0");
				}
				
			} while (calculating != 0);
			
			System.out.println("The mult result is: " + numbersMult);
			
			do {
				System.out.print("\nType 2 to mult again, 1 to stop and 0 to quit: ");
				choice = in.nextInt();
				
				if (choice > 2 || choice < 0) {
					System.out.print("WRONG NUMBER; MUST BE 2, 1 OR 0");
				}
				
			} while (choice > 2 || choice < 0);
			
		} while (choice == 2);
		
		return choice;
	}
}
