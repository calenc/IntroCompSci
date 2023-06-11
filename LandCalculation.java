/**
 * -----------------------------------------------------------------------------------------
 * File Name: LandCalculation.java
 * Project Name: LandCalculation
 * -----------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Creation Date: Sept. 25, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Sept. 25, 2020
 * -----------------------------------------------------------------------------------------
 */


/**
 * Class Name: LandCalculation<br>
 * Class Purpose: The main class of the program. It displays the land calculation value in the console window<br>
 * 
 * <hr>
 * Date created: Sept. 25, 2020<br>
 * Date last modified: Sept. 25, 2020
 * @author Calen Cummings
 */
public class LandCalculation
{

	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It displays the land calculation value.<br>
	 *
	 * <hr>
	 * Date created: Sept. 25, 2020
	 * Date last modified: Sept. 25, 2020
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
		double land = 389767.0;
		double acre;
		double size;

		acre = 43560.0;
		size = land / acre;

		System.out.println(size);
	 }
}