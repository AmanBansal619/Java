import java.util.Scanner;
public class AP
{
	public static void main(String[] args)
	{
		int[] arr = new int[5];
		arr = new int[6];
		int i=1,sm,count;
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(count=1;count<=n;)
        {
        	sm=(3*i)+2;
        	if(sm%4!=0)
        	{
        		System.out.print(sm + " ");
        		count++;
        	}
        	i++;
        }	  
    }
}