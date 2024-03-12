public class string_fun 
{
    public static void main(String[] args) 
    {
        String s= "hello! ,my name is pooja--";
        System.out.println("string s is = "+s);
        System.out.println("string s length is = "+s.length());
        System.out.println("string s charAt(4) is = "+s.charAt(4));
        System.out.println("string s codePointAt(7) is = "+s.codePointAt(7));
        System.out.println("string s codePointBefore(5) is = "+s.codePointBefore(5));
        System.out.println("string s codePointCount(2,9) is = "+s.codePointCount(2,9));
        System.out.println("string s compareTo(\"my name is kinjal\") is = "+s.compareTo("my name is kinjal"));
        System.out.println("string s hashCode() is = "+s.hashCode());
        System.out.println("string s concat(\"and your name is?\") is = "+s.concat("and your name is?"));
        // System.out.println("string s indent(7) is = "+s.indent(7));
        System.out.println("string s indexOf(\"name\") is = "+s.indexOf("name"));
        System.out.println("string s indexOf(\'m\') is = "+s.indexOf('m'));
        System.out.println("string s intern() is = "+s.intern());
        // System.out.println("string s repeat(3) is = "+s.repeat(3));
        System.out.println("string s replace('a','x') is = "+s.replace('a','x'));
    
    }
}
