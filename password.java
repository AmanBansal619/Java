import java.util.Scanner;
public class password
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int specialfound=0,alpha=0,digit=0,invalid=0,length=1;
		boolean flag=false;
		String str=s.nextLine();
		if(str.length()>5 && str.length()<12)
		{
			length=0;
			for(int i=0;i<str.length();i++)
			{
				if((str.charAt(i)>=32 && str.charAt(i)<=47)|| (str.charAt(i)>=58 && str.charAt(i)<=64) || (str.charAt(i)>=91 && str.charAt(i)<=96))
				{
					System.out.println("Special found="+specialfound);
					specialfound=1;
					
					break;
				}
			}
			if(specialfound==0)
			{
				for(int i=0;i<str.length();i++)
				{
					if((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122))
					{
						digit=0;
						alpha++;
						System.out.println("alpha="+alpha);
						if(alpha>=5)
						{
							invalid=1;
							break;
						}
					}
					else if(str.charAt(i)>=48 && str.charAt(i)<=57)
					{
						alpha=0;
						digit++;
						System.out.println("digit="+digit);
						if(digit>=5)
						{
							invalid=1;
							break;
						}
					}
					else
					{
						alpha=0;
						digit=0;
					}
				}
				if(digit>=5 || alpha>=5 )
				{
					flag=true;
					System.out.println("Invalid Password");
				}
				else
				{
					flag=true;
					System.out.println("Valid Password");
				}
			}
		}
		if(flag==false && specialfound==1 || (flag==false && length==1))
		{
			
			System.out.println(specialfound+" Invalid Password "+flag);
		}
		

	}
}
