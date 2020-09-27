package utility;

// Type your code
public class StringMethod {
	public String upper(String input) {
		// TODO Auto-generated method stub
		return input.toUpperCase();
	}

	public String firstCharacter(String input) {
		// TODO Auto-generated method stub
		return input.substring(0,0+1);
	}

	public String length(String input) {
		// TODO Auto-generated method stub
		int  length = input.length();
		String le = Integer.toString(length);
		return le;	
	}
	public String trim(String input) {
		// TODO Auto-generated method stub
		return input.trim();
	}	public String lower(String input) {
		// TODO Auto-generated method stub
		return input.toLowerCase();
	}
}