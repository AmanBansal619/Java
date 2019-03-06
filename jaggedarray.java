import java.util.Scanner;
class jaggedarray
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int a[][]=new int[4][];
int k=1;
for(int i=0;i<a.length;i++)
{
    a[i]=new int[k];
    k=k+2;
}
for(int i=0;i<a.length;i++)
{
    int count=3;
    for(int j=0;j<a[i].length;j++)
    {
        a[i][j]=count;
        count+=3;
     }
}
for(int i[]:a)
{
    for(int f:i)
    {
        System.out.print(f+" ");
     }
     System.out.println();
}

}
}