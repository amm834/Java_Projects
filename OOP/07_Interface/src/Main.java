
public class Main
{
	public static void main(String[] args)
	{
		Car car = new Car(); // Machine car = new Car();
		Bicycle bicycle = new Bicycle();
		doIt(car);
		doIt(bicycle);
	}

	public static void doIt(Machine mac)
	{
		mac.start();
		mac.stop();
	}
}
