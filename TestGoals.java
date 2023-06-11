/**
 * --------------------------------------------------------------------------------------------
 * File Name: TestGoals.java
 * Project Name: Test Scores and Goals
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Creation Date: Oct. 17, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 17, 2020
 * --------------------------------------------------------------------------------------------
 */

/**
 * Class Name: Scanner <br>
 * Class Purpose: Unlocks the Scanner class of objects in Java so we can read input.<br>
 * 
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/** 
 * Class Name: TestGoals <br>
 * Class Purpose: The main class of the program. It stores data and makes evaluations to determine an average and a grade to display. <br>
 * 
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
public class TestGoals
{
	
	/** 
	 * Method Name: main <br>
	 * Method Purpose: The main method. It calculates an average from input and displays a grade. <br>
	 * 
	 * <hr>
	 * Date Created: Oct. 17, 2020 <br>
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
	 	int test1;	// Stores the first test grade
		int test2;	// Stores the second grade
		int test3;	// Stores the third grade
		int avg;	// Stores the average grade from the three tests
		Scanner kb = new Scanner(System.in);	// Allows the program to read user input and store it as variables
		
		System.out.print("What is your Test 1 score? ");
		test1 = kb.nextInt();

		System.out.print("What is your Test 2 score? ");
		test2 = kb.nextInt();
	
		System.out.print("What is your Test 3 score? ");
		test3 = kb.nextInt();

		avg = (test1 + test2 + test3) / 3;
		
		if (avg >= 90)
			System.out.print("With an average of " + avg + ", you have an A test score average.");
		else if (avg >= 80 && avg <= 89)
			System.out.print("With an average of " + avg + ", you have a B test score average.");
		else if (avg >= 70 && avg <= 79)
			System.out.print("With an average of " + avg + ", you have a C test score average.");	
		else if (avg >= 60 && avg <=69)
			System.out.print("With an average of " + avg + ", you have a D test score average.");
		else
			System.out.print("With an average of " + avg + ", you have an F test score average.");
	 }
}