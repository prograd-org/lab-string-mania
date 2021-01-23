package utility;

// Type your code
public class StringAdvanceMethod{
	private String input1;
	private String input2;
	
	public String getInput1() {
		return input1;
	}
	public void setInput1(String input1) {
		this.input1 = input1;
	}
	public String getInput2() {
		return input2;
	}
	public void setInput2(String input2) {
		this.input2 = input2;
	}
	
	public String concat(String input1,String input2)
	{
		if(input1==null||input2==null)
		{
			return "";
		}
		return input1+input2;
	}
	
	public String split(String input1,String seperator)
	{
		String seperatedString=String.join("  ",input1.split(seperator));
		return seperatedString;
	}
	
	public String indexOf(String input1,String input2)
	{
		if(input1==null||input2==null||input1==""||input2=="")
		{
			return "Invalid input";
		}
		
		if(!input1.contains(input2))
		{
			System.out.printf("%s not present in %s",input2,input1);
			return "String not present";
		}
		return String.valueOf(input1.indexOf(input2));
	}
}