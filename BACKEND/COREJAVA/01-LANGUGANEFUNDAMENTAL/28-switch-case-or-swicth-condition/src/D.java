class D
{
	public static void main(String[] args) 
	{
		int i = 3;
		switch(i)
		{
		case 2:
			System.out.println("form case 2");
			for (int var1 = 1; i <= 20; var1++)
			{
			System.out.println("form case 2: " + var1);
			}
		case 3:
		System.out.println("form case 3");
		int j = 1;
		while(j <= 10)
		{
		System.out.println("form case 3: " + j);
		j++;
		}
		case 5:
		System.out.println("form case 5");
		 int k = 100;
		do
		{
		System.out.println("form case 5: " + k);
		k++;
		}
		while (k <= 120);
		
		}
		
	}
}