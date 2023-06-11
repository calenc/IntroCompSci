/**
 * -------------------------------------------------------------------------------------------
 * File Name: BugCollect.java
 * Project Name: Bug Collector Tracker
 * -------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Date created: Oct. 25, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 25, 2020
 * -------------------------------------------------------------------------------------------
 */

/** 
 * Class Name: Scanner <br>
 * Class Purpose: The scanner class of Java. Allows the program to create objects to read user input and store the data. <br>
 * 
 * <hr> 
 * Date created: Oct. 25, 2020 <br>
 * Date last modified: Oct. 25, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/** 
 * Class Name: BugCollect <br>
 * Class Purpose: The main class of the program. It stores user input in a loop and displays a final rolling total to the console window. <br>
 * 
 * <hr>
 * Date created: Oct. 25, 2020 <br>
 * Date last modified: Oct. 25, 2020
 * @Calen Cummings
 */
public class BugCollect
{

	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It stores user input and keeps a running total of values. <br>
	 *
	 * <hr>
	 * Date Created: Oct. 25, 2020 <br>
	 * Date last modified: Oct. 25, 2020 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, or assumptions: N/A
	 * 
	 * <hr>
	 *   @param args array of Strings
	 *   @return void
	 */
	 public static void main(String[] args)
	 {
		int bugs; 	// Holds the bug count for a given day
		int totalBugs;	// Accumulator
		String input;	// To hold input

		Scanner kb = new Scanner(System.in);

		totalBugs = 0;

		for (int count = 1; count <= 5; count++)
		{
			System.out.print("How many bugs were counted on day " + count + "? ");
			bugs = kb.nextInt();

			totalBugs += bugs;

		}

		System.out.print("The five day total comes out to " + totalBugs + " bugs counted. ");

	 }
}

			