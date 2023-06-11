/**
 * --------------------------------------------------------------------------------------------
 * File Name: ShippingCharges.java
 * Project Name: Shipping Charges
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Date Created: Oct. 17, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 17, 2020
 * --------------------------------------------------------------------------------------------
 */

/**
 * Class Name: Scanner <br>
 * Class Purpose: This imports the Scanner class of objects in Java into the program, allowing the program to read and store user input. <br>
 * 
 * <hr> 
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/** 
 * Class Name: ShippingCharges <br>
 * Class Purpose: The main class of the program. It calculates shipping rates based on package weight and displays them in the console window. <br>
 *
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
public class ShippingCharges
{
	
	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It calculates shipping rates and displays them. <br>
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
		double rate1;	// Holds the value of the first shipping charge
		double rate2;	// Holds the value of the second shipping charge
		double rate3;	// Holds the value of the third shipping charge
		double rate4;	// Holds the value of the fourth shipping charge
		double weight;	// Holds the value of the user's input
		Scanner kb = new Scanner(System.in);	// Creates a scanner to read input from the keyboard

		System.out.print("What is the weight of your package? ");
		weight = kb.nextDouble();

		rate1 = 1.10;
		rate2 = 2.20;
		rate3 = 3.70;
		rate4 = 3.80;

		if (weight <= 2)
			System.out.print("Your package will cost $" + rate1 + " to ship for every 500 miles.");
		
		else if (weight > 2 && weight <= 6)
			System.out.print("Your package will cost $" + rate2 + " to ship for every 500 miles.");

		else if (weight > 6 && weight <= 10)
			System.out.print("Your package will cost $" + rate3 + " to ship for every 500 miles.");

		else
			System.out.print("Your package will cost $" + rate4 + " to ship for every 500 miles.");

	 }
}