/**
 * ---------------------------------------------------------------------------------------------
 * File Name: MagicDates.java
 * Project Name: Magic Dates
 * ---------------------------------------------------------------------------------------------
 * Author's Name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Creation Date: Oct. 17, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 17, 2020
 * ---------------------------------------------------------------------------------------------
 */

/** 
 * Class Name: Scanner <br>
 * Class Purpose: This imports the Scanner class of Java, allowing the system to read user input and store it as variables. <br>
 * 
 * <hr>
 * Date created: Oct. 17, 2020<br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/** 
 * Class Name: MagicDates <br>
 * Class Purpose: The main class of the program. It holds the dates as variables and operates on them, followed by displaying if the product is "magic" or not.<br> 
 * 
 * <hr> 
 * Date created: Oct. 17, 2020<br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
public class MagicDates
{
	
	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It calculates given data and displays a decision. <br>
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
		int month;	// For storing the input month of the date
		int day;	// For storing the day of the date
		int year;	// For storing the year of the date
		int date;	// Stores the product of the month and day
		Scanner kb = new Scanner(System.in);	// Creates a scanner for the keyboard to store and reference data
		
		System.out.print("Pick a date. What is the month? (MM) ");
		month = kb.nextInt();

		System.out.print("What is the day? (DD) ");
		day = kb.nextInt();

		System.out.print("What is the year? (YY) ");
		year = kb.nextInt();
		
		if (month * day == year)
			System.out.print("That is a magic date!!");
		else
			System.out.print("That is not a magic date.");

	 }
}