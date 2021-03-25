
import java.io.*;
public class Main
{
	public static void main(String[] args)
	{
//		try
//		{
//			App.getName();
//		}
//		catch (ClassNotFoundException e)
//		{
//			e.printStackTrace();
//		}
//		catch (FileNotFoundException e)
//		{
//			e.printStackTrace();
//		}
		
		try
		{
			App.getName();
		}
		catch (ClassNotFoundException | FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
