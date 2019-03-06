import java.util.*;
import java.util.StringTokenizer;
public class string_tokenizer
{
	public static void main(String args[])
	{
		StringTokenizer st=new StringTonkenizer("Hello World"," ");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}
	}

}
