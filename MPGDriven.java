/** 
 * --------------------------------------------------------------------------------------------
 * File Name: MPGDriven.java
 * Project Name: MPGDriven
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingss@etsu.edu
 * Course-Section: CSCI1250-901
 * Creation Date: Oct. 5, 2020
 * Last Modified: Calen Cummings cummingscc@etsu.edu Oct.5, 2020
 * --------------------------------------------------------------------------------------------
 */

/**
 * Class Name: JOptionPane<br>
 * Class Pupose: The Java class that creates dialog boxes. It creates dialog boxes to accept input from the user<br>
 * 
 * <hr> 
 * Date created: Oct. 5, 2020<br>
 * Date last modified: Oct. 5, 2020
 * @Calen Cummings
 */
import javax.swing.JOptionPane;

/** 
 * Class Name: MPGDriven<br>
 * Class Purpose: The main class of the program. It displays the calculated miles per gallon from the miles driven and gas consumed to the console window<br>
 * 
 * <hr>
 * Date created: Oct. 5, 2020<br>
 * Date last modified: Oct. 5, 2020
 * @Calen Cummings
 */
public class MPGDriven
{
	
	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It displays the approximated miles per gallon
	 * 
	 * <hr>
	 * Date created: Oct. 5, 2020<br>
	 * Date last modified: Oct. 5, 2020<br>
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
		String inputString;	// This is to record input
		double miles;		// The amount of miles driven
		double gallons; 	// The amount of gallons consumed
		double mpg;		// The average miles driven per gallon of gas consumed
		
		inputString = JOptionPane.showInputDialog("How many miles have you driven?");
		
		miles = Double.parseDouble(inputString);

		inputString = JOptionPane.showInputDialog("How many gallons of gas have you used?");

		gallons = Double.parseDouble(inputString);

		mpg = miles / gallons;

		JOptionPane.showMessageDialog(null, "Your trip has a mileage of " + mpg + " miles per gallon.");

		System.exit(0);

	 }
}