class L
{
	void test()
	{
		System.out.println("from test()");
	}

	static 
	{
		L obj = new L(); // obj is just an indtifer 
		obj.test();
	}
}
