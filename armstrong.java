import java.util.Scanner;
import java.lang.Math;
public class armstrong
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int t=n;
		int y=n;
		int sum=0;
		int c;
		int count=0;
		while(y>0)
		{
			int r=y%10;
			y=y/10;
			count++;
		}
		while(n>0)
		{
			int r=n%10;
			c=(int)Math.pow(r,count);
			sum=sum+c;
			n=n/10;
		}
		if(sum==t)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}	
}
