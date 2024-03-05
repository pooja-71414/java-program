class A implements Runnable
{
    public void run()
    {
        for(int i=0; i<11; i++)
        {
            System.out.println("thread a : "+i);
        }
    }    
}
class B implements Runnable
{
    public void run()
    {
        for(int i=0; i<11; i++)
        {
            System.out.println("thread B : "+i);
        }
    }    
}
public class runn {
    public static void main(String[] args) 
    {
        A aa = new A();
        Thread t1 = new Thread(aa);
        t1.start();
        B bb = new B();
        Thread t2 = new Thread(bb);
        t2.start();
    }
}
