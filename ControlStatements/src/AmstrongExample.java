
public class AmstrongExample {
	
	public static void main(String[] arg)
	{
		int c = 0, a, temp;
		int n = 153;       // It is the number to check amstrong
		
		temp = n;
		
		while(n > 0)
		{
			a = n % 10;
			n = n/10;
			c  = c + (a*a*a);
		}
		
		if(temp == c)
			System.out.println("amstrong number");
		else 
			System.out.println("Not a amstrong number");
			
		
		
	}

}
