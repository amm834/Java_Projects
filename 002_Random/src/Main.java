import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	Random rand = new Random();
	int num1 = rand.nextInt();
	int num2 = rand.nextInt(7);//0->6
	System.out.println(num1);
	System.out.println(num2);
	}
}
