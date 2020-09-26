package utility;

// Type your code
public class StringMethod


{

	String string;
	public String getInput() {
		return string;
	}
	public void SetInput(String string) {
		this.string = string;
	}
	public String toLowerCase(String string) {
		
		
		return string.toLowerCase();
		
	}
	public String toUpperCase(String string) {
		
		
		return string.toUpperCase();
			
		}
	
	public String firstChar(String string) {
		
		return String.valueOf(string.charAt(0));
		
	}
	public String stringLength(String string) {
		return String.valueOf(string.length());
		
	}
	public String trimString(String string) {
		
		return string.trim();
		
	}
	
	
}