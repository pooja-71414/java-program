import java.util.Scanner; 
public class Switch
{
	int a,b,ch;
	Scanner s=new Scanner(System.in);
	void ip()
	{
		System.out.print("enter value of a = ");
		a=s.nextInt();
		System.out.print("enter value of b = ");
		b=s.nextInt();
		
	}
	void op()
	{
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
	}
	
	public static void main(String[] args)
	{
		Switch p= new Switch();
		p.ip();
		System.out.println("");
		p.op();
		System.out.println("");
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.modulo(reminder)");
		System.out.println("");
		System.out.print("enter your choice = ");
		p.ch=p.s.nextInt();
		System.out.println("");
		switch(p.ch)
		{
			case 1:
				System.out.println("addition of "+p.a+" and "+p.b+" = "+(p.a+p.b));
				break;
			case 2:
				System.out.println("substraction of "+p.a+" and "+p.b+" = "+(p.a-p.b));
				break;
			case 3:
				System.out.println("multiplication of "+p.a+" and "+p.b+" = "+(p.a*p.b));
				break;
			case 4:
				System.out.println("division of "+p.a+" and "+p.b+" = "+((double)(p.a/p.b)));
				break;
			case 5:
				System.out.println("modulo(reminder) of "+p.a+" and "+p.b+" = "+(p.a%p.b));
				break;
			default:
				System.out.println("wrong choice");
				break;
		}
	}
}