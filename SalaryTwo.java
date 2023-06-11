/**
 * --------------------------------------------------------------------------------------
 * File Name: SalaryTwo.java
 * Project Name: Double Salary Calculator
 * --------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Date created: Oct. 26, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 25, 2020
 * --------------------------------------------------------------------------------------
 */

/** 
 * Class Name: Scanner <br>
 * Class Purpose: The scanner class of Java. It allows the program to create objects to read input. <br>
 *
 * <hr>
 * Date created: Oct. 26, 2020 <br>
 * Date last modified: Oct. 26, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/**
 * Class Name: SalaryTwo <br>
 * Class Purpose: The main class of the program. It takes user input and calculates the data through a function to display a value in the console window. <br>
 *
 * <hr>
 * Date created: Oct. 26, 2020 <br>
 * Date last modified: Oct. 26, 2020
 * @Calen Cummings
 */
public class SalaryTwo
{
	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It holds user input and calculates a final total to display. <br>
	 * 
	 * <hr>
	 * Date created: Oct. 26, 2020 <br>
	 * Date last modified: Oct. 26, 2020 <br>
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
		int days;	// Stores the number of iterations desired by the user
		double money;	// Stores the function for determining on-the-day salary
		int count;	// Keeps track of the current day for calculations
		double bucks;	// Accumulator
		Scanner kb = new Scanner(System.in);	// To read input

		System.out.println("How many days do you wish to calculate for? ");
		days = kb.nextInt();

		bucks = 0.0;

		for (count = 1; count <= days; count++)
		{
			money = 0.01 * Math.pow(2, count) / 2;
			System.out.println("On day " + count + ", you earned $" + money + ". ");
			bucks += money;
			System.out.println("By day " + count + ", you have totaled $" + bucks + " in salary. ");
		}
	 }
}