class R 
{
	int i;

	void test(R ref)
	{
		System.out.println("from test(R): begin " + ref.i);
		ref.i = 20;
		System.out.println("from test(R): end " + ref.i);
	}

	public static void main(String[] args) 
	{
		R r1 = new R();
		System.out.println("main begin: " + r1.i);
		r1.i = 10;
		System.out.println("before calling the test(R) method: " + r1.i);
		r1.test(r1);
		System.out.println("after calling the test(R) method: " + r1.i);
	}
}class Q
{
	int i;

	void test(Q ref)//ref = q1
	{
		System.out.println("from test(Q): " + ref.i);
	}

	public static void main(String[] args) 
	{
		Q q1 = new Q();
		q1.i = 10;
		q1.test(q1);
		System.out.println("main end: " + q1.i);
	}
}