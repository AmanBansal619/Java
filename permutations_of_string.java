import java.util.Scanner;
public class permutations_of_string 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		if(a.length()==3)
		{
			for(int i=0;i<a.length();i++)
			{
				for(int j=0;j<a.length();j++)
				{
					if(i!=j)
					{
						for(int k=0;k<a.length();k++)
						{
							if(k!=j && k!=i)
							System.out.println(a.charAt(i)+""+a.charAt(j)+""+a.charAt(k));
						}
					}
				}
				
			}
		}
		else if(a.length()==2)
		{
			for(int i=0;i<a.length();i++)
			{
				for(int j=0;j<a.length();j++)
				{
					if(i!=j)
					{
						System.out.println(a.charAt(i)+""+a.charAt(j));
					}
				}
				
			}
		}
		
		
	}

}
