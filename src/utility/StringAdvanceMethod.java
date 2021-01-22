package utility;

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
	public String concat(String a, String b) {
		
		try {
			a=a+b;
			System.out.print(a);
		}catch(Exception e) {
			return "";
		}
		return a;
	}
	public String split(String a, String b) {
		String res[] = a.split(b);
		return res[0] + "  " + res[1];		
		
	}
	public String indexOf(String a,String b) {
		String x = String.valueOf(a.indexOf(b));
		return x;
	}
}
