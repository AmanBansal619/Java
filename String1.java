import java.util.Scanner;
class String1
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
String str;
char arr[][]=new char[4][];
for(int i=0;i<arr.length;i++)
{
str=s.nextLine();
int l=str.length();
arr[i]=new char[l+1];
arr[i]=str.toCharArray();
}
for(char i[]:arr)
{
System.out.println(i);
}
}
}