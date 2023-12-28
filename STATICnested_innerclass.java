class outer
{
    int x,y;
    static class inner
    {
        static void swap(outer o)
        {
            int temp=o.x;
            o.x=o.y;
            o.y=temp;
        }
    }
    outer(int a,int b)
    {
        x=a;
        y=b;
    }
    //inner i=new inner();
    void op()
    {
        System.out.println("before swap");
        System.out.println("x="+x+"\ny="+y);
        inner.swap(this);
        System.out.println("after swap");
        System.out.println("x="+x+"\ny="+y);
    }
}
class STATICnested_innerclass 
{
    public static void main(String[] args)
    {
        outer o1=new outer(10, 20);
        o1.op();
    }
}
