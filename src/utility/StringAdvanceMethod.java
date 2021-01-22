package utility;

// Type your code
public class StringAdvanceMethod{

	
	private String input1;
	private String input2;
	public String getInput1() {
		return input1;
	}
	public void setInput1(String input1) {
		this.input1 = input1;
	}
	public String getInput2() {
		return input2;
	}
	public void setInput2(String input2) {
		this.input2 = input2;
	}
	public String concat(String input1, String input2) {
		
		
		return input1+input2;
	}
	public String split(String input1, String input2) {
		
		return input1.split(input2)[0]+" "+input1.split(input2)[1];
		
	}
	public String indexOf(String input1, String input2) {
		
		return String.valueOf(input1.indexOf(input2));
	}
	
	
	
	
}