public class endOther {
	//Given two strings, return true if either of the strings appears at the very 
	//end of the other string, ignoring upper/lower case differences, should not be "case sensitive
	//Note: str.toLowerCase() returns the lowercase version of a string.
	
	public static boolean endOther(String a, String b) {
		String lowercaseA = a.toLowerCase();
		String lowercaseB = b.toLowerCase();
		int lenA = lowercaseA.length(), lenB = lowercaseB.length();
		int lowerA = 0, higherA = (lenB + 1);
		int lowerB = 0, higherB = (lenA + 1);

		if (lenA >= lenB) {
			String subA = lowercaseA.substring((lenA - lenB), lenA);
			System.out.println(subA);
			System.out.println(lenA - lenB);
			System.out.println(lenA + 1);
			return (subA.equals(lowercaseB));
		}
		else {
			String subB = lowercaseB.substring((lenB - lenA), lenB);
			System.out.println(subB);
			System.out.println(lenB - lenA);
			System.out.println(lenB + 1);
			return (subB.equals(lowercaseA));
		}
	}
	public static void main(String [] args) {
		System.out.println(endOther("Hiabc", "abc"));
		System.out.println(endOther("AbC", "HiaBc"));
    	System.out.println(endOther("abc", "abXabc"));
		System.out.println(endOther("abc", "abXadc"));

	}
}
