class F 
{
	static int counter;

	{
		counter++;
	}

	{
		counter++;
	}

	F()
	{
		counter++;
	}

	F(int i)
	{
		counter++;
	}

	F(int i, int j)
	{
		counter++;
	}

	public static void main(String[] args) 
	{
		F obj1 = new F();
		F obj2 = new F(10);
		F obj3 = new F(10, 20);
		System.out.println("A: " + obj1.counter);
		System.out.println("B: " + obj2.counter);
		System.out.println("C: " + obj3.counter);
	}
}
