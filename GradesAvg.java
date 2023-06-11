/**
 * --------------------------------------------------------------------------------------------
 * File Name: GradesAvg.java
 * Project Name: Grade Average Calculator Loop
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Date created: Oct. 27, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 27, 2020
 * --------------------------------------------------------------------------------------------
 */

/**
 * Class Name: Scanner <br>
 * Class Purpose: The scanner class of Java. Allows the program to create objects to read and store user input. <br>
 *
 * <hr>
 * Date created: Oct. 27, 2020 <br>
 * Date last modified: Oct. 27, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/** 
 * Class Name: GradesAvg <br>
 * Class Purpose: The main class of the program. It takes user input within a given range and calculates a grade average from those values, displaying it in the console window. <br>
 *
 * <hr>
 * Date created: Oct. 27, 2020 <br>
 * Date last modified: Oct. 27, 2020
 * @Calen Cummings
 */
public class GradesAvg
{
	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It stores user input and calculates an average from the data. <br>
	 *
	 * <hr>
	 * Date created: Oct. 27, 2020 <br>
	 * Date last modified: Oct. 27, 2020 <br>
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
		int grade;	// Accumulator
		int numba;	// Holds user input
		int count;	// Keeps track of successful iterations
		double avg;	// Holds the calculation for the grade average
		Scanner kb = new Scanner(System.in);	// For reading input

		grade = 0;
		count = 0;

		System.out.print("Enter a grade from 0 - 100 (-99 to stop). ");
		numba = kb.nextInt();
		
		if (numba == -99)
			System.out.println("You have not entered any grades. Run the program again to enter a grade. ");

		while (numba != -99)
		{
			count++;
			grade += numba;
			System.out.print("Enter a grade from 0 - 100 (-99 to stop). ");
			numba = kb.nextInt();
			
			if (numba < 0 && numba != -99 || numba > 100 && numba != -99)
			{
				System.out.print("Sorry that is not a number from 0 - 100 please try again. ");
				numba = kb.nextInt();
			}

		}

		if (count > 0)
		{
			avg = grade / count;

			System.out.println("You have entered " + count + " grades.");
			System.out.print("The average for those " + count + " grades is " + avg + ".");
		}

	 }
}