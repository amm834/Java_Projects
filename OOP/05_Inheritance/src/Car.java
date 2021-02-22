public class Car extends Machine
{

	@Override
	public void start()
	{
		System.out.println("Car started.");
	}

	
	public void changeGear(){
		System.out.println("Gear Changed.");
	}
}
