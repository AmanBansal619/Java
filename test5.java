class X
{
	int i = 202020;
	public X()
	{
		System.out.println("hi");
		i = i++ + i-- - i;
	}
	static int staticMethod(int i)
	{
		System.out.println(i);
		return --i;
	}
}
class Y extends X
{
	public Y()
	{
		System.out.println(staticMethod(i));
	}
}
public class test5
{
	public static void main(String[] args)
	{
		Y y = new Y();
	}
}