import java.util.Scanner;
public class sumevenodd 
{
	public static void main(String[] args) 
    {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int q,r,sum1=0,sum2=0;
		while(n>0)
		{
			q=n/10;
			r=n%10;
			if(r%2==0)
			{
				sum1=sum1+r;
			}
			else
			{
				sum2=sum2+r;
			}
			n=q;
		}
		System.out.println(sum1+" "+sum2);
				
    }

}
