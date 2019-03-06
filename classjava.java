import java.util.*;
public class classjava
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str="aman";
		String str2;
		str2=s.nextLine().trim().toLowerCase();
		System.out.println("Length of password is "+str2.length());
		if(str2.length()<6)
		{	
			System.out.println("String length is less than required");
		}
		else if(str2.length()>6)
		{
			System.out.println("String length is more than required");
		}
		System.out.println(str2.contains(str));
		str2=str2.substring(str2.indexOf(str),str2.indexOf(str)+4);
		System.out.println("Your password is: "+ str2);
			if(str2.equals(str))
			{
				System.out.println("equal");
				System.out.println("Entered Password is "+str2);
			}
			else
			{
				System.out.println("Unequal");
			}
		StringBuilder d=new StringBuilder("Hi");
		System.out.println(d);
	}
}