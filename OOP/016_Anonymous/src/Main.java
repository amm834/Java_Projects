
public class Main
{
	public static void main(String[] args)
	{
		Person std = new Student(); // up casting
		std.greet();
		Person person = new Person(){

			@Override
			public void greet()
			{
				System.out.println("Hello From Person");
			}
		};
		person.greet();

		Machine mac = new Machine(){

			@Override
			public void start()
			{
				System.out.println("Machine Start");
			}
			
		};
		mac.start();
	}
}
