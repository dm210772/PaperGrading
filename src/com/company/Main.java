package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter paper total");
        int paperTotal = input.nextInt();

        while (true) {
            System.out.println("Enter student mark");
            int studentTotal = input.nextInt();

            if (studentTotal > paperTotal || studentTotal < 0) {
                System.out.println("Please input a valid mark");
            }

            if (studentTotal >= (paperTotal * 0.80)) {
                System.out.println("This students grade is A");
            }
            else if (studentTotal >= (paperTotal * 0.70) && studentTotal <= (paperTotal * 0.79)) {
                System.out.println("This students grade is B");
            }
            else if (studentTotal >= (paperTotal * 0.60) && studentTotal <= (paperTotal * 0.69)) {
                System.out.println("This students grade is C");
            }
            else if (studentTotal >= (paperTotal * 0.50) && studentTotal <= (paperTotal * 0.59)) {
                System.out.println("This students grade is D");
            }
            else if (studentTotal >= (paperTotal * 0.40) && studentTotal <= (paperTotal * 0.49)) {
                System.out.println("This students grade is E");
            }
            else if (studentTotal < (paperTotal * 0.40)) {
                System.out.println("This students grade is U");
            }

            System.out.println("Would you like to try another mark?");
            String userChoice = input.next();
            if (userChoice.equalsIgnoreCase("no")) {
               break;
            }
        }
    }
}
