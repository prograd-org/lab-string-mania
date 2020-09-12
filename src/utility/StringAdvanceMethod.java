package utility;


// Type your code
import java.util.Arrays;


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

	
	public String concat(String input1, String input2) {
		// will join two strings
		return input1+" "+input2;
	}
	
	public String split(String input1, String input2) {
		// will strip the first string based on the second string value
		
		String[] strippedString = input1.split(input2);
		
		StringBuilder string = new StringBuilder();
		
		Arrays.stream(strippedString).forEach(str -> string.append(str+" "));
		
		return string.toString().trim();
	}
	
	public String indexOf(String input1, String input2) {
		
		// will join two strings
		return Integer.toString(input1.indexOf(input2));
	}
	
}
