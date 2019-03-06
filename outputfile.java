import java.io.*;
public class outputfile
{
	public static void main(String args[])
	{
		try
		{
			File f=new File("D:\\s.txt");
			FileInputStream fis=new FileInputStream(f);
			FileOutputStream fos=new FileOutputStream("D:\\\\new.txt");
			int k;
		    while((k=fis.read())!=-1)
		    {
		    	fos.write(k);
		    }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
