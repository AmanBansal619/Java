interface Alice{
    public void sender();
}
interface Bob extends Alice{
    public void receiver();
}
class Comm implements Bob {
    public void  sender() {
            System.out.println("Data Sender");
    }
    public void  receiver() {
            System.out.println("Data Receiver");
    }
}
public class test7
{
    public static void main(String ar[]) { 
         Comm com = new Comm();
         com.sender();
    }
}