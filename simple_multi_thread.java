class A extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 11; i++) 
        {
            System.out.println("A/run="+i);
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 11; i++) 
        {
            System.out.println("B/run="+i);
        }
    }
}
public class simple_multi_thread 
{
    public static void main(String[] args) throws InterruptedException 
    {
        A aa = new A();
        B bb = new B();
        aa.isAlive();
        aa.join();
        aa.start();
        bb.start();
    }
}
