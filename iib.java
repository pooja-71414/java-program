class iib 
{
	iib()
	{
		System.out.println("---this is constructor in class---");		
	}
	
	{
		System.out.println("---this is IIB(instance initialization block) in class---");	
	}
	public static void main(String[] args)
	{
		iib i=new iib();
	}
}