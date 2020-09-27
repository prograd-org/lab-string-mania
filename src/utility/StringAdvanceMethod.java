package utility;

// Type your code

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

	
	
	public String concat(String input1,String input2) {
		
		String s = input1+input2;
		return s;
	}
	
	public String split(String input1, String input2) {
		String[] split = input1.split(input2);
		
		String s1= "";
		for(String s : split) {
			
			s1 += s+",";
		}
		return s1;
		
	}
	
	public String indexOf(String input1, String input2) {
		System.out.println(input1 + " " +input2);
		int s = input1.indexOf(input2.charAt(0));
		//System.out.println(s);
		return Integer.toString(s);

	}
	
}
