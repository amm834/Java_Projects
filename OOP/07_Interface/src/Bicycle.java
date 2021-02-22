public class Bicycle implements Machine
{

	@Override
	public void start()
	{
		System.out.println("Bicycle is riding.");
	}

	@Override
	public void stop()
	{
		System.out.println("Bicycle is stopped.");
	}
	
}
