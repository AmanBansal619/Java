import java.util.Scanner;
public class reverse_string_recursion
{
	public static String reverse(String a)
	{
		return reverse(a,a.length()-1,"");
	}
	public static String reverse(String a,int end,String ans)
	{
		if(end<0)
		{
			 return ans;
		}
		 ans=ans+a.charAt(end);
	     return reverse(a,end-1,ans);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println(reverse("aman bansal"));
	}
}
