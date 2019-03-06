import java.util.Scanner;

public class password_matching 
{
	public static void main(String args[])
	{
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter password 1");
		String pass1=s.nextLine();
		System.out.println("Enter password 2");
		String pass2=s.nextLine();
		int i=0;
		while(i<pass1.length() && i<pass2.length())
		{
			if(pass1.charAt(i)==pass2.charAt(i))
			{
				count++;
			}
			i++;
		}
		int score=(count*100)/pass1.length();
		if(count>0)
		System.out.println("Matching percentage is " +score+"%");
		else
		System.out.println("Password doesn't match at all");	
	}
}
