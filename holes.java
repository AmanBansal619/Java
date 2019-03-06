import java.util.Scanner;
public class holes 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int q=0,r=0,sum=0;
		int a[]= {1,0,0,0,0,0,1,0,2,1};
		while(n>0)
		{
			r=n%10;
			sum=sum+a[r];
			n=n/10;
		}
		System.out.println("no of holes are "+sum);
	}

}
