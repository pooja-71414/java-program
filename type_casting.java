class type_casting 
{
    public static void main(String[] args) 
    {
        //implicit type casting-------
        int i = 66;
        double d=i;
        System.out.println("(for implicit)int i = "+i);    
        System.out.println("(for implicit)double {d = i} = "+d);   
        //explicit type casting-------
        double d1=234.85;
        int i1=(int)d1;
        System.out.println("(for explicit)double d1 = "+d1);    
        System.out.println("(for explicit)int { i1 = (int) d1 } = "+i1);   
        
    }    
}
