import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		// set file path
		File file = new File("/storage/emulated/0/AppProjects/Java Projects/03 Exceptions/001_Handle_Execptions/src/text.txt");
		try
		{
			Scanner sc = new Scanner(file);
			System.out.println("File is exist.");
			// print file's data
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			System.out.println(str1);
			System.out.println(str2);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File Not Found");
			e.printStackTrace();
		}
	}
}
