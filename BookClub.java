/**
 * --------------------------------------------------------------------------------------------
 * File Name: BookClub.java
 * Project Name: Book Club Points
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Date Created: Oct. 17, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 17, 2020
 * --------------------------------------------------------------------------------------------
 */

/**
 * Class Name: Scanner <br>
 * Class Purpose: This imports the Scanner class and allows the program to create objects to read and store user input <br>
 * 
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/** 
 * Class Name: BookClub <br>
 * Class Purpose: The main class of the program. It stores how many books the user has purchased and displays their point total in the console window. <br>
 *
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
public class BookClub
{

	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It stores how many books and have been bought and calculates the point total. <br>
	 *
	 * <hr>
	 * Date created: Oct. 17, 2020 <br>
	 * Date last modified: Oct. 17, 2020 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 * 
	 * <hr>
	 *   @param args array of Strings
	 *   @return void
	 */
	 public static void main(String[] args)
	 {
		int books;	// Stores the number of books the user has purchased
		Scanner kb = new Scanner(System.in);	// Creates an object for the program to read input

		System.out.print("How many books have you purchased this month? ");
		books = kb.nextInt();

		if (books == 0)
			System.out.print("You have earned 0 points this month.");

		else if (books == 1)
			System.out.print("You have earned 5 point this month.");

		else if (books == 2)
			System.out.print("You have earned 15 points this month.");

		else if (books == 3)
			System.out.print("You have earned 30 points this month.");

		else if (books >= 4)
			System.out.print("You have earned 60 points this month.");
		
		else
			System.out.print("Please enter a valid number of books. Try again.");

	 }
}