class outer_inner 
{
    int a=10;
    public class inner 
    {
        int b=20;
        outer_inner o1=new outer_inner();
        public inner()
        {
            super();
            System.out.println("in inner calss a = "+o1.a);
            System.out.println("in inner calss b = "+b);

        }
        
        
    }
    public static void main(String[] args) 
    {
        outer_inner o = new outer_inner();
        System.out.println("in main method before override a = "+o.a);
        o.a=100;
        System.out.println("in main method after override a = "+o.a);
        
        System.out.println();    
    }
}