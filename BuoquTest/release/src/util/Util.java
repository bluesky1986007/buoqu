package util;

public class Util {
	
	public static String stringTrim(String s) {
		if (s == null)
			return "";
		return s.trim();
	}
	
	public static String nullTransfer(String str){		
		if (str == null) {
			return "";
		}		
		return str;
	}

}
