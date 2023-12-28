class statik_keyword
{
    int r_no;
    String name;
    static String cname="parangat";
    void ip(int x,String y)
    {
        r_no=x;
        name=y;
    }
    static void change()
    {
        cname="maharshi";
    }
    void op()
    {
        System.out.println("r_no = "+r_no);
        System.out.println("name = "+name);
        System.out.println("cname = "+cname);
    }
    public static void main(String[] args)
    {
        statik_keyword s=new statik_keyword();
        s.ip(23,"kinjal");
        s.op();
        change();
        s.op();
        

    }
}
