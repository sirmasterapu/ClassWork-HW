public class HWrecurse
{
	public static void main(String[] args)
	{
		five(5);
	}
	
	public static void five(int n)
	{
	/*
	*This method prints all numbers before n up to and including 0
	*/
		if ( n > 0)
		{
			five(n-1);
		}
		System.out.println(n);
			
		
		
		
	}
}

		
		