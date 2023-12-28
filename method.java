public class method 
{
	void sum(int x,int y)
	{
		System.out.println("int addition is = "+(x+y));
	}
	void sum(char x,char y)
	{
		System.out.println("char addition is = "+(x+y));
	}
	void sum(String x,String y)
	{
		System.out.println("String addition is = "+(x+y));
	}
	public static void main(String args[])
	{
		/*int a,b;
		char c,d;
		String s,t;*/
		method a=new method();
		a.sum(456,576);
		a.sum('f','g');
		a.sum("hello","  maja ma--");
	}
}