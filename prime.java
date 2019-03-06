import java.util.Scanner;
public class prime
{
	public static void main(String[] args)
	{
		boolean flag=false;
		int j;
		int i;
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(i=2;i<n;i++)
        {
        	flag=false;
        	for(j=2;j<i;j++)
        	{
        		if(i!=j)
        		{
        			if(i%j==0)
        			{
        				flag=true;
        				break;
        			}
        		}
        	}
        	if(flag==false)
    		{
    			System.out.println(i);
    		}
        }
        
   }
}
