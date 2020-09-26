package utility;

// Type your code
public class StringMethod


{

	String string;
	public String getInput() {
		return string;
	}
	public void setInput(String string) {
		this.string = string;
	}
	public String lower(String string) {
		
		
		return string.toLowerCase();
		
	}
	public String upper(String string) {
		
		
		return string.toUpperCase();
			
		}
	
	public String firstCharacter(String string) {
		
		return String.valueOf(string.charAt(0));
		
	}
	public String length(String string) {
		return String.valueOf(string.length());
		
	}
	public String trim(String string) {
		
		return string.trim();
		
	}
	
	
}