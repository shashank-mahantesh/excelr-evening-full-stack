class N
{
	int i; // attribute, field,member,varibles,object member

	public static void main(String[] args) 
	{
		N n1 = new N();
		N n2 = new N();
		System.out.println(n1.i);
		System.out.println(n1.i);
		n1.i = 10;
		n2.i = 20;
		System.out.println(n1.i);
		System.out.println(n1.i);
	}
}
