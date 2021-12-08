public class arraylentest {
	public static String singArray ( int[] a ) {
  		for (int i = 0; i < a.length; i += 1) {
				System.out.println(a[i]);
			}
		return "yay";
  	}

	public static String print1( int[][] b ) {
		System.out.println(b.length);
		return "whee";
  	}

	public static void main(String[] args) {
		int [][] m2 = { {2,4,6}, {3,5,7} };
		int [] m = {2, 4, 5};
		singArray(m);
		print1(m2);
	}
 }
