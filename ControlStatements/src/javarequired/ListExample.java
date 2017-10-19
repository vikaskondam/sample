package javarequired;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {

	public static void main(String[] args)
	{
		
		List<Book> list = new ArrayList<Book>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		System.out.println("Enter course name");
		String sub = sc.nextLine();
		
		Book b1 = new Book(num, sub);
		Book b2 = new Book(964, "Data Structures");
		
		 list.add(b1);
		 list.add(b2);
		 
		 for(Book b : list)
		 {
			 System.out.println(b.id+" "+b.name);
			
		 }
	}
	
}
