import java.util.Scanner;
public class fibonaci
{
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		int c;
		int i;
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==1)
        {
        	System.out.println(1);
        }
        else
        {
        	for(i=2;i<=n;i++)
        	{
        		c=a+b;
        		if(i==n)
        		{
        			System.out.println(c);
        		}
        		a=b;
        		b=c;
        	}
        }
   }
}
