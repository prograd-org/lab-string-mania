package utility;

// Type your code

public class StringMethod{
	
	String input;

	

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String lowercase(String input){
		String s1 = input.toLowerCase();
		return s1;
	}
	
	public String uppercase(String input) {
		String s1 = input.toUpperCase();
		return s1;
		
	}
	
	public String firstCharacter(String input) {
		String c = input.charAt(0)+"";
		return c;
		
	}
	
	public String length(String input) {
		
		int s1= input.length();
		return s1+"";
	}
	
	public String trim(String input) {
		String s1 = input.trim();
		return s1;
	}
}
