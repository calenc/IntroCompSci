/**
 * --------------------------------------------------------------------------------------------
 * File Name: SortedNames.java
 * Project Name: Sorted Names
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Creation Date: Oct. 17, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 17, 2020
 * --------------------------------------------------------------------------------------------
 */

/** 
 * Class Name: Scanner <br>
 * Class Purpose: This imports access to the Scanner objects in Java so the program can read input from the user. <br>
 * 
 * <hr>
 * Date created: Oct. 17, 2020<br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/** 
 * Class Name: SortedNames <br>
 * Class Purpose: The main class of the program. It stores the names and lists them in descending order in the console window. <br>
 * 
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
public class SortedNames
{

	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It displays the names in descending order. <br>
	 *
	 * <hr>
	 * Date created: Oct. 17, 2020 <br>
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
		String name1;	// Holds the first name entered
		String name2;	// Holds the second name entered
		String name3;	// Holds the third name entered
		char f1;	// Holds the first letter of the first name
		char f2;	// Holds the first letter of the second name
		char f3;	// Holds the first letter of the third name
		Scanner kb = new Scanner(System.in);	// Creates a scanner object to read the keyboard

		System.out.print("Choose a random name. ");
		name1 = kb.nextLine();
		f1 = name1.charAt(0);

		System.out.print("Choose a second name. ");
		name2 = kb.nextLine();
		f2 = name2.charAt(0);

		System.out.print("Choose a third name. ");
		name3 = kb.nextLine();
		f3 = name3.charAt(0);

		if (f1 > 90 || f2 > 90 || f3 > 90)
			System.out.print("Please use capital letters when typing someone's name! Try again.");
		else if (f1 < f2 && f2 < f3)
		{
			System.out.println("Here are the names in order:");
			System.out.println(name1);
			System.out.println(name2);
			System.out.println(name3);
		}
		else if (f1 < f3 && f3 < f2)
		{
			System.out.println("Here are the names in order:");
			System.out.println(name1);
			System.out.println(name3);
			System.out.println(name2);
		}
		else if (f2 < f1 && f1 < f3)
		{
			System.out.println("Here are the names in order:");
			System.out.println(name2);
			System.out.println(name1);
			System.out.println(name3);
		}
		else if (f2 < f3 && f3 < f1)
		{
			System.out.println("Here are the names in order:");
			System.out.println(name2);
			System.out.println(name3);
			System.out.println(name1);
		}
		else if (f3 < f2 && f2 < f1)
		{
			System.out.println("Here are the names in order:");
			System.out.println(name3);
			System.out.println(name2);
			System.out.println(name1);
		}
		else if (f3 < f1 && f1 < f2)
		{
			System.out.println("Here are the names in order:");
			System.out.println(name3);
			System.out.println(name1);
			System.out.println(name2);
		}
		else if (f1 == f2 || f2 == f3 || f1 == f3)
			System.out.print("Please select names with different starting letters. ");
		else
			System.out.print("Please try again with names that start with different letters. ");

	 }
}