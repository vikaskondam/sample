package map;
import java.util.*;

public class MapExample1 {

	public static void main(String[] args)
	{
		Map map = new HashMap();
		
		map.put(1, "Amit");
		map.put(2, "Obama");
		map.put(3, "Peacock");
		
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry  entry = (Map.Entry)itr.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	
}
