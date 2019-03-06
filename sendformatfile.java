import java.io.*;
public class sendformatfile 
{
	public static void main(String args[])
	{
		try
		{
			File f=new File("D:\\Alan Walker - Faded.wav");
			FileInputStream fis=new FileInputStream(f);
			FileOutputStream fos=new FileOutputStream("D:\\new.wav");
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
