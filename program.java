
//run time enter value of two variable and print using another 
//class and arithmetic operator use using this variable 


import java.util.Scanner; 
class define
{
	int a,b;
	void op()
	{
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
	}
	void operator_use()
	{
		System.out.println("addition of a and b = "+(a+b));
		System.out.println("substraction of a and b = "+(a-b));
		System.out.println("multiplication of a and b = "+(a*b));
		System.out.println("division of a and b = "+((float)(a/b)));
		System.out.println("reminder of a and b = "+(a%b));
	}
}
public class program
{
	public static void main(String[] args)
	{
		define d=new define();
		System.out.print("enter value of a = ");
		Scanner s=new Scanner(System.in);
		d.a=s.nextInt();
		System.out.print("enter value of b = ");
		d.b=s.nextInt();
		d.op();
		d.operator_use();
		
	}
}




/*
//run time enter value and print


import java.util.Scanner; 
public class program
{
	public static void main(String[] args)
	{
		int a,b;
		System.out.print("enter value of a = ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.print("enter value of b = ");
		b=s.nextInt();
		System.out.println("value of b = "+a);
		System.out.println("value of b = "+b);
	}
}*/