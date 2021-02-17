

public class Main
{
	public static void main(String[] args)
	{
		// Good Pratice
		Student.count = 100;
		System.out.println(Student.count);
		
		Student std1 = new Student();
		
		/* Bad Pratice
		 * std1.count = 300;
		 * System.out.println(std1.count);
		*/
		
		std1.id = 1;
		std1.name = "Aung Myat Moe";
		std1.age = 17;
		std1.introduce();
		
		Student std2 = new Student();
		std2.id = 2;
		std2.name = "Noosi";
		std2.age = 13;
		std2.introduce();
	}
}
