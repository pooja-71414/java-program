class varargs 
{
	int sum(int... number)
	{
		int res=0;
		for(int i : number)
		{
			res=res+i;
		}
		return res;
	}
	public static void main(String[] args)
	{
		varargs v=new varargs();
		System.out.println("sum of given numbers(3,89,45,34) is = "+v.sum(3,89,45,34));
	}
}