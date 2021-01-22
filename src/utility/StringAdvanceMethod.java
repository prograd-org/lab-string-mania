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
	public String concat(String input1, String input2)
	{
		String s= input1+input2;
		return s;
	}
	public String split(String input1, String input2)
	{
		String[] res= input1.split(input2);
		StringBuffer sb = new StringBuffer();
		 for(int i=0;i<res.length;i++)
	       {
	    	   sb.append(res[i]);
	    	   sb.append(" ");
	       }
	       String str = sb.toString();
	       str.trim();
	      return str;
		
	}
	public String indexOf(String str, String s)
	{
		int i= str.indexOf(s);
		String res= Integer.toString(i);
		return res;
		
		    
	}
	
}
