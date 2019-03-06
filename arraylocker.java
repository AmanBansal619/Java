public class arraylocker
{
	public static void main(String args[])
	{
		int a[]=new int[50];
		int i,j,k,start;
		for(i=0;i<=49;i++)
		{
			a[i]=0;
		}
		for(i=0;i<=49;i++)
		{
			start=i;
			if(i==0)
			{
				k=1;
			}
			if(i==1)
			{
				k=1;
			}
			else
			{
				k=i+1;
			}
			for(j=start;j<=49;j=j+k)
			{
				if(j==start)
				{
					a[start]=1;
				}
				else
				{
					if(a[j]==0)
					{
						a[j]=1;
					}
					if(a[j]==1)
					{
						a[j]=0;
					}
				}
			}
		}
		for(i=0;i<=49;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
