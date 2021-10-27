/*
TNPG: Vegan Dragons (Andrew Piatesky, Anjini Katari, Courtney Huang) and Watson
APCS
HW 25 -- Do I repeat myself?
2021-10-27
time spent:
*/

public class Repeater {

	public static String fenceW(int numPosts) {
		String fence = "";
		int counter = 1;
		while (numPosts > 0 && counter <= numPosts) {
			if (counter < numPosts) {
				fence += "|--";
			}
			else {
				fence += "|";
			}
			counter += 1;
		}
		return fence;
	}

	public static String fenceR(int numPosts) {
                String fence = "";
                int counter = 1;

                if (numPosts > 0 && numPosts >= counter) {
                        fence += "|--";
                        fenceR(numPosts - 1);
                } 
                else {
                        fence += "|";
		}
                return fence;
	}

	public static void main(String [] args) {
	//while cases
		System.out.println("While loop:");
		System.out.println(fenceW(1));
		System.out.println(fenceW(0));
                System.out.println(fenceW(-1));
                System.out.println(fenceW(3));

	//recursive cases
                System.out.println("Recursive Reduction:");
                System.out.println(fenceW(1));
                System.out.println(fenceW(0));
                System.out.println(fenceW(-1));
                System.out.println(fenceW(3));

	}
}

//takes non-negative integer posts, and returns a String rep of a fence
// with the specified number of posts. Employs a while loop.

