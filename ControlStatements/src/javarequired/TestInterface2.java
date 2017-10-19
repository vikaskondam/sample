package javarequired;

public class TestInterface2 {

	public static void main(String[] args)
	{
		Bank b = new Sbi();
		System.out.println(b.rateOfInterest());
		
		Bank c  = new Pnb();
		System.out.println(c.rateOfInterest());
	}
	
}
