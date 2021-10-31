public class countHi {
//Return the number of times that the string "hi" appears anywhere in the given string.

// counter2 -> num of hi

	public static int countHi(String str) {
		int lower = 0, higher = 2, counter1 = 0, len = str.length(), hiCounter = 0;
		String hi = "hi";

		while (higher <= len) {
			String strSub = str.substring(lower, higher);
			System.out.println(strSub);
			if (hi.equals(strSub)) {
				hiCounter += 1;
			}
		higher += 1;
		lower += 1;
		}
  	return hiCounter;
	}
	
	public static void main(String [] args) {
		System.out.println(countHi("hiHIhi"));
	}
}
