public class countCode {

//Return the number of times that the string "code" appears anywhere in the given string
//except we'll accept any letter for the 'd', so "cope" and "cooe" count.


	public static int countCode(String str) {
		int lower = 0, mid = 2, higher = 3, len = str.length(), codeCounter = 0;
		String beg = "co", end = "e";
		while ((higher + 1) <= len) {
			String strSub = str.substring(lower, mid);
			System.out.println(strSub);
			if (beg.equals(strSub)) {
				String strSub2 = str.substring(higher, (higher + 1));
				System.out.println(strSub2);
				if (end.equals(strSub2)) {
					codeCounter += 1;
				}
			}
			higher += 1;
			mid += 1;
			lower += 1;
		}
  		return codeCounter;	
	}
	public static void main(String [] args) {
		System.out.println(countCode("aaacodebbb"));
		System.out.println(countCode("codexxcode"));
    	System.out.println(countCode("cozexxcope"));

	}
}
