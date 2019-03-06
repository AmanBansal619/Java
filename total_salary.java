import java.util.Scanner;
public class total_salary{
	
	public static void main(String[] args) 
    {
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		char c=s.next().charAt(0);
		double hr,da,pf;
		int allow;
		hr=0.20*b;
		da=0.50*b;
		if(c=='A')
		{
			allow=1700;
		}
		else if(c=='B')
		{
			allow=1500;
		}
		else
		{
			allow=1300;
		}
		pf=0.11*b;
		double result=(b+hr+da+allow-pf);
        int r=(int)Math.round(result);
		System.out.println(r);

	}
}
