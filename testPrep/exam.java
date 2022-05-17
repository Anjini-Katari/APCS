public class exam{

	public static void test(int[] arr, int y){
		if (arr.length > 1){
			arr[1] = arr[1] * 2;
		}	
		y = y * 2;
	}

	public static void main(String[] args){
		int[] s = {3, 4};
		int b = 4;
		test(s,b);
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(b);
	}

}
