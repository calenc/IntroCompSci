/**
 * -----------------------------------------------------------------------------------------
 * File name: NameAgeAnnualIncome.java
 * Project name: NameAgeAnnualIncome
 * -----------------------------------------------------------------------------------------
 * Author's name and email: Calen Cummings cummingscc@etsu.edu
 * Course-Section: CSCI1250-901
 * Creation Date: Sept. 25, 2020
 * Last modified: Sept. 25, 2020
 * -----------------------------------------------------------------------------------------
 */


/**
 * Class Name: NameAgeAnnualIncome<br>
 * Class Purpose: The main class of the program. It displays the name, age, and annual 
 * income to the console window<br>
 *
 * <hr>
 * Date created: Sept. 25, 2020<br>
 * Last modified: Calen Cummings, cummingscc@etsu.edu, Sept. 25, 2020
 * @author Calen Cummings
 */
public class NameAgeAnnualIncome
{
	
	/**
	 * Method Name: main <br>
	 * Method Purpose: The main method. It displays the name, age, and income <br>
	 * 
	 * <hr>
	 * Date created: Sept. 25, 2020<br>
	 * Date last modified: Sept. 25, 2020<br>
	 * 
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 * 
	 * <hr>
	 *   @param args array of Strings (not used in this program)
	 *   @returns void
	 */
	 public static void main(String[] args)
	 {
	 	String name;
	 	int age;
	 	double annualPay;
	 	
		name = "Calen Cummings";
		age = 19;
		annualPay = 26000.0;

	 	System.out.println("My name is " + name + ", my age is " + age + " and");
	 	System.out.print("I hope to earn $" + annualPay + " per year.");
	 
	 }
}