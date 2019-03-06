public class try1
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("hello "+1/0);
		}
		catch(ArithmeticException e)
		{
			System.out.print("world");
		}
	}

}
