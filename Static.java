public class Static 
{
		static int a,b;
		static
		{
			a=5;
			b=6;
		}
		public static void main(String x[])
		{
			System.out.print(a+" "+b);
		}
		static
		{
			a=10;
			b=7;
		}
		static
		{
			a=14;
			b=15;
		}
}
