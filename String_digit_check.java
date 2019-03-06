import java.util.Scanner;
public class String_digit_check 
{
	public static void main(String args[])
	{
		int f=0;
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)>=48 && a.charAt(i)<=57)
			{
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("Digit present");
		}
		else
		{
			System.out.println("Digit not present");
		}
	}

}
