import java.util.Scanner;
public class frequency_characters 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char a[]=str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && a[i]!='?')
				{
					a[j]='?';
					count++;
				}
			}
			if(count>1)
			System.out.println(a[i]+":"+count);
		}
	}

}
