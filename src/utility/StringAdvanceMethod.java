package utility;

public class StringAdvanceMethod{
	private String str1,str2;
	
	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public String Concatenate(String str1,String str2) {
		if (str1 == null || str2== null)
			return "Invalid String";
		return str1+str2;
	}
	
	public String Split(String str1,String str2) {
		if (str1.length() == 0 || str2.length()==0)
			return "Invalid String";
		String[] a=str1.split(str2);
		String s="";
		s=s+a[0]+"  "+a[1];
		return s;
	}
	
	public String IndexOf(String str1,String str2) {
		if (str1.length() == 0 || str2.length()==0)
			return "Invalid String";
		return Integer.toString(str1.indexOf(str2));
	}
}
