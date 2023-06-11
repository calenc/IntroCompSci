/**
 * ---------------------------------------------------------------------------------------
 * File Name: MonthMoney.java
 * Project Name: Monthly Salary Loop
 * ---------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Date created: Oct. 26, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 26, 2020
 * ---------------------------------------------------------------------------------------
 */

/**
 * Class Name: Scanner <br>
 * Class Purpose: The scanner class of Java. Imports objects to read and store input. <br>
 * 
 * <hr>
 * Date Created: Oct. 26, 2020 <br>
 * Date last modified: Oct. 25, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/** 
 * Class Name: MonthMoney <br>
 * Class Purpose: The main class of the program. It takes user input and calculates a running total to display in the console window. <br>
 * 
 * <hr> 
 * Date created: Oct. 26, 2020 <br>
 * Date last modified: Oct. 26, 2020
 * @Calen Cummings
 */
public class MonthMoney
{
	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It holds input and calculates a running total to display. <br>
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
		int money;	// Accumulator
		int bucks;	// Holds the user budget
		int exp;	// Holds the expenses value
		int save;	// Holds the final budget after expenses
		Scanner kb = new Scanner(System.in);	// For reading input

		money = 0;

		System.out.print("Enter how much money you have budgeted for the month. ");
		bucks = kb.nextInt();

		do
		{
			System.out.println("Enter a monthly expense. (Or enter -1 to stop) ");
			exp = kb.nextInt();
			money += exp;
			
		} while (exp != -1);

		save = bucks - money;

		if (save > 0)
			System.out.print("With these expenses, you are under budget with $" + save + " left over. ");
		else
			System.out.print("With these expenses, you are over budget with $" + save + " left over. ");

	 }
}