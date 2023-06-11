/**
 * --------------------------------------------------------------------------------------------
 * File Name: BankCharges.java
 * Project Name: Bank Charges 
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Date created: Oct. 17, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 17, 2020
 * --------------------------------------------------------------------------------------------
 */

/** 
 * Class Name: Scanner <br>
 * Class Purpose: This imports the Scanner class of objects, allowing the program to read and store input from the user. <br>
 * 
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020 
 * @Calen Cummings
 */
import java.util.Scanner;

/**
 * Class Name: BankCharges <br>
 * Class Purpose: The main class of the program. It reads user input and determines the service fee for the month and displays it to the console window. <br>
 *
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
public class BankCharges
{

	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It holds user input and determines bank service fee totals. <br>
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
		double fee1;	// Holds the value for the first fee rate and range
		double fee2;	// Holds the value for the second fee rate and range
		double fee3;	// Holds the value for the third fee rate and range
		double fee4;	// Holds the value for the fourth fee rate and range
		int base;	// Stores the value of the base monthly fee
		int checks;	// Stores the amount of checks input by the user
		Scanner kb = new Scanner(System.in);	// Creates an object for the program to read user input

		System.out.print("How many checks did you write this month? ");
		checks = kb.nextInt();

		base = 10;
		fee1 = 0.10;
		fee2 = 0.08;
		fee3 = 0.06;
		fee4 = 0.04;

		if (checks < 20)
			System.out.print("Your service fee for the month is $" + ((checks * fee1) + base) + ".");

		else if (checks >= 20 && checks <= 39)
			System.out.print("Your service fee for the month is $" + ((checks * fee2) + base) + ".");

		else if (checks >= 40 && checks <= 59)
			System.out.print("Your service fee for the month is $" + ((checks * fee3) + base) + ".");

		else if (checks >= 60)
			System.out.print("Your service fee for the month is $" + ((checks * fee4) + base) + ".");

	 }
}