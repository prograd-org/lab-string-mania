package utility;

import java.util.Arrays;

public class StringAdvanceMethod{
	
	String input1;
	String input2;
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
	
	public String concat(String s1, String s2) {
		try {
			s1.concat(s2).toString();
			
		}
		catch(Exception e){
			return "";
		}
		return s1.concat(s2).toString();
	}
	
	public String split(String s1, String s2) {
		String[] s = s1.split(s2);
		String s3 = "  ".concat(s[1]);
		String ot = s[0].concat(s3);
		System.out.print(ot);
		return ot;
	}
	
	public String indexOf(String s1, String s2) {
		return String.valueOf(s1.indexOf(s2));
	}
}