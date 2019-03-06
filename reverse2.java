import java.util.Scanner;
class reverse2
{
int a;
int rev()
{
int re=0;
while(a>0)
{
int r=a%10;
re=re*10+r;
a=a/10;
}
return re;
}
public static void main(String x[])
{
int b=23;
byte k=(byte)b;
Scanner s=new Scanner(System.in);
reverse2 o=new reverse2();
o.a=s.nextInt();
int c=o.rev();
System.out.println(c);
System.out.println(k);
}
}