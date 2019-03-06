public class multithreading
{
	public static void main(String args[])
	{
		t1 a=new t1();
		a.start();
		t2 b=new t2();
		b.start();
	}
}
class t1 extends Thread
{
	int x=0;
	public void run()
	{
		while(x<10)
		{
			try
			{
				x++;
				System.out.println(x);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				//System.out.println("hi");
			}
		}
	}	
}
class t2 extends Thread
{
	int y=10;
	public void run()
	{
		while(y>=0)
		{
			try
			{
				y--;
				System.out.println(y);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				//System.out.println("hello");
			}
		}
	}
}
