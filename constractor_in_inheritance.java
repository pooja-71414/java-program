class a 
{
    int x,y;
    a()
    {}  
    a(int a,int b)
    {
        x=a;
        y=b;
    } 
}
class b extends a
{
    b()
    {}
    b(int a,int b)
    {
        x=a;
        y=b;
    }
    void print()
    {
        System.out.println("x="+x+"\ny="+y);
    } 
}

class constractor_in_inheritance 
{    
    public static void main(String[] args)
    {
        b b1=new b(10,20);
        b1.print();
    }
}
