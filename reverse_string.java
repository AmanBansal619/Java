import java.util.Scanner;
public class reverse_string 
{
	public static void main(String args[])
	{
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
	}

}
