import java.util.Scanner;
public class FinalGrade
{
	public static void main(String[] args)
	{
		int grade;
		Scanner kb;

		kb = new Scanner(System.in);
		System.out.println("What is your number grade? ");
		grade = kb.nextInt();

		switch (grade)
		{

			case (grade >= 90 && grade <= 100):
				System.out.println("A");
				break;
			case (grade >= 80 && grade < 90):
				System.out.println("B");
				break;
			case (grade >= 70 && grade < 80):
				System.out.println("C");
				break;
			case (grade >= 60 && grade < 70):
				System.out.println("D");
				break;
			case (grade >= 0 && grade < 60):
				System.out.println("F");
				break;
			default: 
			{
				System.out.println("Please enter a number between 0 and 100. Try again. ");
				grade = kb.nextInt();
			}
		}
	}
}