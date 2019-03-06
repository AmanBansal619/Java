class Small {
	public Small()
	{
		System.out.print("A ");
	}
}
class Small2 extends Small
{
	public Small2()
	{
		System.out.print("B ");
	}
}
class Small3 extends Small2
{
	public Small3()
	{
		System.out.print("C ");
	}
}
public class test4 {
	public static void main(String args[])
	{
		new Small3();
	}
}