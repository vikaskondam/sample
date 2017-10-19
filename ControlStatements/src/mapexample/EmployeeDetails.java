package mapexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDetails {

	public static void main(String[] args)
	{
		
		Map<String, String> myMap = new HashMap<String, String>();
		
		myMap.put("First Name", "Vikas");
		myMap.put("LastName", "Kondam");
		myMap.put("Age","23");
		myMap.put("Branch", "CSE");
		
		Map<String, String> myMap1 = new HashMap<String, String>();
		
		myMap.put("First Name", "Hanuman");
		myMap.put("LastName", "Nelluri");
		myMap.put("Age","23");
		myMap.put("Branch", "Mech");
		
		Map<String, String> myMap2 = new HashMap<String, String>();
		
		myMap.put("First Name", "Vipul");
		myMap.put("LastName", "Kondam");
		myMap.put("Age","25");
		myMap.put("Branch", "ECE");
		 
		List<String> employeeID = new ArrayList<String>();
		
		employeeID.add("e001");
		employeeID.add("e002");
		employeeID.add("e003");
		
		
	 
		Map< List<String> , Map<String, String> >  exmap = new HashMap<List<String>, Map<String, String> >();
		
	
		for(int i = 0; i <= 2; i++)
		System.out.println(exmap.put(employeeID, myMap));
		
		
		
	}
	
}
