package utility;
public class StringMethod{
	private String input;
	
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String lower(String str)
	{
		str= str.toLowerCase();
		return str;
	}
	public String upper(String str)
	{
		str=str.toUpperCase();
		return str;
	}
	public String firstCharacter(String str)
	{
		char x= str.charAt(0);
	    String myStr = Character.toString(x);
		return myStr;
	}
	public String length(String str)
	{
		int len=str.length();
		String s=Integer.toString(len);
		return s;
	}
	public String trim(String str)
	{
		str=str.trim();
		return str;
	}
}