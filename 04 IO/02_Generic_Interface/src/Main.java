
public class Main
{
	public static void main(String[] args)
	{
		Boy<Integer,String> boy = new Boy<Integer,String>(1,"Aung Aung");
		System.out.println(boy.getId() + ":" + boy.getName());
	}
}
