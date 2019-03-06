import java.util.Scanner;
public class first_non_repeated_character
{
	public static void main(String arg[])
	{
		int f=0;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char a[]=str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			f=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.println(a[i]);
				break;
			}
		}
				
	}


}
