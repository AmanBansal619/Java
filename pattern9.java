import java.util.Scanner;
public class pattern9
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=n;
		int k=1;
		while(i>=1)
		{	
			int j=n;
			while(j>=1)
			{
				if(j==k)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(j);
				}
				j--;	
			}
			System.out.println();
			i--;
			k++;
		}
	}	
}
