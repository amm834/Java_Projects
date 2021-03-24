import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	Student std = student();
	System.out.println("ID : " + std.getId());
	System.out.println("Name : " +  std.getName());
	}

	private static Student student()
	{
		Student std = new Student(10,"Aung Myat Moe");
		return std;
	}
}
