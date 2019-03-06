import java.util.Scanner;
public class anagram_string
{
	public static void main(String args[])
	{
		char temp;
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		char a[]=str1.toCharArray();
		char b[]=str2.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>=a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]>=b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		str1=String.valueOf(a);
		str2=String.valueOf(b);
		if(str1.equals(str2))
		{
			System.out.println(str1+" "+str2+ " Anagrams");
		}
		else
		{
			System.out.println(str1+" "+str2+" Not Anagrams");
		}
	}

}
