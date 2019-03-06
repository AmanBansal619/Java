import java.io.*;
import java.net.*;
public class messenger
{
	public static void main(String args[])
	{
		try
		{
			Socket s=new Socket("192.168.66.14",1087);
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			dos.writeUTF("Hello Java");
			dos.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
//		finally
//		{
//			System.out.println("hi");
//		}
		
	}

}
