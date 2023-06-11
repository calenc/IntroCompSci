/**
 * ------------------------------------------------------------------------------------------
 * File Name: InternetSP.java
 * Project Name: Internet Service Provider
 * ------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Date Created: Oct. 17, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 17, 2020
 * ------------------------------------------------------------------------------------------
 */

/**
 * Class Name: Scanner <br>
 * Class Purpose: This imports the Scanner class of objects into the program and allows it to read and store user input. <br>
 *
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/**
 * Class Name: InternetSP <br>
 * Class Purpose: The main class of the program. It takes user input and determines how much they are paying and displays it in the console window. <br>
 * 
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
public class InternetSP
{

	/**
	 * Method Name: main <br> 
	 * Method Purpose: The main method. It holds user input and calculates monthly totals. <br>
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
		double hours;	// Stores the user's input for hours of service used
		String pkg;	// Stores the type of service package
		double flatA;	// Stores the flat rate for package A
		double flatB;	// Stores the flat rate for package B
		double flatC;	// Stores the flat rate for package C
		double extraA; 	// Stores the cost of additional service hours for package A
		double extraB;	// Stores the cost of additional service hours for package B
		Scanner kb = new Scanner(System.in);	// Allows the program to read user input

		System.out.print("What service package do you have: A, B, or C? ");
		pkg = kb.nextLine();

		System.out.print("How many hours of service did you use? ");
		hours = kb.nextDouble();

		flatA = 9.95;
		flatB = 13.95;
		flatC = 19.95;
		extraA = 2 * (hours - 10);
		extraB = 1 * (hours - 20);

		switch (pkg)
		{
			case "A":
				if (hours > 10)
					System.out.print("With this plan and these hours, you spend $" + (flatA + extraA) + " per month.");
				else	
					System.out.print("With this plan, you spend $" + flatA + " per month.");
				break;

			case "B": 
				if (hours > 20)
					System.out.print("With this plan and these hours, you spend $" + (flatB + extraB) + " per month.");
				else
					System.out.print("With this plan, you spend $" + flatB + " per month.");
				break;

			case "C":
				System.out.print("With this plan, you spend $" + flatC + " per month regardless of hours used.");
				break;

			default: 
				System.out.print("Error! Please enter one of the valid service packages.");

		}
	}
}