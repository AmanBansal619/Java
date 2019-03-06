import java.util.Scanner;
public class sequence
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int f=0;
		int p=s.nextInt();
		boolean isdec=false;
		boolean isinc=false;
		while(i<=n-1)
		{
			int c=s.nextInt();
			if(c<p)
			{
				if(isinc==true)
				{
					f=1;
				}
				isdec=true;	
			}
			else if(c>p)
			{
				isdec=false;
				isinc=true;
			}
			else
			{
				f=1;
			}
			p=c;
			i++;
		}
		
	    if(f==1)
		System.out.println("false");
	    else
	    System.out.println("true");	
	}
}
