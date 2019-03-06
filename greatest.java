import java.util.Scanner;
class greatest
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
System.out.println((a>=b && a>=c)?a:(b>=c && b>=a)?b:c);
}
}