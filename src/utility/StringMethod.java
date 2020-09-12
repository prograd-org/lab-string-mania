package utility;

// Type your code

public class StringMethod {
	
	private String input;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}


	
	public String lower(String input) {
		// will change to lowercase 
		return input.toLowerCase();
	}
	
	public String upper(String input) {
		// will change to uppercase
		return input.toUpperCase();
	}
	
    public String firstCharacter(String input) {
    	// will return the first character in string 
		
		return Character.toString(input.charAt(0));
	}
    
    public String length(String input) {
    	// will return the length of string
    	
    	return Integer.toString(input.length());
    }
    
    public String trim(String input) {
    	// it will removing the trailing spaces from start and end of string.
    	return input.trim();
    }
	
	
}