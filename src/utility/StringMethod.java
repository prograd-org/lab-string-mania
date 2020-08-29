package utility;

// Type your code
public class StringMethod {
	private String input1;
	private String input2;

	public String getInput() {
		return input1;
	}

	public void setInput(String input1) {
		this.input1 = input1;
	}

	// convert the String to lower case
	public String lower(String s) {
		return s.toLowerCase();
	}

	// convert the String to Upper case
	public String upper(String s) {
		return s.toUpperCase();
	}

	// Find the first character in the string

	public String firstCharacter(String s) {
		return s.substring(0, 1);
	}

	// find the length of string

	public String length(String s) {
		return String.valueOf(s.length());
	}

	// to trim the string
	public String trim(String s) {
		return s.trim();
	}
}