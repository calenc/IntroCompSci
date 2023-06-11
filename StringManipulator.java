/**
 * -------------------------------------------------------------------------------------------
 * File Name: StringManipulator.java
 * Project Name: StringManipulator
 * -------------------------------------------------------------------------------------------
 * Author's Name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI 1250-901
 * Creation Date: Oct. 10, 2020
 * Last Modified: Calen Cummings Oct. 10, 2020 cummingscc@etsu.edu
 * -------------------------------------------------------------------------------------------
 */

/** 
 * Class Name: JOptionPane<br>
 * Class Purpose: This imports the class of dialog boxes in Java. These are used to display questions for user input.<br>
 * 
 * <hr>
 * Date Created: Oct. 10, 2020 <br>
 * Last Modified: Calen Cummings cummingscc@etsu.edu Oct. 10, 2020
 * @Calen Cummings
 */
import javax.swing.JOptionPane;

/** 
 * Class Name: StringManipulator<br>
 * Class Purpose: The main class of the program. Holds input and displays answers in the console window.<br>
 *
 * <hr> 
 * Date Created: Oct. 10, 2020<br>
 * Last Modified: Calen Cummings cummingscc@etsu.edu Oct. 10, 2020
 * @Calen Cummings
 */
public class StringManipulator
{
	
	/**
	 * Method Name: main <br>
	 * Method purpose: The main method. Stores input as strings and displays answers to questions in a dialog box. <br>
	 * 
	 * <hr>
	 * Date created: Oct. 10, 2020<br>
	 * Date last modified: Oct. 10, 2020<br>
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
		String favorite;	// Stores the name of the favorite city
		char first; 		// Stores the first letter of the city name
		int count; 		// Stores the number of letters in the city name
		String small;		// Stores the lowercase version of the city name
		String big;		// Stores the capital version of the city name

		favorite = JOptionPane.showInputDialog("What is your favorite city?" );

		first = favorite.charAt(0);
		count = favorite.length();
		small = favorite.toLowerCase();
		big = favorite.toUpperCase();

		JOptionPane.showMessageDialog(null, favorite + " starts with " + first + ".");
		JOptionPane.showMessageDialog(null, favorite + " has " + count + " letters in it.");
		JOptionPane.showMessageDialog(null, favorite + " can be written like this; " + small + "; or this; " + big + ".");

		System.exit(0);

	 }
}
		
		 
		