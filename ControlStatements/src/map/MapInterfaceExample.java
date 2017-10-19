package map;
import java.util.*;


public class MapInterfaceExample {
	
	public static void main(String[] args)
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(100, "Amit");
		map.put(101, "Vikas");
		map.put(102, "Vipul");
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
