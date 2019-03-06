class AB
{
	public void doA()
	{
		BC b=new BC();
		b.dobB();
		System.out.print("doA");
	}
}
class BC
{
	public void dobB()
	{
		CA c=new CA();
		c.doC();
		System.out.print("doB");
	}
}
class CA
{
	public void doC()
	{
		if(true)
			throw new NullPointerException();
		System.out.print("doC");
}
}
class test8
{
    public static void main(String ar[]) { 
         try
         {
        	 AB a=new AB();
        	 a.doA();        	 
         }catch(Exception ex) {
        	 System.out.print("error");
         }
         String s1 = "Hello";
         String s2 = s1.replace('l','w');
         System.out.println(s2);
         int arr[]=new int[5];
         for(int i=0;i<5;i++)
         {
        	 System.out.println(arr[i]);
         }
    }
}
