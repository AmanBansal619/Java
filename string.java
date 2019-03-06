public class string 
{
	public static void main(String args[])
	{
		String a="aman";
		char b[]=new char[a.length()];
	    b=a.toCharArray();
	    for(int i=0;i<b.length;i++)
	    {
	    	System.out.println(b[i]);
	    }
	}
}
