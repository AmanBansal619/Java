import java.util.Scanner;
public class matching_suggestions 
{
		public static void main(String args[])
		{
			int count=0,first=0;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter search");
			String pass2=s.nextLine();
			int i=0;
			String str1="cake",str2="bake",str3="lake";
			while(i<pass2.length())	
			{
				if((str1.charAt(0)==pass2.charAt(0)) || (str2.charAt(0)==pass2.charAt(0)) || (str3.charAt(0)==pass2.charAt(0)))
				{
					first=1;
				}
				if((str1.charAt(i)==pass2.charAt(i))|| (str2.charAt(i)==pass2.charAt(i)) || (str3.charAt(i)==pass2.charAt(i)))
				{
					count++;
				}
				i++;
			}
			int score=(count*100)/pass2.length();
			System.out.println(score);
			if(score==100)
			{
				System.out.println("Entered search is "+pass2);
			}
			else if(score>=75 && first==0)
			System.out.println("Suggestions are cake bake lake");
			else if(score>=75 && first==1)
			{
				if(pass2.charAt(0)=='c')
				{
					System.out.println("Suggestions is cake");
				}
				else if(pass2.charAt(0)=='b')
				{
					System.out.println("Suggestions is bake");
				}
				else if(pass2.charAt(0)=='l')
				{
					System.out.println("Suggestions is lake");
				}
			}
			else
			System.out.println("No search results found");	
		}
}
