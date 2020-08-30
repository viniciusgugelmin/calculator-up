package com.github.viniciusgugelmin;

import java.util.Scanner;

public class Interface {
	
	public static void main(String[] args) {
		
		int choice = 2;
		
		do {
			Scanner in = new Scanner(System.in);
			
			System.out.println("calculator-up");
			System.out.println("1- Addition");
			System.out.println("2- Subtraction");
			System.out.println("3- Division");
			System.out.println("4- Multiplication");
			System.out.print("Choose your operation: ");
			int op = in.nextInt();
			
			switch (op) {
			case 1:
				
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
					
					System.out.print("The sum result is: " + numbersAdd);
					
					do {
						System.out.print("\nType 2 to sum again, 1 to stop and 0 to quit!");
						choice = in.nextInt();
						
						if (choice > 2 || choice < 0) {
							System.out.print("WRONG NUMBER; MUST BE 2, 1 OR 0");
						}
						
					} while (choice > 2 || choice < 0);
					
				} while (choice == 2);
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
			}
			
		} while (choice > 0);
	}
}
