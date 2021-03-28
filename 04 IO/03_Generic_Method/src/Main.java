class Util{
	
	public static <T> void setArray(T[] array){
		for(T e : array){
			System.out.println(e);
		}
	}
}

public class Main
{
	public static void main(String[] args)
	{
		String[] names = {
			"Aung Aung","Mg Mg","Hla Hla","Mya Mya"
		};
		Integer[] nums = {1,2,3,4,5};
		
		Util.<Integer>setArray(nums);
		Util.<String>setArray(names);
	}
}
