//Return true if the string "cat" and "dog" appear the same number of times in the given string.

public class catDog {
	public static boolean catDog(String str) {
		int lower = 0, higher = 3, len = str.length(), catCounter = 0, dogCounter = 0;
		String cat = "cat", dog = "dog";

		while (higher <= len) {
			String catSub = str.substring(lower, higher);
                        String dogSub = str.substring(lower, higher);
			if (catSub.equals(cat)) {
				catCounter += 1;
			}
			if (dogSub.equals(dog)) {
				dogCounter += 1;
			}
			lower += 1;
			higher += 1;
		}
		System.out.println(dogCounter);
                System.out.println(catCounter);

		return (catCounter == dogCounter);
	}	


	public static void main(String [] args) {
		System.out.println(catDog("catdog"));
                System.out.println(catDog("catcat"));
                System.out.println(catDog("dogdog"));

	}
}
