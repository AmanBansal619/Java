public class interface2 extends class1 implements interface1
{
	public void show()
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		class1 sa=new class1();
		sa.show2();
		interface2 a=new interface2();
		a.show2();	
		a.show();
	}
	interface2()
	{
		super();
	}
}
