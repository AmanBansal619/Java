import java.util.Scanner;
public class power 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int r=1;
		while(m>0)
		{
			r=r*n;
			m--;
		}
		System.out.println(r);
	}
}
