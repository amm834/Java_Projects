
public class Main
{
	public static void main(String[] args)
	{
	
		Machine car = new Car();
		Machine motorcycle = new MotorCycle();
	
		car.start();
		car.stop();
		car.showInfo();
		motorcycle.start();
		motorcycle.stop();
	}
}
