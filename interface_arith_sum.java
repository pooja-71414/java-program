interface inter1
{
    final int a=10 , b=20;
    void addition();
    void substraction();
    void multiplication();
    void division();
    void modulo();
}
interface inter2 extends inter1
{
    void op();
}
class inter implements inter2
{
    public void addition()
    {
        System.out.println("addition of "+a+" and "+b+" = "+(a+b));
    }
    public void substraction()
    {
        System.out.println("substraction of "+a+" and "+b+" = "+(a-b));
    }
    public void multiplication()
    {
        System.out.println("multiplication of "+a+" and "+b+" = "+(a*b));
    }
    public void division()
    {
        System.out.println("division of "+a+" and "+b+" = "+(a/b));
    }
    public void modulo()
    {
        System.out.println("modulo of "+a+" and "+b+" = "+(a%b));
    }
    public void op()
    {
        System.out.println("a="+a+"\nb="+b);
    }
}
class interface_arith_sum 
{
    public static void main(String[] args)
    {
        inter i=new inter();
        i.op();
        System.out.println("---arithmetic operator used---");
        i.addition();
        i.substraction();
        i.multiplication();
        i.division();
        i.modulo();
    }    
}