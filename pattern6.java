import java.util.Scanner;
public class pattern6
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int j;
		while(i<=n)
		{
			if(i==1)
			{
				System.out.print(i);
			}
			else
			{
			j=1;
			while(j<=i-1)
			{
				if(j==1)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(2);
				}
				j++;
			}
			
			System.out.print(1);
			}
			i++;
			System.out.println();
		}
	}

}
