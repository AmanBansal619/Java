import java.util.Scanner;
import java.lang.Math;
public class numeric_string_into_int
{
	public static void main(String args[])
	{
		int num=0,j=0;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			int a=str.charAt(i)-48;
			num=num+a*(int)Math.pow(10,j);
			j++;
		}
		System.out.println(num);
		
	}

}
