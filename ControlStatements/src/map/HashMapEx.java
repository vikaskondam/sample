package map;
import java.util.*;

public class HashMapEx {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Plants");
		hm.put(2, "Animal");
		hm.put(3, "Trees");
		
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	
}
