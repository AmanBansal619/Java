import java.util.Scanner;
public class sum_or_product
{
	public static void main(String[] args)
	{
		int j;
		int i;
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=s.nextInt();
        if(c==1)
        {
        	int sum=0;
        	for(i=1;i<=n;i++)
            {
            	sum=sum+i;
            }	
        	System.out.println(sum);	
        }
        else if(c==2)
        {
        	int sum=1;
        	for(i=1;i<=n;i++)
            {
            	sum=sum*i;
            }	
        	System.out.println(sum);	
        }
        else
        {
        	System.out.println(-1);
        }
    }
}
