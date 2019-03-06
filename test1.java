class C {
	public void printName()
	{
		System.out.println("Value-A");
	}
}
class D extends C
{
	public void printName()
	{
		System.out.println("Value-B");
	}
}
public class test1 {
	public static void main(String args[])
	{
		D a= new D();
		a.printName();
		//A a=new A();
		//a.printName();
	}
}