/**
 * --------------------------------------------------------------------------------------------
 * File Name: SoftwareSales.java
 * Project Name: Software Sales
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Creation Date: Oct. 17, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 17, 2020
 * --------------------------------------------------------------------------------------------
 */

/**
 * Class Name: Scanner <br>
 * Class Purpose: This imports the Scanner objects of Java into the program, allowing it to read and store user input. <br>
 * 
 * <hr>
 * Date Created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020 <br>
 * @Calen Cummings
 */
import java.util.Scanner;

/**
 * Class Name: SoftwareSales <br>
 * Class Purpose: The main class of the program. It holds input and calculates a discount and price to be displayed in the console window. <br>
 * 
 * <hr>
 * Date Created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
public class SoftwareSales
{
	
	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It calculates prices based on input and a discount. <br>
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
		double disc1;	// Holds the first discount percentage
		double disc2;	// Holds the second discount percentage
		double disc3; 	// Holds the third discount percentage
		double disc4;	// Holds the fourth discount percentage
		int quant;	// Holds the amount of packages purchased
		int amount;	// Holds the total cost of the purchase
		Scanner kb = new Scanner(System.in);	// Creates a scanner object to read the keyboard

		System.out.print("How many software packages did you purchase? ");
		quant = kb.nextInt();

		disc1 = 0.2;
		disc2 = 0.3;
		disc3 = 0.4;
		disc4 = 0.5;
		amount = 99 * quant;

		if (quant < 10)
			System.out.print("Your total purchase was $" + amount + " and you did not receive a discount.");

		else if (quant >= 10 && quant <= 19)
			System.out.print("Your total purchase was $" + amount * disc1 + " and you received a 20% discount!");

		else if (quant >= 20 && quant <= 49)
			System.out.print("Your total purchase was $" + amount * disc2 + " and you received a 30% discount!");

		else if (quant >= 50 && quant <= 99)
			System.out.print("Your total purchase was $" + amount * disc3 + " and you received a 40% discount!");

		else
			System.out.print("Your total purchase was $" + amount * disc4 + " and you received a 50% discount!");
	 }
}		
		