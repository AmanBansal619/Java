import java.util.Scanner;
public class pattern3
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{	
			int j=i;
			int k=1;
			while(j<n)
			{
				System.out.print(" ");
				j++;
			}
			while(k<(i*2))
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
	}	
}
