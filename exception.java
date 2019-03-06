import java.net.*;
public class exception 
{
	public static void main(String args[])
	{
		try
		{
			URL url=new URL("https://google.com"); //valid
			URL url1=new URL("gpp");               //Invalid
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		finally
		{
			System.out.println("Exit");
		}
	}
}
