package map;
import java.util.*;

public class HashMapRm {

	public static void main(String[] args)
	{
		//create and populate Hash Map
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(987, "Jack");
		map.put(988, "Tony");
		map.put(989, "Lara");
		
		System.out.println("Values before remove : "+map);
		
	//	Remove value for key 102
		
		map.remove(988);
		
		System.out.println("Values after remove : "+map);
		
	}
	
}
