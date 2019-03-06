import java.util.Scanner;
import java.lang.Math;
public class binary_decimal
{
	public static void main(String[] args)
	{
		long i=0,sm=0;
		Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        while(n>0)
        {
        	long q=n/10;
        	long r=n%10;
        	sm=(long)(sm+r*Math.pow(2,i));
        	i++;
        	n=q;
        }
        System.out.println(sm);
    }
}