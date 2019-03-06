import java.util.*;
public class frequencyarray 
{	
	public static void main(String args[])
	{
        Scanner s=new Scanner(System.in);
		int a[]=new int [10];
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		    while(a[i]>100)
		    {
		    	System.out.println("Enter no in range of 1-100");
		    	a[i]=s.nextInt();
		    }
		}
		int count;
		for(int i=0;i<10;i++)
		{
			count=1;
			for(int j=i+1;j<10;j++)
			{
				if(a[i]!=Integer.MIN_VALUE)
				{
					if(a[i]==a[j])
					{
						count++;
						a[j]=Integer.MIN_VALUE;
					}
				}
			}
			if(count>=1 && a[i]!=Integer.MIN_VALUE)
			System.out.println("Count for "+a[i]+" is "+count);
		}
	}
}
