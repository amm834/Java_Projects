import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	System.out.println("Input Mile");
	Scanner sc = new Scanner(System.in);
	double mile = sc.nextDouble();
	double result = covertMileToKiloMeter(mile);
	System.out.println("Mile " + mile + " is " + result + " km");
	}

	public static double covertMileToKiloMeter(double mile)
	{
		return mile * 1.60934;
	}

	
}
