import java.util.Scanner;
class check
{
int a;
static int b;
static int count;
int sum()
{
count++;
return a+b;
}
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
check o=new check();
System.out.println(o.a);
System.out.println(check.b);
System.out.println(b);
System.out.println(o.b);
o.a=s.nextInt();
o.b=s.nextInt();
int c=o.sum();
System.out.println(c);
System.out.println(count);
}
}