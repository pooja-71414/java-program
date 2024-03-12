//import java.util.Collection;
import java.util.ArrayList;
class arraylist 
{
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args)
    {
        ArrayList a=new ArrayList();
        a.add(100);
        a.add(200);
        a.add("hello");
        System.out.println("(add)a="+a);

        System.out.println("a.get(0)"+a.get(0));
        System.out.println("a.get(1)"+a.get(1));
        System.out.println("a.get(2)"+a.get(2));

        ArrayList b=new ArrayList();

        b.add(567);
        b.add(200);
        b.add("hiii");
        
        System.out.println("(add)b="+b);
        
        a.remove(b);
        System.out.println("(removea)="+a);
        a.removeAll(b);
        System.out.println("(removeAll)a="+a);
        
        //a.clear();
        //System.out.println("(clear)a="+a);
        a.contains(b);
        System.out.println("a.contains(b)="+a);
        a.clone();
        System.out.println("a.clone()="+a);
        a.containsAll(b);
        System.out.println("a.containsAll(b)="+a);
        a.equals(b);
        System.out.println("a.equals(b)="+a);
        // a.getFirst();
        // System.out.println("a.getFirst()="+a);
        // a.getLast();
        // System.out.println("a.getLast()="+a);


    }      
}