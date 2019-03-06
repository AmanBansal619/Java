import java.util.Scanner;
public class pattern10
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int j;
		int k=(2*n)+1;
		int l=k;
		int r=(k/2)+1;
		while(i<=n)
		{	
			j=1;
			while(j<=k)
			{
				if(j==i || j==r || j==l)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("0");
				}
				j++;	
			}
			System.out.println();
			i++;
			l--;
		}
	}	
}
