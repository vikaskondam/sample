package objects;

public class Student {
	
	int id = 123;
	String name = "Vikas Reddy";
	
	public class TestStudent1 {

		public void main(String[] args)
		{
			Student s1 = new Student();
			System.out.println(s1.id);
			System.out.println(s1.name);
		}
	}


}
