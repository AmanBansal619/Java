abstract class abc
{
    abstract void firstMethod(); 
    void secondMethod()
    {
        System.out.println("SECOND");
         
        firstMethod();
    }
} 
abstract class bc extends abc
{ 
    void firstMethod()
    {
        System.out.println("FIRST");         
        thirdMethod();
    }     
    abstract void thirdMethod();
} 
class cb extends bc
{  
    void thirdMethod()
    {
        System.out.println("THIRD");
    }
} 
public class tets6
{
    public static void main(String[] args)
    {
        cb c = new cb();         
        c.firstMethod();         
        c.secondMethod();         
        c.thirdMethod();
    }
}