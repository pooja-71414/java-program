import java.util.Scanner; 
public class con_state
{
	int a,b,c,i;
	@SuppressWarnings("resource")
	void ip()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter value of a = ");
		a=s.nextInt();
		System.out.print("enter value of b = ");
		b=s.nextInt();
		System.out.print("enter value of c = ");
		c=s.nextInt();
	}
	void op()
	{
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
		System.out.println("value of c = "+c);
	}
	void max()
	{
		if(a>b && a>c)
		{
			System.out.println("value of a is maximum--");	
		}
		else if(b>c)
		{
			if(b>a)
			{
				System.out.println("value of b is maximum--");	
			}			
		}
		else if(a==b && b==c)
		{
			System.out.println("value of a and b and c is equal");	
		}
		else
		{
			System.out.println("value of c is maximum--");	
		}
	}
	void min()
	{
		if(a<b && a<c)
		{
			System.out.println("value of a is minimum--");	
		}
		else if(b<a && b<c)
		{
			System.out.println("value of b is minimum--");	
		}
		else if(c<a && c<b)
		{
			System.out.println("value of c is minimum--");	
		}
		else
		{
			System.out.println("value of a and b and c is equal");	
		}
	}
	void odd_even()
	{
		if((a%2)==0)
		{
			System.out.println("value of a is even");	
		}
		else
		{
			System.out.println("value of a is odd");
		}
		if((b%2)==0)
		{
			System.out.println("value of b is even");	
		}
		else
		{
			System.out.println("value of b is odd");
		}
		if((c%2)==0)
		{
			System.out.println("value of c is even");	
		}
		else
		{
			System.out.println("value of c is odd");
		}
	}
	void print1to10()
	{
		for(i=1;i<=10;i++)
		{
			System.out.println("digit "+i);			
		}
	}
	public static void main(String[] args)
	{
		con_state p= new con_state();
		p.ip();
		System.out.println("");
		p.op();
		System.out.println("");
		p.max();
		System.out.println("");
		p.min();
		System.out.println("");
		p.odd_even();
		System.out.println("");
		System.out.println("print 1 to 10 digit");
		p.print1to10();				
	}
}