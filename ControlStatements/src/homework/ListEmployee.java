package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListEmployee {
	
	public static void main(String[] args)
	{
		
		List<String> valOne = new ArrayList<String>();
		valOne.add("John");
		valOne.add("Macain");
		valOne.add("24");
		valOne.add("CSE");
		
		List<String> valTwo = new ArrayList<String>();
		valTwo.add("Barak");
		valTwo.add("Obama");
		valTwo.add("50");
		valTwo.add("ECE");
		
		List<String> valThree = new ArrayList<String>();
		valThree.add("Naveen");
		valThree.add("Krishna");
		valThree.add("28");
		valThree.add("Mech");
		
		List<String> valFour = new ArrayList<String>();
		valFour.add("Jack");
		valFour.add("Peter");
		valFour.add("35");
		valFour.add("ECE");
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		//put values into map
		
		map.put("A", valOne);
		map.put("B", valTwo);
		map.put("C", valThree);
		map.put("D", valFour);
		
		//iterate and display values
		System.out.println("Fetching keys and corresponding values n ");
		for(Map.Entry<String, List<String>> entry : map.entrySet())
		{
			String key = entry.getKey();
			
			List<String> values = entry.getValue();
			
			System.out.println("Key = "+key);
			System.out.println("Values = "+values+" n");
		}	
		
		
		
		
		
	}
}
