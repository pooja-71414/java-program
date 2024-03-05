class abc 
{
    synchronized void display(char c)
    {
        for (int i = 0; i <= 10; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }   
}
class A extends Thread
{
    public abc display;
    A(abc p)
    {
        this.display=p;
    }
    public void run()
    {
        display.display('*');
    }
}
class B extends Thread
{
    public abc display;
    B(abc p)
    {
        this.display=p;       
    }
    public void run()
    {
        display.display('#');
    }
}

public class SMT 
{
    public static void main(String[] args) 
    {
        abc p = new abc();
        A q = new A(p);
        B r = new B(p);

        q.start();
        r.start();
    }
}
