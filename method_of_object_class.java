class a
{
    a()
    {
        System.out.println("this is class a default constractor");
    }
    a(int a)
    {
        System.out.println("this is class a one int argument constractor");

    }
    a(String a)
    {
        System.out.println("this is class a string argument constractor");

    }
    a(double a)
    {
        System.out.println("this is class a one double argument constractor");
    }
}
class b extends a
{
    b()
    {
        System.out.println("this is class b default constractor");
    }
    b(int a)
    {
        System.out.println("this is class b one int argument constractor");

    }
    b(String a)
    {
        System.out.println("this is class b string argument constractor");

    }
    b(double a)
    {
        System.out.println("this is class b one double argument constractor");
    }
}

class method_of_object_class 
{
    public static void main(String[] args)
    {
        //b aa=new b();
        //b a1=new b(14);
        //b a2=new b("hello");
    }
}
