public class Person
{

//		 Polymorphism with Method Overloading

	public void showInfo()
	{
		System.out.println("Person");
	}
	
	public void showInfo(int id)
	{
		System.out.println("My ID is " + id);
	}
	
	public void showInfo(String name)
	{
		System.out.println("My name is " + name);
	}
	
	public void showInfo(String name, int id)
	{
		System.out.println("My name is " + name);
		System.out.println("My id is " + id);
	}
	
}
