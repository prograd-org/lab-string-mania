package utility;

public class StringMethod {
	private String str;
	
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String ToLower(String str) {
		if (str.length() == 0)
			return "Invalid String";
		return str.toLowerCase();
	}
	
	public String ToUpper(String str) {
		if (str.length() == 0)
			return "Invalid String";
		return str.toUpperCase();
	}
	
	public String FirstCharacter(String str) {
		return Character.toString(str.charAt(0));
	}
	
	public String StringLength(String str) {
		if (str.length() == 0)
			return "0";
		return Integer.toString(str.length());
	}
	
	public String Trim(String str) {
		if (str.length() == 0)
			return "Invalid String";
		return str.trim();
	}
}
