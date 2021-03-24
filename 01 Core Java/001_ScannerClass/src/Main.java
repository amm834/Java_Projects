import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Type Your Name");
		String name = sc.nextLine();

		System.out.println("Type Your Age");
		//int age = sc.nextInt();
		String ageStr = sc.nextLine();
		// Parse String To Integer
		int age = Integer.parseInt(ageStr);

		System.out.println("Your name is " + name);
		System.out.println("Your age is " + age);
	}
}
