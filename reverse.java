import java.util.Scanner;
public class reverse
{
	public static void main(String[] args)
	{
		int i=0,sm=0;
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0)
        {
        	int q=n/10;
        	int r=n%10;
        	sm=sm*10+r;
        	n=q;
        }
        System.out.println(sm);
    }
}