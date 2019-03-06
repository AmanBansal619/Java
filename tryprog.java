import java.util.Scanner;
public class tryprog
{	
	public static boolean checkNumber(int input[], int x) 
    {
	  if(input.length<=0)
      {
        return false;
      }
      int smallinput[]=new int[input.length-1];
      for(int i=1;i<input.length;i++)
      {
        smallinput[i-1]=input[i];
      }
      if(input[0]==x)
      {
        return true;
      }
      boolean s=checkNumber(smallinput,x);
      return s;
	}
   public static void main(String args[])
   {
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int a[]=new int [100];
	   for(int i=0;i<n;i++)
	   {
		   a[i]=s.nextInt();
	   }
	   int x=s.nextInt();
	   System.out.print(checkNumber(a,x));
   }
}