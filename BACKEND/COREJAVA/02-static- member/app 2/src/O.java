class O
{
	 public static void main(String[] args)
	{
		 System.out.println("Hello Word! from O begin");
		 P.main(null);
		 System.out.println("Hello Word! from O end");
	}
}
class P
{
	 public static void main(String[] args)
	{
		 System.out.println("Hello Word! from P begin");
	     Q.main(null);
		 System.out.println("Hello Word! from p end");

	}
}
class Q
{
	 public static void main(String[] args)
	{
		 System.out.println("Hello Word! from Q begin");
		 H.main(null);
		 System.out.println("Hello Word! from Q end");

	}
}
