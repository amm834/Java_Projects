
public class Main
{
	public static void main(String[] args)
	{
		// machine obj
		Machine mac1 = new Machine();
//		mac1.start();
//		mac1.stop();
		
		// car obj
		Car car1 = new Car();
//		car1.start();
//		car1.stop();
//		car1.changeGear();
		
		// up casting
		Machine mac2 = car1;
		mac2.start();
		mac2.stop();
		
		// down casting
//		Car car2 = (Car)mac1;
		Car car2 = (Car)mac2;
		car2.start();
		car2.stop();
		car2.changeGear();
		
		
	}
}
