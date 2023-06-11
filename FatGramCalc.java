/**
 * --------------------------------------------------------------------------------------------
 * File Name: FatGramCalc.java
 * Project Name: Fat Gram Calculator
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Creation Date: Oct. 17, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 17, 2020
 * --------------------------------------------------------------------------------------------
 */

/** 
 * Class Name: Scanner <br>
 * Class Purpose: This imports the Scanner class in Java and gives our program access to tools to read input from the user. <br>
 * 
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/** 
 * Class Name: FatGramCalc <br>
 * Class Purpose: The main class of the program. It takes user input and operates on it to calculate a percentage value to display in the console window. <br>
 * 
 * <hr>
 * Date Created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020 
 * @Calen Cummings
 */
public class FatGramCalc
{
	
	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It stores input and operates on it to find a percentage to display. <br>
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
		double calories;	// This stores the user calories and is used for operations
		double fgrams;		// This stores the user fat grams and is used for operations
		double fatperc;		// This stores the percentage of fat grams based on total calories
		double cfg;		// This stores the calories derived from fat in the food
		Scanner kb = new Scanner(System.in);	// This allows the program to read user input
		
		System.out.print("How many calories does your food item have? ");
		calories = kb.nextDouble();

		System.out.print("How many fat grams are in the item? ");
		fgrams = kb.nextDouble();

		cfg = fgrams * 9;
		fatperc = (cfg / calories) * 100;

		if (cfg > calories)
			System.out.print("Error! Calories from fat cannot be greater than total calories.");

		if (fatperc <= 100)
			System.out.print("Based on these calories and fat grams, your food has a calorie-from-fat percentage of " + fatperc + "%.");

		if (fatperc < 30)
			System.out.print(" Your food has a fat percentage below 30%, meaning it is low in fat!");

	 }
} 