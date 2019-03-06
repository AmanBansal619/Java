import java.util.Scanner;
public class encrypt_decrypt
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str,str1="",str2="";
		System.out.println("Enter plain text");
		str=s.nextLine();
		int k=0;
		for(int i=0;i<str.length();i++)
		{
			str1=str1+(char)((int)str.charAt(i)+k);	
			k++;
		}
		System.out.println("Encrypted text is: "+str1);
		String password="aman";
		System.out.println("Enter correct password to decrypt message");
		String pass=s.nextLine();
		if(pass.equals(password))
		{
			 k=0;
			for(int i=0;i<str.length();i++)
			{
				str2=str2+(char)((int)str1.charAt(i)-k);
				k++;
			}
			System.out.println("message="+str2);
		}
		else
		{
			System.out.println("Invalid password,message cannot be decrypted");
		}
	}

}
