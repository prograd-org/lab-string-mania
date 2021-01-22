package utility;

public class StringMethod{
	
	String input;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String lower(String s) {
		return s.toLowerCase();
	}
	
	public String upper(String s) {
		return s.toUpperCase();
	}
	
	public String firstCharacter(String s) {
		return String.valueOf(s.charAt(0));
	}
	public String length(String s) {
		
		return String.valueOf(s.length());
	}
	public String trim(String s) {
		return s.trim();
	}
}
