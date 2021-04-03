
import java.util.*;
public class Main
	{
		public static void main(String[] args)
			{
				List<String> animals = new ArrayList<> ( );
				animals.add ( "Dog" );
				animals.add ( "Bird" );
				animals.add ( "Elephant" );
				animals.add ( "Holo" );
				System.out.println ( animals.get ( 2 ) );
				System.out.println ( "///////" );
				for (String a : animals)
					{
						System.out.println ( a );
					}
				animals.add ( 2, "Cat" );
				System.out.println ( "///////" );
				for (String a : animals)
					{
						System.out.println ( a );
					}

				Collections.sort ( animals ); // sorting

				System.out.println ( "///////" );
				for (String a : animals)
					{
						System.out.println ( a );
					}
				
			}
	}
