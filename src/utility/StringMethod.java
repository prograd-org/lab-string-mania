package utility;

public class StringMethod{
	String input;
	
	
	public String getInput() {
		return input;
	}
	
	public void setInput(String input) {
		this.input = input;
	}

	public String lower(String input) {
		return input.toLowerCase();
		
		
	}
	public String upper(String input) {
		return input.toUpperCase();
		
		
	}
	public String firstCharacter(String input) {
		
		char c=input.charAt(0);
		return String.valueOf(c);
		
		
	}
	public String length(String input) {
		int len=input.length();
		return String.valueOf(len);
		
		
	}
	public String trim(String input) {
		return input.trim();
		
		
	}




	
	
}