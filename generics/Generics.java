class Generics 
{
	public static void main(String[] args)
	{
		StringGenerics str = new StringGenerics("sameer");
		System.out.println(str.returnValue());
	}
}

class StringGenerics 
{
	String name;
	
	StringGenerics(String name)
	{
		this.name = name;
	}
	
	public String returnValue()
	{
		return name;
	}
}

class StringGenerics 
{
	int name;
	
	StringGenerics(int name)
	{
		this.name = name;
	}
	
	public int returnValue()
	{
		return name;
	}
	
	
}class StringGenerics 
{
	String name;
	
	StringGenerics(String name)
	{
		this.name = name;
	}
	
	public String returnValue()
	{
		return name;
	}
}