/* Given 2 arrays of ints, a and b, return true if they have the same 
first element or they have the same last element. Both arrays will be 
length 1 or more.

commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
*/

public class commonEnd {
  public static boolean commonEnd(int[] a, int[] b) {
    int alength = a.length;
    int blength = b.length;
    if (a[0] == b[0] || a[alength - 1] == b[blength -1] ) {
      return true;
    }
    else {
      return false;
    }
  } // end method

  public static void main (String[] args) {
    System.out.println(commonEnd(new int[] {1, 2, 3}, new int[] {7, 3}));
    System.out.println(commonEnd(new int[] {1, 2, 3}, new int[] {7, 3, 2}));
    System.out.println(commonEnd(new int[] {1, 2, 3}, new int[] {1, 3}));
  } // end main
  
} // end class
