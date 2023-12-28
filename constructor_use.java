public class constructor_use
{
	constructor_use(int x,int y)
	{
		System.out.println("int addition is = "+(x+y));
	}
	constructor_use(char x,char y)
	{
		System.out.println("char addition is = "+(x+y));
	}
	constructor_use(String x,String y)
	{
		System.out.println("String addition is = "+(x+y));
	}
	public static void main(String args[])
	{
		new constructor_use(13,78);
		new constructor_use('9','5');
		new constructor_use("hiii","  viral");
	}
}