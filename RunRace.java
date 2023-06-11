/**
 * -----------------------------------------------------------------------------------------
 * File Name: RunRace.java
 * Project Name: Running the Race
 * -----------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Date Created: Oct. 17, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 17, 2020
 * -----------------------------------------------------------------------------------------
 */

/**
 * Class Name: Scanner <br>
 * Class Purpose: This imports the Scanner class of Java into the program, allowing the program to create objects to read and store user input <br>
 *
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/**
 * Class Name: RunRace <br>
 * Class Purpose: The main class of the program. It stores runner names and times and displays them in order to the console window. <br>
 *
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
public class RunRace
{

	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It stores names and displays them in order with their times. <br>
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
		String run1;	// Stores the name of the first runner
		String run2;	// Stores the name of the second runner
		String run3;	// Stores the name of the third runner
		double time1;	// Stores the run time of the first runner
		double time2;	// Stores the run time of the second runner
		double time3;	// Stores the run time of the third runner
		Scanner kb = new Scanner(System.in);	// Creates an object to allow the program to read keyboard input
		
		System.out.print("What is the first runner's name? ");
		run1 = kb.nextLine();

		System.out.print("What is the second runner's name? ");
		run2 = kb.nextLine();

		System.out.print("What is the third runner's name? ");
		run3 = kb.nextLine();

		System.out.print("What is " + run1 + "'s time, in minutes? ");
		time1 = kb.nextDouble();

		System.out.print("What is " + run2 + "'s time, in minutes? ");
		time2 = kb.nextDouble();

		System.out.print("What is " + run3 + "'s time, in minutes? ");
		time3 = kb.nextDouble();

		if (time1 < time2 && time2 < time3)
			System.out.print("The runners finished as follows: " + run1 + ", " + run2 + ", " + run3 + ".");

		else if (time1 < time3 && time3 < time2)
			System.out.print("The runners finished as follows: " + run1 + ", " + run3 + ", " + run2 + ".");

		else if (time2 < time1 && time1 < time3)
			System.out.print("The runners finished as follows: " + run2 + ", " + run1 + ", " + run3 + ".");

		else if (time2 < time3 && time3 < time1)
			System.out.print("The runners finished as follows: " + run2 + ", " + run3 + ", " + run1 + ".");

		else if (time3 < time1 && time1 < time2)
			System.out.print("The runners finished as follows: " + run3 + ", " + run1 + ", " + run2 + ".");
		
		else if (time3 < time2 && time2 < time1)
			System.out.print("The runners finished as follows: " + run3 + ", " + run2 + ", " + run1 + ".");

		else if (time1 == time2 || time1 == time3 || time2 == time3)
			System.out.print("Please enter different times for each runner.");

	 }
}