/**
 * --------------------------------------------------------------------------------------------
 * File Name: SpeedSound.java
 * Project Name: The Speed of Sound
 * --------------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Date Created: Oct. 17, 2020
 * Last modified: Calen Cummings cummingscc@etsu.edu Oct. 17, 2020
 * --------------------------------------------------------------------------------------------
 */

/**
 * Class Name: Scanner <br>
 * Class Purpose: This imports the Scanner class of objects into the program, allowing it to read and store user input. <br>
 *
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
import java.util.Scanner;

/**
 * Class Name: SpeedSound <br>
 * Class Purpose: The main class of the program. It takes user input and displays calculations in the console window. <br>
 *
 * <hr>
 * Date created: Oct. 17, 2020 <br>
 * Date last modified: Oct. 17, 2020
 * @Calen Cummings
 */
public class SpeedSound
{

	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It holds user input and performs calculations. <br>
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
		double distance;	// Stores the distance input by the user
		double airTime;		// Stores the calculation for sound waves traveling through air
		double waterTime;	// Stores the calculation for sound waves traveling through water
		double steelTime;	// Stores the calculation for sound waves traveling through steel
		String type;		// Stores the type of medium selected by the user
		Scanner kb = new Scanner(System.in);	// Allows the program to read and store input 

		System.out.print("Please enter either air, steel, or water. ");
		type = kb.nextLine();

		System.out.print("How far will your sound wave travel in the medium, in feet? ");
		distance = kb.nextDouble();

		airTime = distance / 1100;
		waterTime = distance / 4900;
		steelTime = distance / 16400;

		switch (type)
		{
			case "air":
				System.out.printf("It will take %.2f seconds for the sound to travel that far in the air.", airTime);
				break;
			
			case "steel":
				System.out.printf("It will take %.2f seconds for the sound to travel that far through steel.", steelTime);
				break;

			case "water":
				System.out.printf("It will take %.2f seconds for the sound to travel that far through water.", waterTime);
				break;
	
			default:
				System.out.print("Error! Please choose one of the mediums as shown, no changes in case or spelling.");
				break;

		}
	}
}