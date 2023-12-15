class G
{
	static int i = 10;

	static
	{
		System.out.println("G-SIB");
	}

    static void test()
	{
		System.out.println("from G.test()");
	}

	static
	{
		System.out.println("G-SIB2");
	}
}