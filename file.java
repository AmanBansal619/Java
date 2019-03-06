import java.io.*;
public class file
{
	public static void main(String args[])
	{
		try 
		{
			File f=new File("D:\\s.txt");
			FileInputStream fis=new FileInputStream(f);
		    int k;
		    while((k=fis.read())!=-1)
		    {
		    	System.out.println((char)k);
		    }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
    
}
