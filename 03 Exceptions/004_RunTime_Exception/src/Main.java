
public class Main
{
	public static String name;
	public static void main(String[] args)
	{
		int[] ary = {1,2,3,4,5};
		try
		{
			System.out.println(ary[6]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		name = "Aung Myat Moe";
		if(name != null){
		System.out.println(name.length());
		}
	}
}
