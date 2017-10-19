package diffhsethmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args)
	{
		// creating map of Books
		Map<Integer,HashMapBook> map = new HashMap<Integer,HashMapBook>();
		
		//creating Books
		HashMapBook b1 = new HashMapBook(101, "Let us C", "BPB", 8);
		HashMapBook b2 = new HashMapBook(102, "Java", "Mc GrawHill", 4);
		HashMapBook b3 = new HashMapBook(103, "Operating System", "Wiley", 6);
		
		//Adding books to map
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		
		//Traversing map
		for(Map.Entry<Integer, HashMapBook> entry : map.entrySet())
		{
			int key = entry.getKey();
			HashMapBook b = entry.getValue();
			System.out.println(key+" Details : ");
			System.out.println(b.id+" "+b.name+" "+b.publisher+" "+b.quantity);
			
		}
		
		
	}
	
}
