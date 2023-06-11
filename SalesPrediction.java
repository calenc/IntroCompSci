/**
 * ----------------------------------------------------------------------------------------
 * File Name: SalesPrediction.java
 * Project Name: SalesPrediction
 * ----------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Creation Date: Sept. 25, 2020
 * Last Modified: Calen Cummings cummingscc@etsu.edu Sept. 25, 2020
 * ----------------------------------------------------------------------------------------
 */


/**
 * Class Name: SalesPrediction<br>
 * Class Purpose: The main class of the program. It displays the sales prediction value to the console window<br>
 *
 * <hr>
 * Date created: Sept. 25, 2020<br>
 * Date last modified: Sept. 25, 2020
 * @author Calen Cummings
 */
public class SalesPrediction
{

	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It displays the prediction value<br>
	 * 
	 * <hr>
	 * Date created: Sept. 25, 2020<br>
	 * Date last modified: Sept. 25, 2020<br>
	 * 
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 * 
	 * <hr>
	 *   @param args array of Strings (not used in this program)
	 *   @return void
	 */
	 public static void main(String[] args)
	 {
		double totalSales = 4600000.0;
		double eastSales;

		eastSales = totalSales * 0.62;

		System.out.println(eastSales);
	 }
}