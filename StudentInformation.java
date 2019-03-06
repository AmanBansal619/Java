import java.util.Scanner;
public class StudentInformation 
{
	public static void main(String args[])
	{
		int correct=0;
		String student="",major="",campus="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.nextLine();
		System.out.println("Enter code");
		String code=s.nextLine();
		if(code.charAt(0)=='M' || code.charAt(0)=='C' || code.charAt(0)=='I' || code.charAt(0)=='P')
		{
			correct=1;
			if(code.charAt(0)=='M')
			{
				major="Mathematics";
			}
			else if(code.charAt(0)=='C')
			{
				major="Computer Science";
			}
			else if(code.charAt(0)=='I')
			{
				major="Information Technology";
			}
			else if(code.charAt(0)=='P')
			{
				major="Physics";
			}
		}
		if(code.charAt(1)=='1' || code.charAt(1)=='2' || code.charAt(1)=='3' || code.charAt(1)=='4')
		{
			correct=2;
		}
		if(code.charAt(2)=='B' || code.charAt(2)=='O' || code.charAt(2)=='M')
		{
			correct=3;
			if(code.charAt(2)=='B')
			{
				campus="Brampton";
			}
			else if(code.charAt(2)=='O')
			{
				campus="Oakville";
			}
			else if(code.charAt(2)=='M')
			{
				campus="Mississauga";
			}
		}
		if(correct==3)
		{
			System.out.println("Student:"+name+"\n"+"Major:"+major+"\n"+"Campus:"+campus+"\n");
		}
		else
		{
			System.out.println("Incorrect code");
		}
	}

}
