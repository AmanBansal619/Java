public class keypadsolution 
{
	public static String[] keypad(int n)
    {
		if(n==0)
        {
          String s[]= {""};
          return s;
        }
        int r=n%10;
        n=n/10;
        if(n==0)
        {
        	char a[]=helper(r);
        	String y[]=new String[a.length];
        	for(int i=0;i<a.length;i++)
        	{
        		y[i]=String.valueOf(a[i]);
        		//System.out.println("y[i]="+y[i]);
        	}
        	return y;
        }
        String sm[]=keypad(n);
        char a[]=helper(r);
        String y[]=new String[a.length*sm.length];
        int k=0;
        for(int i=0;i<(sm.length);i++)
        {
        	for(int j=0;j<a.length;j++)
        	{
        		y[k]=String.valueOf(sm[i])+String.valueOf(a[j]);
        		k++;
        	}
        }
       // for(int i=0;i<y.length;i++)
        //System.out.println(y[i]);
//        String ans[]=new String[a.length];
//        for(int i=0;i<a.length;i++)
//        {
//          ans[i]=ans[i]+a[i];
//          //k++;
//        }
//      for(int i=0;i<a.length*a.length;i++)
//      {
//        for(int j=0;j<a.length;j++)
//        {
//          ans[i]=ans[i]+a[j];
//        } 
//      }
        return y;
      
	}
  public static char[] helper(int r)
  {
    if(r==2)
    {
      char a[]=new char[3];
      char c='a';
      for(int i=0;i<3;i++)
      {
        a[i]=c;
        c++;
      }
      return a;
    }
    else if(r==3)
    {
      char a[]=new char[3];
      char c='d';
      for(int i=0;i<3;i++)
      {
        a[i]=c;
        c++;
      }
      return a;
    }
    else if(r==4)
    {
      char a[]=new char[3];
      char c='g';
      for(int i=0;i<3;i++)
      {
        a[i]=c;
        c++;
      }
      return a;
    }
    else if(r==5)
    {
      char a[]=new char[3];
      char c='j';
      for(int i=0;i<3;i++)
      {
        a[i]=c;
        c++;
      }
      return a;
    }
    else if(r==6)
    {
      char a[]=new char[3];
      char c='m';
      for(int i=0;i<3;i++)
      {
        a[i]=c;
        c++;
      }
      return a;
    }
    else if(r==7)
    {
      char a[]=new char[4];
      char c='p';
      for(int i=0;i<4;i++)
      {
        a[i]=c;
        c++;
      }
      return a;
    }
    else if(r==8)
    {
      char a[]=new char[3];
      char c='t';
      for(int i=0;i<3;i++)
      {
        a[i]=c;
        c++;
      }
      return a;
    }
    else 
    {
      char a[]=new char[4];
      char c='w';
      for(int i=0;i<4;i++)
      {
        a[i]=c;
        c++;
      }
       return a;
    }
    
  }	
  public static void main(String args[])
  {
	  String as[]=keypad(234);
	  for(int i=0;i<as.length;i++)
		  System.out.println(as[i]);
	  
  }

}
