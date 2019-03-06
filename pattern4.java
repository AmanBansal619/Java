import java.util.Scanner;
public class pattern4 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int j;
		while(i<=n)
		{
			j=1;
			while(j<=i)
			{
				System.out.print(1);
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
