import java.util.Scanner;
public class pattern2
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int spaces=0;
		while(i<=n)
		{
			int j=1;
			int val=i;
			spaces=1;
			while(spaces<=(n-i))
			{
				System.out.print(" ");
				spaces++;
			}
			while(j<=i)
			{
				System.out.print(val);
				val++;
				j++;
			}
			System.out.println();
			i++;
		}
		
	}	
}
