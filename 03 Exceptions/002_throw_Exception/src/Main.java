
import java.io.*;
public class Main
{
	public static void main(String[] args)
	{
		try
		{
			AdvancedFileReader.isExist("/storage/emulated/0/AppProjects/Java Projects/03 Exceptions/002_throw_Exception/src/hello.txt");
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
	}
}
