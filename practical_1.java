class payment
{
    double cost,tex,discount;
    public void value(double c,double t,double d)
    {
        cost = c;
        tex = t;
        discount = d;
    }
    public void pay()
    {     
        System.out.println("cost = "+cost);
        System.out.println("tex = "+tex);
        System.out.println("discount = "+discount);   
        cost=cost+((cost*tex)/100)-((cost*discount)/100);
        System.out.println("payment = "+cost);
        System.out.println("");
    }
}
public class practical_1 {
    public static void main(String[] args) {
        payment p = new payment();
        p.value(500, 5, 10);
        p.pay();
        p.value(1000, 7.5, 15);
        p.pay();
        p.value(1500, 10, 17.2);
        p.pay();
        
    }
}
