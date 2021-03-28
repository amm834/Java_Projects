
public class Main
	{
		public static void main(String[] args)
			{
				Box<String> box = new Box<> ( );
				box.setBox ( "Hello" );
				
				Box<Integer> box1 = new Box<>();
				box1.setBox(123);
				
				Box<Person> box2 = new Box<>();
				box2.setBox(new Person());
				
				Box<Student> box3 = new Box<>();
				box3.setBox(new Student());
				getBoxData ( box2);
				
				
			}

		private static void getBoxData(Box<? extends Person> box)
			{
				System.out.println ( box.getBox ( ) );
			}
	}
