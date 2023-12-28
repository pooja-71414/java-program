class a 
{
    int x=10;
    void ip()
    {
        System.out.println("x="+x);
    }    
}
class b extends a
{
    int y=20;
    void ip()
    {
        super.ip();
        System.out.println("y="+y);
    }
}
class method_overriding 
{
    public static void main(String[] args)
    {
        b bb=new b();
        bb.ip();
    }    
}
