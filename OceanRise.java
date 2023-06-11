/**
 * --------------------------------------------------------------------------------------------
 * File Name: OceanRise.java
 * Project Name: Ocean Level Measurement
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Date created: Oct. 27, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 27, 2020
 * --------------------------------------------------------------------------------------------
 */

/**
 * Class Name: Scanner <br>
 * Class Purpose: The scanner class of Java. Gives the program access to objects that can read user input. <br>
 *
 * <hr>
 * Date created: Oct. 27, 2020 <br>
 * Date last modified: Oct. 27, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/**
 * Class Name: OceanRise <br>
 * Class Purpose: The main class of the program. It takes user input and displays the amount ocean levels have risen to the console window. <br>
 *
 * <hr>
 * Date created: Oct. 27, 2020 <br>
 * Date last modified: Oct. 27, 2020
 * @Calen Cummings
 */
public class OceanRise
{
	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It holds user input and calculates the rise in ocean level for each year. <br>
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
		double rise;	// Holds the constant value for the rise in ocean level
		int years;	// Holds user input for calculations
		Scanner kb = new Scanner(System.in);	// To read input
		
		System.out.print("How many years do you wish to see displayed? ");
		years = kb.nextInt();

		for (int count = 1; count <= years; count++)
		{
			rise = count * 1.6;
			if (years < 1 || years > 100)
			{
				System.out.print("Please enter a correct number between 1 and 100. ");
				years = kb.nextInt();
			}

			System.out.println("After " + count + " years, the ocean has risen " + rise + " millimeters. ");

		}
	 }
}