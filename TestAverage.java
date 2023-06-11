/**
 * --------------------------------------------------------------------------------------------
 * File Name: TestAverage.java
 * Project Name: TestAverage
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Creation Date: Oct. 5, 2020
 * Last modified: Calen Cummings Oct. 5, 2020 cummingscc@etsu.edu
 * --------------------------------------------------------------------------------------------
 */

/**
 * Class Name: JOptionPane<br>
 * Class Purpose: The class that creates dialog boxes. It will display dialog boxes that receive input in the console window.<br>
 * 
 * <hr>
 * Date created: Oct. 5, 2020<br>
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 5, 2020
 * @Calen Cummings
 */
import javax.swing.JOptionPane;

/**
 * Class Name: TestAverage<br>
 * Class Purpose: The main class of the program. It displays test scores and averages in the console window.<br>
 * 
 * <hr>
 * Date created: Oct. 5, 2020<br>
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 5, 2020
 * @Calen Cummings
 */
public class TestAverage
{
	
	/** 
	 * Method Name: main <br>
	 * Method Purpose: The main method. It displays test scores and averages<br>
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
		String inputString;	// This reads input
		int test1;		// This will hold the value of test score 1
		int test2;		// This will hold the value of test score 2
		int test3;		// This will hold the value of test score 3
		int avg;		// This will hold the average value of the test scores

		inputString = JOptionPane.showInputDialog("What is your Test 1 score?");
		
		test1 = Integer.parseInt(inputString);

		inputString = JOptionPane.showInputDialog("What is your Test 2 score?");

		test2 = Integer.parseInt(inputString);

		inputString = JOptionPane.showInputDialog("What is your Test 3 score?");
	
		test3 = Integer.parseInt(inputString);

		avg = (test1 + test2 + test3) / 3;

		JOptionPane.showMessageDialog(null, "With these test scores, your test average is " + avg + ".");

		System.exit(0);

	 }
}
