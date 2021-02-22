public class Car implements Machine
{

	@Override
	public void start()
	{
		System.out.println("Car start.");
	}

	@Override
	public void stop()
	{
		System.out.println("Car stop.");
	}
	
}
