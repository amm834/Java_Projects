public class Student
{
	Student(){
		System.out.println("I've no args.");
	}
	// Constructor Overloading
	Student(int id){
		System.out.println("My id is " + id);
	}
	Student(String name){
		System.out.println("I'm "+name);
	}
}
