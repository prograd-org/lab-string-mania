package utility;

// Type your code
public class StringMethod{

	
	private String input;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}


	//method to convert the String to lowercase	
	public String lower(String input){
		return input.toLowerCase();
		
	}


	public String upper(String input) {
		// TODO Auto-generated method stub
		return input.toUpperCase();
	}

	//method to find the first character in the string.
	public String firstCharacter(String input) {
		// TODO Auto-generated method stub
		char firstchar = input.charAt(0);
		return Character.toString(firstchar);
	}
	//method to return string length.
	public String length(String input) {
		// TODO Auto-generated method stub
		int len = input.length();
		return Integer.toString(len);
	}
	//method to trim the input string.
	public String trim(String input) {
		// TODO Auto-generated method stub
		return input.trim();
	}
}