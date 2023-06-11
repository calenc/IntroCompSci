/**
 * ----------------------------------------------------------------------------------------
 * File Name: EnergyDrink.java
 * Project Name: EnergyDrinkConsumption
 * ----------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Creation Date: Oct. 11, 2020
 * Last modified: Calen Cummings Oct. 11, 2020 cummingscc@etsu.edu
 * ----------------------------------------------------------------------------------------
 */

/**
 * Class Name: EnergyDrink<br>
 * Class Purpose: The main class. It records and divides a total to find percentages and displays those values in the console window<br>
 * 
 * <hr>
 * Date Created: Oct. 11, 2020<br>
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 11, 2020
 * @Calen Cummings
 */
public class EnergyDrink
{

	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It displays the calculated percentages.<br>
	 * 
	 * <hr>
	 * Date created: Oct. 11, 2020 <br>
	 * Last modified: Oct. 11, 2020 <br>
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
		int survey = 12467;	// This is the number of people surveyed
		double onePlus;		// This stores the 14% of people surveyed that buy more than one drink weekly
		double citrus;		// This stores the 64% of people surveyed that prefer citrus flavors

		onePlus = (int)(survey * 0.14);
		citrus = (int)(survey * 0.64);
		
		System.out.println("Of 12,467 customers surveyed, " + onePlus + " (or ~14%) purchased the drink at least once per week.");
		System.out.print("Of those 12,467, " + citrus + " preferred citrus flavors the most (roughly 64%).");

	 }
}