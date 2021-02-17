import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Welcome From Guessing Game");

		System.out.println("Guess Secret Number");

		Scanner input = new Scanner(System.in);
		while (true)
		{
			System.out.print("Enter a number: ");
			double userInput = input.nextDouble();

			checkData(userInput);
		}
	}

	private static void checkData(double userInput)
	{
		double secretNumber = 30;
		if (userInput > secretNumber)
		{
			System.out.println("Number is too high.");
			System.out.println("Try Again!");
		}
		else if (userInput < secretNumber)
		{
			System.out.println("Number is Too Low");
			System.out.println("Try Again!");
		}else{
			System.out.println("You Win");
		}
	}
}
