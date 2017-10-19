package mapexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
	
	public static void main(String[] args){
	
	String employeeId = "e1";
	
	Map<String, ArrayList<String>> myMap = new HashMap<String, ArrayList<String>>();
	
	List<String> scores = new ArrayList<String>();
	scores.add("Vikas");
	scores.add("Kondam");
	scores.add("24");
	scores.add("CSE");
	
	
	
	List<String> scores1 = new ArrayList<String>();
	scores1.add("Hanuman");
	scores1.add("Nelluri");
	scores1.add("25");
	scores1.add("ECE");
	
	List<String> scores2 = new ArrayList<String>();
	scores2.add("Vipul");
	scores2.add("Kondam");
	scores2.add("25");
	scores2.add("Mech");

	List<String> scores3 = new ArrayList<String>();
	scores3.add("Jack");
	scores3.add("Hack");
	scores3.add("28");
	scores3.add("CS");
	
	
	
	Map<String, ArrayList<String>> myMap1 = new HashMap<String, ArrayList<String>>();

	//myMap.put(e1,  (ArrayList<String>) scores);
	//myMap.put(e2, (ArrayList<String>) scores1);
	myMap1.put(employeeId,  (ArrayList<String>) scores2);
	myMap1.put(employeeId,  (ArrayList<String>) scores3);
	
////	for(int i = 0; i <= e1; i++)
	System.out.println(myMap1);
	
	
}
}





