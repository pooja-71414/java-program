public class constructor 
{
	constructor(int x,int y)
	{
		System.out.println("int addition is = "+(x+y));
	}
	constructor(char x,char y)
	{
		System.out.println("char addition is = "+(x+y));
	}
	constructor(String x,String y)
	{
		System.out.println("String addition is = "+(x+y));
	}
	public static void main(String args[])
	{
		/*int a,b;
		char c,d;
		String s,t;*/
		constructor a=new constructor(13,78);
		constructor a1=new constructor('9','5');
		constructor a2=new constructor("hiii","  viral");
	}
}