/**
 * --------------------------------------------------------------------------------------------
 * File Name: TimeCalc.java
 * Project Name: Time Calculator
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Creation Date: Oct. 17, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 17, 2020
 * --------------------------------------------------------------------------------------------
 */

/** 
 * Class Name: Scanner <br>
 * Class Purpose: This unlocks the Scanner objects in Java, allowing the program to read and store user input.<br>
 *
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/** 
 * Class Name: TimeCalc <br>
 * Class Purpose: The main class of the program. It records user input and calculates how many days/hours are equivalent to the input. <br>
 * 
 * <hr>
 * Date created: Oct. 17, 2020
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
public class TimeCalc
{

	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It calculates and displays the conversions for seconds. <br>
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
		double seconds;		// Stores the user input for seconds
		Scanner kb = new Scanner(System.in);	// Allows the program to read and store user input from the keyboard
		double minute; 		// Stores the value of seconds in minutes
		double hour;		// Stores the value of seconds in hours
		double day; 		// Stores the value of seconds in days
		
		System.out.print("Enter any amount of seconds. ");
		seconds = kb.nextDouble();

		minute = seconds / 60;
		hour = seconds / 3600;
		day = seconds / 86400;

		if (seconds >= 60 && seconds < 3600)
			System.out.printf("That is equal to %.2f minutes.", minute);
		else if (seconds >= 3600 && seconds < 86400)
			System.out.printf("That is equal to %.2f hours.", hour);
		else if (seconds >= 86400)
			System.out.printf("That is equal to %.2f days.", day);
		else
			System.out.print("That is " + seconds + " seconds.");
		
	 }
}