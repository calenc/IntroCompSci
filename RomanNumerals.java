/**
 * -----------------------------------------------------------------------------------------
 * File Name: RomanNumerals.java
 * Project Name: RomanNumerals
 * -----------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Creation Date: Oct. 16, 2020
 * Last modified: Calen Cummings Oct. 16, 2020 cummingscc@etsu.edu
 * -----------------------------------------------------------------------------------------
 */

/**
 * Class Name: JOptionPane <br>
 * Class Purpose: This imports the Java class that creates dialog boxes and displays them on the console window.<br>
 * 
 * <hr>
 * Date created: Oct. 16, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 16, 2020
 * @Calen Cummings
 */
import javax.swing.JOptionPane;

/**
 * Class Name: RomanNumerals <br>
 * Class Purpose: The main class of the program. It converts integers to Roman numerals and displays them in the console window.<br>
 * 
 * <hr> 
 * Date created: Oct. 16, 2020<br>
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 16, 2020
 * @Calen Cummings 
 */
public class RomanNumerals
{
	/**
	 * Method Name: main <br>
	 * Method purpose: The main method. It converts integers and displays them as Roman numerals.<br>
	 *
	 * <hr>
	 * Date created: Oct. 16, 2020 <br>
	 * Last modified: Oct. 16, 2020 <br>
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
		String input;	// To hold user input
		int number;	// To hold the user-entered integer
		
		input = JOptionPane.showInputDialog("Pick an integer between 1 and 10.");

		number = Integer.parseInt(input);
		
		switch (number)
		{
			case 1:
				JOptionPane.showMessageDialog(null, "The Romans wrote this number as I.");
				break;

			case 2:
				JOptionPane.showMessageDialog(null, "The Romans wrote this number as II.");
				break;

			case 3: 
				JOptionPane.showMessageDialog(null, "The Romans wrote this number as III.");
				break;

			case 4:
				JOptionPane.showMessageDialog(null, "The Romans wrote this number as IV.");
				break;

			case 5: 
				JOptionPane.showMessageDialog(null, "The Romans wrote this number as V.");
				break;

			case 6: 
				JOptionPane.showMessageDialog(null, "The Romans wrote this number as VI.");
				break;

			case 7:
				JOptionPane.showMessageDialog(null, "The Romans wrote this number as VII.");
				break;

			case 8: 
				JOptionPane.showMessageDialog(null, "The Romans wrote this number as VIII.");
				break;

			case 9: 
				JOptionPane.showMessageDialog(null, "The Romans wrote this number as IX.");
				break;

			case 10:
				JOptionPane.showMessageDialog(null, "The Romans wrote this number as X.");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Error! Please enter a valid number.");
				break;
		
			}
	}
}