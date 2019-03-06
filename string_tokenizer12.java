import java.util.*;
import java.util.StringTokenizer;
public class string_tokenizer12
{
	public static void main(String args[])
	{
		StringTokenizer st=new StringTokenizer("Hello World"," ");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}
	}

}
