import java.util.Scanner;
public class duplicate_characters 
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char a[]=str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && a[i]!='?')
				{
					System.out.println(a[i]);
					a[j]='?';
					break;
				}
			}
		}
				
	}

}
