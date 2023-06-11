/**
 * ----------------------------------------------------------------------------------------
 * File Name: PosiSum.java
 * Project Name: Positive Integer Sum
 * ----------------------------------------------------------------------------------------
 * Author's Name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Date created: Oct. 26, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 26, 2020
 * ----------------------------------------------------------------------------------------
 */

/**
 * Class Name: Scanner <br>
 * Class Purpose: The scanner class of Java. It allows the program to create objects to read and hold user input. <br>
 *
 * <hr>
 * Date Created: Oct. 26, 2020 <br>
 * Date last modified: Oct. 26, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/**
 * Class Name: PosiSum <br>
 * Class Purpose: The main class of the program. It holds user input and calculates a running total of positive integers to display in the console window. <br>
 *
 * <hr>
 * Date created: Oct. 26, 2020 <br>
 * Date last modified: Oct. 26, 2020
 * @Calen Cummings
 */
public class PosiSum
{
	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It holds user input to create a running total. <br>
	 *
	 * <hr>
	 * Date created: Oct. 26, 2020 <br>
	 * Date last modified: Oct. 26, 2020 <br>
	 *
	 * <hr>
	 *   @param args array of Strings 
	 *   @return void
	 */
	 public static void main(String[] args)
	 {
		double entry;	// Holds the value for user input
		double sumP;	// Accumulator
		Scanner kb = new Scanner(System.in);	// To read input

		sumP = 0.0;
	
		System.out.print("Choose any positive number to add to the series, or choose a negative number to quit. ");
		entry = kb.nextDouble();

		while (entry > 0)
		{
			sumP += entry;
			System.out.print("Choose another number to add to the series, or enter a negative number to stop. ");
			entry = kb.nextDouble();
		}

		System.out.printf("The total sum for this series is %.2f.", sumP);
	 }
}