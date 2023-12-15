class I
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++)
		{
		 System.out.println("main begin");
		 if(i >= 2)
			{
		 continue;
			}
			System.out.println("main middle");
			if (i >= 3)
			{
			continue;
			}
		 System.out.println("main end");
		}
    }
}