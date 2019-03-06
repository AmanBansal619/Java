import java.util.Scanner;
public class pattern8 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int j;
		char c='A';
		while(i<=n)
		{
			j=1;
			while(j<=i)
			{
				System.out.print(c);
				j++;
			}
			i++;
			c++;
			System.out.println();
		}
	}
}
