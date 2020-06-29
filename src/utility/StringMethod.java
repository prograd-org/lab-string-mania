package utility;
public class StringMethod{
	//*Write a method to convert the String to lowercase.*
	private String input;
	
	/**
	 * @return the input
	 */
	public String getInput() {
		return input;
	}
	/**
	 * @param input the input to set
	 */
	public void setInput(String input) {
		this.input = input;
	}
	public String lower(String s) {
		return s.toLowerCase();
	}
	//*Write a method to convert the String to uppercase.*
	public String upper(String s) {
		return s.toUpperCase();
	}
	//*Write a method to find the first character in the string.*
	public String firstCharacter(String s) {
		char ch = s.charAt(0);
		return Character.toString(ch);
	}
	//*Write a method to return string length.*
	public String length(String s) {
		int len = s.length();
		return Integer.toString(len);
	}
	//*Write a method to trim the input string.*
	public String trim(String s) {
		return s.trim();
	}
	//*All the methods should return the value as string.*
}
// Type your code
