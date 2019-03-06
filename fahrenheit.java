import java.util.Scanner;
public class fahrenheit 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int st=s.nextInt();
		int e=s.nextInt();
		int t=s.nextInt();
		int c=0;
		int i=st;
		while(i<=e)
		{
			c=((i-32)*5)/9;
			System.out.println(i+"\t"+c);
			i=i+t;
		}
		
	}
}
