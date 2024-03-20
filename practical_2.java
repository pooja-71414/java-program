class SA{
    void area(double l)
    {
        System.out.println("area of square is "+ l*l);
    }
}
class CA extends SA
{
    void area(double l)
    {
        System.out.println("area of cube is "+ l*l*l);
    }
}
public class practical_2 {
    public static void main(String[] args) {
        double l;
        l=7;
        SA a = new SA();
        SA b = new CA();
        a.area(l);
        b.area(l);
    }    
}