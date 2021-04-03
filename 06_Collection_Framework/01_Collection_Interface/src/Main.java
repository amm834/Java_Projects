
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Collection<Integer> nums = new ArrayList<>();
		System.out.println("Before Adding: " + nums.size());
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		System.out.println("After Adding: " + nums.size());
		nums.remove(40);
		System.out.println("After Remove: " + nums.size());
		
		for(Integer num : nums){
			System.out.println(num);
		}
		System.out.println("-------");
		Iterator i = nums.iterator();
		System.out.println(i.hasNext());
		
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
//		
//		System.out.println(i.hasNext());
//	
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}
}
