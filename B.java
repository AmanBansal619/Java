class A
{
	int a = 50;
}
public class B extends A
{
	int a = 100;
	void show()
	{
		System.out.println(a+" "+super.a);
	}
	public static void main(String args[])
	{
		B b = new B();
		b.show();
	}
}