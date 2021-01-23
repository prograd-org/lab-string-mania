package utility;

public class StringMethod{
	
	private String input;
	
	public void setInput(String input)
	{
		this.input=input;
	}
	
	public String getInput()
	{
		return input;
	}
	
	public String lower(String string)
	{
		if( string == "" || string == null )
		{
			System.out.println("Invalid input");
			return "";
		}
		
		return string.toLowerCase();
	}
	
	public String upper(String string)
	{
		if( string == "" || string == null )
		{
			System.out.println("Invalid input");
			return "";
		}
		
		return string.toUpperCase();
	}
	public String firstCharacter(String string)
	{
		if( string == "" || string == null )
		{
			System.out.println("Invalid input");
			return "";
		}
		
		return String.valueOf(string.charAt(0));
	}
	public String length(String string)
	{
		if(string == null )
		{
			System.out.println("Invalid input");
			return "";
		}
		
		return String.valueOf(string.length());
	}
	public String trim(String string)
	{
		if( string == null )
		{
			System.out.println("Invalid input");
			return "";
		}
		return string.trim();
	}
}
