package utility;
public class StringAdvanceMethod{
	//*Write a method to concatenate two strings.*
	private String input1;
	private String input2;
	
	/**
	 * @return the input1
	 */
	public String getInput1() {
		return input1;
	}
	/**
	 * @param input1 the input1 to set
	 */
	public void setInput1(String input1) {
		this.input1 = input1;
	}
	/**
	 * @return the input2
	 */
	public String getInput2() {
		return input2;
	}
	/**
	 * @param input2 the input2 to set
	 */
	public void setInput2(String input2) {
		this.input2 = input2;
	}
	public String concat(String s1,String s2) {
		return s1+s2;
	}
	//*Write a method to split the first string based on the second string value.*
	public String split(String s1,String s2) {
		return s1.split(s2, 1).toString();
	}
	//*Write a method to find the index value of the given character in the first string.*
	public String indexOf(String s1,String ch) {
		int i = s1.indexOf(ch);
		return Integer.toString(i);
	}
	//*All the methods should return the value as String.*
}
// Type your code
