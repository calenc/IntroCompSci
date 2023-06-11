/**
 * ------------------------------------------------------------------------------------
 * File Name: CalorieTime.java
 * Project Name: Calories Burned Per Minute
 * ------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Date created: Oct. 25, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 25, 2020
 * ------------------------------------------------------------------------------------
 */

/** 
 * Class Name: Scanner <br>
 * Class Purpose: The scanner class of Java. Allows access to objects that allow the program to read and store user input. <br>
 *
 * <hr>
 * Date Created: Oct. 25, 2020 <br>
 * Date last modified: Oct. 25, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/**
 * Class Name: CalorieTime <br>
 * Class Purpose: The main class of the program. It holds user input within a certain field and calculates calories burned, displaying the value in the console window. <br>
 *
 * <hr>
 * Date Created: Oct. 25, 2020 <br>
 * Date last modified: Oct. 25, 2020
 * @Calen Cummings
 */
public class CalorieTime
{
	
	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It stores input and calculates calories burned off. <br>
	 * 
	 * <hr>
	 * Date created: Oct. 25, 2020 <br>
	 * Date last modified: Oct. 25, 2020 <br>
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
		double time;	// The amount of time on the treadmill
		double burn;	// The amount of calories burned
		Scanner kb = new Scanner(System.in);	// This reads input
		
		System.out.print("How many minutes were you on the treadmill for? ");
		time = kb.nextDouble();

		while (time <= 1 || time >= 30)
		{
			System.out.print("Please select a value between 1 and 30. Try again. ");
			time = kb.nextDouble();
		}

		if (time >= 1 && time <= 30)
		{
			burn = 4.2 * time;
			System.out.print("After " + time + " minutes, you burned " + burn + " calories. ");
		}
	 }
}

		