
public class StringManipulation {
	
	public static String trimAndConcat(String s1, String s2) {
		String finish="";
		finish = finish.concat(s1.trim());
		finish = finish.concat(s2.trim());
		
		
		return finish;
	}
	
	public static Integer getIndexOrNull (String str, char chr) {
		Integer num;
		num = str.indexOf(chr);
		return num;
	}
	
	public static Integer getIndexOrNull(String str, String str2) {
		Integer num;
		num = str.indexOf(str2);
		return num;
		
	}
	
	public static String concatSubstring(String str, int a, int b, String str2) {
		String str3;
		str3 = str.substring(a,b).concat(str2);
		return str3;
		
	}

}
