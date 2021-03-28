
public class Main
{
	public static void main(String[] args)
	{
		Student<String> std = new Student<String>();
		
		std.setName("Aung Myat Moe");
		String name = std.getName();
		System.out.println(name);
		
		Student<Integer> std2 = new Student<>();
		std2.setName(123);
		System.out.println(std2.getName());
		
	}
}
