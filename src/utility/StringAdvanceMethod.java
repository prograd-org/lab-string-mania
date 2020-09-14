package utility;

import java.util.Arrays;

// Type your code
public class StringAdvanceMethod{
	private String input_1;
	private String input_2;
	
	public String getInput_1() {
		return input_1;
	}
	public void setInput_1(String input_1) {
		this.input_1 = input_1;
	}
	public String getInput_2() {
		return input_2;
	}
	public void setInput_2(String input_2) {
		this.input_2 = input_2;
	}
	
	public String concat(String input_1, String input_2) {

		return input_1+" "+input_2;
	}
	
	public String split(String input_1, String input_2) {
		
		String[] strippedString = input_1.split(input_2);
		
		StringBuilder string = new StringBuilder();
		
		Arrays.stream(strippedString).forEach(str -> string.append(str+" "));
		
		return string.toString().trim();
	}
	
	public String indexOf(String input_1, String input_2) {
		
		return Integer.toString(input_1.indexOf(input_2));
	}
}