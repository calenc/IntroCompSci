/**
 * --------------------------------------------------------------------------------------------
 * File Name: Factorial.java
 * Project Name: Factorial Calculator
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Date created: Oct. 26, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 26, 2020
 * --------------------------------------------------------------------------------------------
 */

/**
 * Class Name: Scanner <br>
 * Class Purpose: The scanner class. Allows the program to access objects to read user input. <br>
 *
 * <hr>
 * Date created: Oct. 26, 2020 <br>
 * Date last modified: Oct. 26, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/**
 * Class Name: Factorial <br>
 * Class Purpose: The main class of the program. It takes user input and calculates the factorail value and formula to display in the console window. <br>
 *
 * <hr>
 * Date created: Oct. 26, 2020 <br>
 * Date last modified: Oct. 26, 2020
 * @Calen Cummings
 */
public class Factorial
{
	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It takes user input and calculates the factorial value to display. <br>
	 * 
	 * <hr>
	 * Date created: Oct. 26, 2020 <br>
	 * Date last modified: Oct. 26, 2020 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algortihms, and assumptions: N/A
	 * 
	 * <hr>
	 *   @param args array of Strings
	 *   @return void
	 */
	 public static void main(String[] args)
	 {
		int value;	// Holds the user input
		int count;	// Controls the number of iterations based on user input
		int factor;	// Holds the calculated factorial value
		Scanner kb = new Scanner(System.in);	// For reading input

		factor = 1;
		System.out.print("Please enter a nonnegative integer. ");
		value = kb.nextInt();

		while (value < 0)
		{
			System.out.println("Error! Please enter a nonnegative integer. Try again. ");
			value = kb.nextInt();
		}
		
		for (count = 1; count <= value; count++)
		{
			System.out.print(count);
			
			if (count < value)
				System.out.print(" X ");
			else if (count == value)
				System.out.println();

			factor *= count;

		}

		System.out.println("For " + value + ", the factorial value is " + factor + ".");


	 }
}	