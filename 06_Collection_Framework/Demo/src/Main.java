
import java.util.*;
public class Main
	{
		public static void main(String[] args)
			{
				Collection<Student> stds = getData ( );
				for(Student std : stds){
					
					System.out.println(std.getId() + ":" + std.getName());
					
				}
			}

		private static Collection<Student> getData()
			{
				Student p1 = new Student ( 1, "AMM" );
				Student p2 = new Student ( 2, "AMM2" );

				Collection<Student> collects = new ArrayList<> ( );
				collects.add ( p1 );
				collects.add ( p2 );
				return collects;
			}
	}
