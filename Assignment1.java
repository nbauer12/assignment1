/*
 * Class: CMSC203 
 * Instructor: Professor Ashique Tanveer
 * Assignment Number: 1
 * Description: A program to test your ESP.
 * Due: 06/19/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   
 * any source. I have not given my code to any student.
 * Print your Name here: Nathaniel Bauer
*/

package assignment1;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int correctGuesses = 0;
        int currentRound = 1;

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your MC M#: ");
        String id = scanner.nextLine();

        System.out.println("Describe yourself: ");
        String description = scanner.nextLine();
        
        System.out.print("Due Date: ");
        String dueDate = scanner.nextLine();

        System.out.println("CMSC203 Assignment1: Test your ESP skills!");

        for (int i = 0; i < 10; i++) {
            System.out.println("Round " + currentRound);
            System.out.println("I am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
            System.out.print("Enter your guess here: ");

            int randomNumber = (int)(Math.random() * 5) + 1;
            String selectedColor = "";

            if (randomNumber == 1) {
                selectedColor = "Red";
            } else if (randomNumber == 2) {
                selectedColor = "Green";
            } else if (randomNumber == 3) {
                selectedColor = "Blue";
            } else if (randomNumber == 4) {
                selectedColor = "Orange";
            } else if (randomNumber == 5) {
                selectedColor = "Yellow";
            }

            String userGuess = scanner.nextLine();

            System.out.println();
            System.out.println("I was thinking of " + selectedColor);

            if (userGuess.equalsIgnoreCase(selectedColor)) {
                correctGuesses++;
            }

            currentRound++;

        }


        System.out.println("Game Over");
        System.out.println("You guessed " + correctGuesses + " out of 10 colors correctly.");
        System.out.println("User Name: " + name);
        System.out.println("Student MC M#: " + id);
        System.out.println("User Description: " + description);
        System.out.println("Due Date: " + dueDate);

        scanner.close();

    }

}