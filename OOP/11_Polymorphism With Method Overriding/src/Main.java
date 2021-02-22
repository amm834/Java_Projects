
public class Main
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.showInfo();
		
		Student s1 = new Student();
//		s1.showInfo();
		
		Person s2 = s1; // Up Casting
		s2.showInfo();
	}
}
