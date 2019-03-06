public class printkeypad
{
	public static void printKeypad(int input)
    {
      print1(input,"");
      return;
	}
    public static void print1(int input,String output)
    {
      if(input==0)
      {
        System.out.println(output);
        return;
      }
      String a[]=alpha(input%10);
      print1(input/10,output);
      
      return;
    }
    public static String[] alpha(int r)
    {
      if(r==2)
      {
        String a[]={"a","b","c"};
        return a;
      }
      else if(r==3)
      {
        String a[]={"d","e","f"};
        return a;
      }
      else if(r==4)
      {
        String a[]={"g","h","i"};
        return a;
      }
      else if(r==5)
      {
        String a[]={"j","k","l"};
        return a;
      }
      else if(r==6)
      {
        String a[]={"m","n","o"};
        return a;
      }
      else if(r==7)
      {
        String a[]={"p","q","r","s"};
        return a;
      }
      else if(r==8)
      {
        String a[]={"t","u","v"};
        return a;
      }
      else 
      {
        String a[]={"w","x","y","z"};
        return a;
      }
    }
    public static void main(String args[])
    {
    	printKeypad(234);
    }
}
