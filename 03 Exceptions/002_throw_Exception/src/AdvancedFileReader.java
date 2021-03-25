
import java.io.*;
public class AdvancedFileReader
{


	public static void isExist(String filePath) throws FileNotFoundException
	{
		File file = new File(filePath);
		if (file.exists())
		{
			System.out.println("File exists.");
		}
		else
		{
			throw new FileNotFoundException("Your file is not exists at \n " + filePath);
		}
	}
	
}
