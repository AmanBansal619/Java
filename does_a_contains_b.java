public class does_a_contains_b
{
	static int i;
	public static boolean checkSequence(String a, String b) 
	{
		i=0;
		return check(a,b,0,i);
	}
	public static boolean check(String a,String b,int start,int i)
	{
		if(start>a.length()-1)
		{
			return false;
		}
		if(i>b.length()-1)
		{
			return true;
		}
		if(a.charAt(start)==b.charAt(i))
		{
			i++;
			//System.out.println(a.charAt(start)+" "+b.charAt(i-1));
			return check(a,b,start+1,i);
		}
		return check(a,b,start+1,i);
	}
	public static void main(String args[]) 
	{
		System.out.println(checkSequence("abcde","abe"));
		
	}

}
