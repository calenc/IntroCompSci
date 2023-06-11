/** 
 * -----------------------------------------------------------------------------------------
 * File name: NameandInitials.java
 * Project name: NameandInitials
 * -----------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Creation Date: Sept. 25, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Sept. 25, 2020
 * -----------------------------------------------------------------------------------------
 */


/**
 * Class Name: NameandInitials<br>
 * Class Purpose: The main class of the program. It displays the name and initials to the
 * console window<br>
 *
 * <hr>
 * Date created: Sept. 25, 2020
 * Date last modified: Sept. 25, 2020
 * @author Calen Cummings
 */
public class NameandInitials
{

	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It displays the name and initials. <br>
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
	 	String firstName;
	 	String middleName;
	 	String lastName;
		char firstInitial;
		char middleInitial;
		char lastInitial;
	 	
	 	firstName = "Calen";
	 	middleName = "Charles";
	 	lastName = "Cummings";
		firstInitial = 'C';
		middleInitial = 'C';
		lastInitial = 'C';
		
		System.out.println("My full name is " + firstName + " " + middleName + " " + lastName + ".");
		System.out.print("My initials are " + firstInitial + middleInitial + lastInitial + ".");
	
	}
}
	 