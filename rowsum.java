import java.util.Scanner;
public class rowsum
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int[][] arr = new int[m][n];
		int i,j;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(i=0;i<m;i++)
		{
			int sum=0;
			for(j=0;j<n;j++)
			{
				sum=sum+arr[i][j];
			}
			System.out.print(sum+" ");
		}
    }
}