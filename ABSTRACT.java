abstract class abs
{
    abstract void print();
    void display()
    {
        System.out.println("in abstract class");
    }
}
class abs_use extends abs
{
    void print()
    {
        System.out.print("print abstract method");
    }
}
class ABSTRACT
{
    public static void main(String[] args)
    {
        abs_use a=new abs_use();
        a.display();
        a.print();
    }
}