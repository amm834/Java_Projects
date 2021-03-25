
import java.io.*;public class App
{
	
	public static void getName() throws FileNotFoundException, ClassNotFoundException
	{
		int errorCode = 1;
		if(errorCode == 1){
			throw new FileNotFoundException("ဖိုင်မရှိပါ။");
		}
		if(errorCode==2){
			throw new ClassNotFoundException("Class မရှိဘူး။");
		}
		System.out.println("ဖိုင်ဖတ်‌‌ေနတယ်");
	}
	
}
