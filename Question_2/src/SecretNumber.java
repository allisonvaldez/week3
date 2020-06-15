/*
 * Allison Snipes
 * Course 605.201.81 Summer 2020
 * Module 3 Question 2
 * 
 * 
 * Application Requirements:
 * Write a program that asks a user to guess a secret number between 1 and N, where N is 
 * a positive number that the user is prompted for. The program should also prompt the user
 * for the maximum number of guesses they would like to make. Each time the player makes a 
 * guess, the program shall respond with “correct”, “too low”, or “too high”. The program 
 * should keep track of the number of guesses the user made to discover the secret number. 
 * The program should continue execution until the user has discovered the secret number or
 * has exceeded the maximum number of guesses. The program shall also allow the user to play
 * the game again until the user declines. The program should generate the magic number randomly,
 * using the built-in Java method Math.random().
*/

import java.util.Scanner;

public class SecretNumber {
	/*
     * Here is the main block of my code. 
     * 1. I will initialize all of my variables 
     * 2. I will ask the user to guess a number and I will save it to a variable
     * 3. conduct error handling 
     * 4. I will ask the user for the maximum number of guesses they want and save it to a variable.
     * 5. conduct error handling
     * 6. I need to randomize a number and save it to a variable using: 
     * 	  randomNumber = (int) ( N * Math.random() ) + 1;
     * 7. i will have a do while for them being equal or not equal (default)
     * 8. i will use an if-else if for when the number is guesses right, or if the guess is to high or low.
     * 
     * Assumptions:
     * 1. Generally the user will not guess the right number on the first guess -> use do-while and set
     *    isEqual to false
     * 2. Generally the user wants to play the game so set quit to false, unless they select to quit -> use switch case
     *    to play or not to play, default for error catching.
     * 3. When guesses = 0 game should quit
     */
	public static void main(String[] args) {
		int userNum, randNum, guesses, choice, i = 0;
		boolean quit = false;	
		boolean isEqual = true;
		
		HeaderMessage();
		
		System.out.println("Guess a number: \n");
		Scanner input = new Scanner(System.in);
		userNum = input.nextInt();
		
		randNum =  (int) ( userNum * Math.random() ) + 1;
		
		
		do {
			System.out.println("\nEnter the number of guesses you'd like: \n");
			guesses = input.nextInt();
			
			if (userNum == randNum) {
				guesses = 0;
				System.out.println("\nCorrect! Your are super lucky! Guesses are " + guesses + ".\n");
				UserFeedback();
				
				System.out.println(userNum + " userNum");
				System.out.println(guesses + " guesses");
				System.out.println(randNum + " randNum");
				
			} else { 
				
				while (userNum > randNum) {
					System.out.println("\nYou've guesses too high! Guess again...\n");
					
					if (userNum == randNum) {
						guesses = 0;
						System.out.println("\nCorrect! Your are super lucky! Guesses are " + guesses + ".\n");
						UserFeedback();
						
						System.out.println(userNum + " userNum");
						System.out.println(guesses + " guesses");
						System.out.println(randNum + " randNum");
					} else if (userNum > randNum) {
						guesses --;
						if (guesses == 0) {
							System.out.println("\nYou are out of guesses. The correct number was " + randNum + ".");
							
							System.out.println(userNum + " userNum");
							System.out.println(guesses + " guesses");
							System.out.println(randNum + " randNum");
							UserFeedback();
						} else if (userNum < randNum) {
							guesses--;
							System.out.println("You have guessed too low! You have " + guesses + " left. Guess again: \n");
							userNum = input.nextInt();
							
							System.out.println(userNum + " userNum");
							System.out.println(guesses + " guesses");
							System.out.println(randNum + " randNum");
						} else if (userNum > randNum) {
							guesses--;
							System.out.println("You have guessed too high! You have " + guesses + " left. Guess again: \n");
							userNum = input.nextInt();
							
							System.out.println(userNum + " userNum");
							System.out.println(guesses + " guesses");
							System.out.println(randNum + " randNum");
						}
						
					} else if (userNum < randNum) {
						guesses --;
						if (guesses == 0) {
							System.out.println("\nYou are out of guesses. The correct number was " + randNum + ".");
							
							System.out.println(userNum + " userNum");
							System.out.println(guesses + " guesses");
							System.out.println(randNum + " randNum");
							UserFeedback();
						} else if (userNum < randNum) {
							guesses--;
							System.out.println("You have guessed too low! You have " + guesses + " left. Guess again: \\n");
							userNum = input.nextInt();
							
							System.out.println(userNum + " userNum");
							System.out.println(guesses + " guesses");
							System.out.println(randNum + " randNum");
						} else if (userNum > randNum) {
							guesses--;
							System.out.println("You have guessed too high! You have " + guesses + " left. Guess again: \\n");
							userNum = input.nextInt();
							
							System.out.println(userNum + " userNum");
							System.out.println(guesses + " guesses");
							System.out.println(randNum + " randNum");
						}
					}
				}
				
				while (userNum < randNum) {
					System.out.println("You've guesses too low! Guess again...\n");
					
					if (guesses == 0) {
						System.out.println("You are out of guesses. The correct number was " + randNum + ".");
						
						UserFeedback();
						
						System.out.println(userNum + " userNum");
						System.out.println(guesses + " guesses");
						System.out.println(randNum + " randNum");
					} else if (userNum > randNum) {
						guesses --;
						if (guesses == 0) {
							System.out.println("\nYou are out of guesses. The correct number was " + randNum + ".");
							
							System.out.println(userNum + " userNum");
							System.out.println(guesses + " guesses");
							System.out.println(randNum + " randNum");
							UserFeedback();
						} else if (userNum < randNum) {
							guesses--;
							System.out.println("You have guessed too low! You have " + guesses + " left. Guess again: \n");
							userNum = input.nextInt();
							
							System.out.println(userNum + " userNum");
							System.out.println(guesses + " guesses");
							System.out.println(randNum + " randNum");
						} else if (userNum > randNum) {
							guesses--;
							System.out.println("You have guessed too high! You have " + guesses + " left. Guess again: \n");
							userNum = input.nextInt();
							
							System.out.println(userNum + " userNum");
							System.out.println(guesses + " guesses");
							System.out.println(randNum + " randNum");
						}
						
					} else if (userNum < randNum) {
						guesses --;
						if (guesses == 0) {
							System.out.println("\nYou are out of guesses. The correct number was " + randNum + ".");
							
							System.out.println(userNum + " userNum");
							System.out.println(guesses + " guesses");
							System.out.println(randNum + " randNum");
							UserFeedback();
						} else if (userNum < randNum) {
							guesses--;
							System.out.println("You have guessed too low! You have " + guesses + " left. Guess again: \\n");
							userNum = input.nextInt();
							
							System.out.println(userNum + " userNum");
							System.out.println(guesses + " guesses");
							System.out.println(randNum + " randNum");
						} else if (userNum > randNum) {
							guesses--;
							System.out.println("You have guessed too high! You have " + guesses + " left. Guess again: \\n");
							userNum = input.nextInt();
							
							System.out.println(userNum + " userNum");
							System.out.println(guesses + " guesses");
							System.out.println(randNum + " randNum");
						}
					}
				}
			}
		} while (!isEqual);
		
	}

	private static void HeaderMessage() {
		System.out.println("\n");
		System.out.println("+------------------------------------------------------------+");
		System.out.println("|                     Hello User!                            |");
		System.out.println("|   Please start by entering a number you'd like to guess.   |");
		System.out.println("|    Next enter the maximum number of guesses you'd like.    |");
		System.out.println("| If you'd like to quit the game enter 0 when prompted to do |");
		System.out.println("| so. If you'd like to play again enter 1. The game will     |");
		System.out.println("|    automatically quit when you have run out of guesses.    |");
		System.out.println("|                    Let's start!                            |");
		System.out.println("+------------------------------------------------------------+");
		System.out.println("\n");
	}
	
	public static void UserFeedback() {
		Scanner input = new Scanner(System.in);
		int choice;
		System.out.println("Do you still want to place the game? Press (0) or (1).\n");
		choice = input.nextInt();
		switch (choice) {
		case 0:
			System.out.println("You selected to quit the game.\n");
			break;
		case 1:
			System.out.println("Let's start the game!\n");
			main(null);
			break;
		default:
			System.out.println("\nAn unknown error has occured.\n");
			break;
		}
	}
	
	
}
