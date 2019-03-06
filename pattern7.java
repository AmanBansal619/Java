import java.util.Scanner;
public class pattern7 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=n;
		int j;
		while(i>=1)
		{
			j=1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			i--;
			System.out.println();
		}
	}

}
