/**
 * --------------------------------------------------------------------------------------------
 * File Name: CookieCalories.java
 * Project Name: CookieCalories
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu 
 * Course-Section: CSCI1250-901
 * Creation Date: Oct. 5, 2020
 * Last modified: Calen Cummings Oct. 5,2020 cummingscc@etsu.edu
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
 * Class Name: CookieCalories<br>
 * Class Purpose: The main class of the program. It calculates and displays the number of calories to the console window<br>
 * 
 * <hr>
 * Date Created: Oct. 5, 2020<br>
 * Date last modified: Oct. 5, 2020
 * @Calen Cummings
 */
public class CookieCalories
{
	/** 
	 * Method Name: main <br>
	 * Method Purpose: The main method. It calculates and displays the calorie amount. <br>
	 * 
	 * <hr>
	 * Date Created: Oct. 5, 2020<br>
	 * Date last modified: Oct. 5, 2020<br>
	 * 
	 * <hr> 
	 * Notes on specifications, special algorithms and assumptions: N/A
	 * 
	 * <hr> 
	 *   @param args array of Strings (not used in this program)
	 *   @returns void
	 */
	 public static void main(String[] args)
	 {
		String inputString;	// For reading input
		int cookies;		// The number of cookies eaten
		double calories;	// The number of calories based on cookies eaten
		
		inputString = JOptionPane.showInputDialog("How many cookies did you eat?");
		
		cookies = Integer.parseInt(inputString);
	
		calories = 75 * cookies;

		JOptionPane.showMessageDialog(null, "If you ate " + cookies + " cookies then you consumed " + calories + " calories.");

		System.exit(0);
	 }
}